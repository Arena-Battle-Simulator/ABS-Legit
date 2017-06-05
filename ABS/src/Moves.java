import java.io.*;
import java.util.Scanner;
import java.awt.*;

public class Moves {

	String skip;
	String [] [] moveNames = new String [8] [11];
	int [] [] moveValues = new int [80] [6];
	int [] [] moveStats = new int [8] [2];
	
	public void moveRead (){
	try{ 
	File data = new File("mov.txt");
	Scanner in = new Scanner(data);
	
	int x = 0;
	while (x < 8){
	moveNames[x][0]=in.next();
	//System.out.println("moveNames[x][0]");
	x++;
	}
	
	x = 0;
	while (x < 8){
	moveStats[x][0]= in.nextInt();
	moveStats[x][1]= in.nextInt();
	}
	
	x = 0;
	int y = 1;
	while (x < 8){
	while (y < 11){
		moveNames [x][y]=in.next();
		y++;
	}
	x++;
	}
	
	x = 0;
	y = 0;
	while (x < 80){
	while (y < 6){
		moveValues[x][y]=in.nextInt();	
		y++;
	}
	skip = in.next();
	x++;
	}
	
	}
	catch(FileNotFoundException e){
		
	}
	}
}
