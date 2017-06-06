//class to read in and store all data relating to types and moves
import java.io.*;
import java.util.Scanner;
import java.awt.*;

public class Moves {
	String [] [] moveNames = new String [8] [11]; //stores name of types and name of moves
	int [] [] moveValues = new int [80] [6]; //stores all six statistics of every move (dmg, stamDMG, stam cost, hp cost, heal, stam heal in that order)
	int [] [] moveStats = new int [8] [2]; //stores base health and stam of every type
	
	
	public void moveRead (){
	
	try{ 
	File data = new File("moves.txt"); //txt file to read from
	Scanner in = new Scanner(data); //creating scanner named "data"
	
	int x = 0;
	while (x < 8){ //loops 8 times
	moveNames[x][0]=in.next(); //storing the name of each type as the first value
	System.out.println(moveNames[x][0]); //testing (remove later)
	x++;
	}
	
	x = 0;
	while (x < 8){ //loops 8 times
	moveStats[x][0]= in.nextInt(); //stores base health
	moveStats[x][1]= in.nextInt(); //stores base stamina
	System.out.println(moveStats[x][0]); //testing (remove later)
	}
	
	x = 0;
	int y = 1; //start at 1 because 0 is already storing name of type
	while (x < 8){ //loops 8 times (one for every type)
	while (y < 11){ //loops 10 times (one for every move per type)
		moveNames [x][y]=in.next(); //storing the names of the moves
		System.out.println(moveNames[x][y]); //testing (remove later)
		y++;
	}
	x++;
	}
	
	x = 0;
	y = 0;
	while (x < 80){ //loops 80 times (one for each move)
	while (y < 6){ //loops 6 times (one for each statistic [dmg, heal, cost, etc])
		moveValues[x][y]=in.nextInt(); //stores each move's statistics
		System.out.println(moveValues); //testing (remove later)
		y++;
	}
	x++;
	}
	
	}
	catch(FileNotFoundException e){		
	}
	}
}