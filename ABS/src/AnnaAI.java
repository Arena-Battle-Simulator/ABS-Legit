/*
 * This is the main AI program, called "AnnaAI" to distinguish it from the half-complete AIs written by other people
 * The constructor should be called once at the beginning of each battle,
 * and every time a new move choice is needed,
 * call the 'move' method on the AI object.
 * 
 * The constructor's arguments are: 
 * difficulty (1,2, or 3), AI index, move IDs in int array, total AI H, total AI S, total P H, total P S
 * 
 * The 'move' method returns a single integer representing the number of the move chosen.
 * Move's arguments are:
 * remainder AI H, remainder P H, remainder AI S, remainder P S
 * 
 * This file works in conjunction with AImove.java,
 * which stores information about the individual moves as objects.
 */
public class AnnaAI {
	
	int levelOfDifficulty;
	int aiIndex;
	int[] moveNumbers;
	int totalHealthAI;
	int totalStaminaAI;
	int totalHealthPlayer;
	int totalStaminaPlayer;
	AImove [] moveObjects;

	
	
	public AnnaAI (
			int levelOfDifficulty1/*1,2, or 3*/, 
			int aiIndex1,
			int[] moveNumbers1 /*e.g. 13, 71 54 (6 of them)*/,
			int totalHealthAI1,
			int totalStaminaAI1,
			int totalHealthPlayer1,
			int totalStaminaPlayer1		
			)
	{
	//assign into vars for object	
		moveObjects = new AImove [6];
		
		levelOfDifficulty = levelOfDifficulty1;
		aiIndex = aiIndex1;
		
		moveNumbers = new int [6];
		for (int i = 0; i<6; i++)
		{
			moveNumbers[i] = moveNumbers1[i];
		}
		totalHealthAI = totalHealthAI1;
		totalStaminaAI = totalStaminaAI1;
		totalHealthPlayer = totalHealthPlayer1;
		totalStaminaPlayer = totalStaminaPlayer1;
	}
	
	public int move (
			int remainderHealthAI,
			int remainderHealthPlayer,
			int remainderStaminaAI,
			int remainderStaminaPlayer
			)//returns number of the move chosen
	{
		int [][] movesInfo = new int [6][];
		for (int i = 0; i <6; i++)
		{
			//shift around order/inclusion of parameters depending on Justin method
			//make sure the below assignment works
			movesInfo [i] = MoveCalculation.newStats(moveNumbers[i], remainderHealthPlayer, remainderStaminaPlayer, remainderHealthAI, remainderStaminaAI,false, aiIndex/*some AI index thing*/ ); 
			
			
			moveObjects [i] = new AImove(movesInfo[i], moveNumbers[i], remainderHealthAI, remainderHealthPlayer, remainderStaminaAI, remainderStaminaPlayer);
		}
		
		//get info about each of the 6 moves individually (pass move number, all health info, all stamina info)
		//leave field in object for score (currently blank)
		//calculate "score" of each move to compare their strengths
		
		//sort moves (array of obects?)
		boolean inOrder = false;
		 while (!inOrder)	 //higher scores will have higher indexes
		 {
			 inOrder = true;
			 
			 for (int i = 0; i<5; i++)
			 {
				 double score1 = moveObjects[i].getScore();
				 double score2 = moveObjects[i+1].getScore();
				 
				 if (score1>score2)//if earlier is bigger
				 {
					 //switch them
					 inOrder = false;
					 AImove tempObject = moveObjects[i];
					 moveObjects[i] = moveObjects[i+1];
					 moveObjects[i+1] = tempObject;
				 }
			 }
		 }
		
		int [] viableMoveNumbers = new int [3];
		
		//pick out appropriate 3 (check enough stamina on each move to use, will not inflict too much damage)
		int movesFound = 0;
		int position = -1;//set for each level
		int firstSuccessfulMove = -1;
		
		
		//!!!!!!!!!!!!!!!!!check that there is SOME viable move, if not, return -1
		 //if no moves possible - pass
		
		
		int change = 0;
		//3: position = 5, change = -1
		//2: position = 3, change = -1
		//1: position = 0, change = +1
		
		 if (levelOfDifficulty == 3)
		 {
			 position = 5;
			 change = -1;
		 }
		 else if (levelOfDifficulty ==2)	 
		 {//work down until get 3
			 //if can't fill spots, replace them with top viable move
			 position = 3;
			 change = -1;
		 }
		 else if (levelOfDifficulty == 1)
		 {
			//work up until get 3
			 //if can't fill spots, replace with lowest viable move
			 position = 0;
			 change = 1;
		 }
		 else
		 {
			 System.out.println ("Someone broke something... level of difficulty value was "+levelOfDifficulty+" which was not expected");
			 System.out.println("PANIC");
		 }
			 //position = 5;//start at top
			 //work down until get 3
			 while (movesFound < 3)
			 {
				 //should it be allowed to use all its stamina to damage you?
				if (remainderHealthAI - moveObjects[position].healthLossAI + moveObjects[position].healthGainAI > 0 && remainderStaminaAI - moveObjects[position].staminaLossAI + moveObjects[position].staminaGainAI >= 0)//positive
				{
					viableMoveNumbers[movesFound] = moveObjects[position].getMove();
					movesFound++;
					//lastSuccessfulMove=position;
					
				}
				if (movesFound == 1)
				{
					firstSuccessfulMove = position;
				}
				position = position + change;
				if (position<0 || position>5)
				{
					viableMoveNumbers[movesFound] = moveObjects[firstSuccessfulMove].getMove();
					movesFound++;
				}	
			 }
			 
			 int moveIndexChosen = (int) Math.floor(Math.random()*3.0);
			 
			 return viableMoveNumbers[moveIndexChosen];
			 
			 //if can't fill spots, replace them with top viable move
			//return move number
		 }	
	}
	

