/*
 * This is an assistant program to AnnaAI.java.
 * It is an object file allowing individual move options to have all their information stored in one object.
 * Its objects shouldn't need to be called from anywhere except AnnaAI,
 * so unless you are changing AnnaAI, don't worry about it.
 */
public class AImove {

	double score;
	double remainderHealthAI;
	double remainderStaminaAI;
	double remainderHealthPlayer; 
	double remainderStaminaPlayer;
	int moveNumber;
	
	double healthGainAI;
	double healthLossAI;
	double healthLossPlayer;
	double staminaGainAI;
	double staminaLossAI;
	double staminaLossPlayer;
	public AImove (int [] moveInfo, int moveNumber, int remainderHealthAI, int remainderHealthPlayer, int remainderStaminaAI, int remainderStaminaPlayer)
	{
		 healthGainAI = moveInfo[0];
		 healthLossAI = moveInfo[1];
		 healthLossPlayer = moveInfo [2];
		 staminaGainAI = moveInfo [3];
		 staminaLossAI = moveInfo [4];
		 staminaLossPlayer = moveInfo [5];
		
		this.moveNumber = moveNumber;
		this.remainderHealthAI = remainderHealthAI;
		this.remainderStaminaAI = remainderStaminaAI;
		this.remainderHealthPlayer = remainderHealthPlayer; 
		this.remainderStaminaPlayer = remainderStaminaPlayer;
		
		
		score = 0;
		
		calculateScore(); //might want to call outside object instead if want to control weights
	}
	
	public void calculateScore()
	{
		//can pass in weights later to adjust, but no weights for now
		score = /*AI HEALTH*/ ((healthGainAI-healthLossAI)/remainderHealthAI) + /*PLAYER HEALTH*/ (healthLossPlayer/remainderHealthPlayer) + 
				/*AI STAMINA*/((staminaGainAI-staminaLossAI)/remainderStaminaAI) + /*PLAYER STAMINA*/(staminaLossPlayer/remainderStaminaPlayer);
	}
	
	public double getScore ()
	{
		return score;
	}
	
	public int getMove ()
	{
		return moveNumber;
	}
}

