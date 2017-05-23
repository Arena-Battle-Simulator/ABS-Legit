import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Opponent {

	int numOpponent=9;//total number of opponents

	ImageIcon picture[];//picture of opponent [numOpponent]
	int move[][];//[numOpponent][move # 1-6]
	double type[][];//[numOpponent][amount of types]: percent of each type
	String name[];//[numOpponent]
	int health[];
	int stamina[];
	int healthStats[]={1200,1300,1400,1100,1500,1250,1400,1000};
	int staminaStats[]={1400,1300,1200,1500,1100,1350,1400,1000};
	boolean used[];


	public Opponent()
	{                
		picture=new ImageIcon[numOpponent];
		move=new int[numOpponent][6];
		type=new double[numOpponent][8];
		name=new String [numOpponent];
		health=new int [numOpponent];
		stamina=new int [numOpponent];
		used=new boolean [numOpponent];

		//initialize used: false=not used yet
		for (int x=0;x<numOpponent ;x++)
		{
			used[x]=false;
		}

		String temp,split[];    
		int personNum=0;


		//read characters from textfile
		try {
			Scanner in =new Scanner (new FileReader("characters.txt"));

			while (in.hasNext())
			{

				temp=in.nextLine();
				if (temp.length()>=2)
				{

					if (temp.charAt(0)!='/' && temp.charAt(0)!='/')//count: make sure that this line is actually supposed to be read
					{

						picture[personNum]=new ImageIcon (temp);//picture
						temp=in.nextLine();
						split=temp.split(" ");

						//moves
						for (int x=0;x<6 ;x++)
						{
							move[personNum][x]=Integer.parseInt(split[x]);
						}

						temp=in.nextLine();
						split=temp.split(" ");
					
						
						//percent of each type
						for (int x=0;x<8 ;x++)
						{
							type[personNum][x]=Double.parseDouble(split[x]);
							
						
						}
						name[personNum]=in.nextLine();//name

						personNum++;
					}        
				}

				
			}

			//stamina and health
			for (int x=0;x<numOpponent;x++)              
			{
				health[x]=0;
				for (int y=0;y<8;y++)              
				{

					health[x]=(int)(healthStats[y]*type[x][y])+health[x];
					
					stamina[x]=(int)(staminaStats[y]*type[x][y]);	

				}
			}         
		
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	//get picture
	public ImageIcon getPicture(int characterIndex)
	{
		return picture[characterIndex]; 
	}

	///get the moves of character
	public int[] getMove(int characterIndex)
	{
		int move2[]=new int[6];

		for ( int x=0;x<6;x++)
		{
			move2[x]=move[characterIndex][x];
		}

		return move2;
	}

	//get the types
	public double[] getType(int characterIndex)
	{
		double type2[]=new double[6];


		for ( int x=0;x<6;x++)
		{
			type2[x]=type[characterIndex][x];
		}

		return type2;

	}

	//get name of opponent
	public String getName(int characterIndex)
	{

		return name[ characterIndex];
	}


	public void useOpponent(int index)
	{
		used[index]=true;

	}

	public boolean checkUsed(int index)
	{

		return used[index];
	}


}
