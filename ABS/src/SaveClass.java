import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveClass 
{
        
        public SaveClass()
        {

        }
     
        public boolean Save(int items[], int numItems, int skillPoints[],int batches,int completed[])
        {
        	boolean error[]=new boolean[3];

        	error[0]= saveSkillPoints(skillPoints);                     
        	error[1]= write(numItems,items);
        	error[2]=saveOpInfo(batches,completed);

        	for (int x=0;x<3;x++)   
        	{
        		if (error[x]==false)
        		{
        			return false; //If there is an error it returns false
        		}

        	} 

        	return true;//If there are no errors then it returns true
        }
        
         public int[] getSkillPoints()
     {
             
             int skillPoints[]=new int [8];
             
             //read
             try {
                     
                     BufferedReader input=new BufferedReader(new FileReader("skill points.txt"));
             
                     //read each skill point
             for (int x=0;x<8;x++)   
             {
             skillPoints[x]=Integer.parseInt(input.readLine());
             }

             input.close();
             } catch (FileNotFoundException e) {
            	 // TODO Auto-generated catch block
            	 e.printStackTrace();
             } catch (NumberFormatException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
             } catch (IOException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
             } 
             
             
             return skillPoints;             
     }
          
     
     //save skill points
     public boolean saveSkillPoints(int skillPoints[])
     {
              try {  
                       PrintWriter write;
                 write = new PrintWriter (new FileWriter ("skill points.txt"));
                     
                 //save each skill point
                 for (int x=0;x<8;x++)       
                     {
                     write.println(skillPoints[x]);
                     }
                     
                     write.close();
                     
              } catch (FileNotFoundException e) {
                 
                     e.printStackTrace();
                     return false;
             } catch (IOException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                     return false;
             }
            return true;  
     }
     
     //items
     public int[] read ()
        {
                String line;//variables that do stuff
                int x = 0;
                int items[]=new int [2];
                
                
                try
                {
                        BufferedReader input;//declaring
                        input = new BufferedReader (new FileReader ("Items.txt"));//instantiating
                        line = input.readLine ();//reading the file (open the gates of input!)
                        while (line != null)//error handling purposes
                        {
                                
                                items[x]=Integer.parseInt(line);
                                line = input.readLine();
                       
                        x++;
                        }
                        input.close();
                }
                catch (Exception e)
                {
                      items[0]=-1;//If there is an error it returns 1
                }
                return items;//If there are no errors then it returns 0
        }
        
     //items
        public boolean write (int numitems,int items[] )
        {
                try
                {
                        PrintWriter output;//declaring
                        output = new PrintWriter (new FileWriter ("Items.txt"));//instantiating
                        for (int a = 0;a<numitems;a++)
                        {
                                output.println(items[a]);
                        }
                        output.close();
                }
                catch (Exception e)
                {
                        return false;//If there is an error it returns 1
                }
                return true;//If there are no errors then it returns 0
        }

        
    	public boolean saveOpInfo(int batches , int completed[])
    	{
    		int numOpponents=5;//amount of opponents per batch
    		
    		  PrintWriter write;
              try {
    			write = new PrintWriter (new FileWriter ("opInfo.txt"));
    		
    			
    		write.println(batches);	
    			
    			for (int x=0;x<numOpponents;x++)
    			{
    				write.println(completed[x]);
    			}
    			write.close();
              
     
              } catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    			return false;
    		}
    	return true;
    		
    	}	
    	
    	public int[] readOpInfo()
    	{
    		int numOpponents=5;
    		
    		int opInfo[]=new int [numOpponents+1];//[0]: num batches complete, [1] [2]... 0 or 1: opponent complete or not
    		
    			try {
    				BufferedReader input=new BufferedReader(new FileReader("opInfo.txt"));
    			
    			opInfo[0]=Integer.parseInt(input.readLine());
    			
    			for (int x=0;x<numOpponents;x++){
    				
    				opInfo[x+1]=Integer.parseInt(input.readLine());
    								
    			}
    	
    			
    			input.close();
    			} catch (FileNotFoundException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			} catch (NumberFormatException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		
    	
    			return opInfo;
    	}
            
}
