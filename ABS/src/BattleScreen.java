import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class BattleScreen extends JPanel implements ActionListener {

        ArrayList<JButton> moveButton=new ArrayList<JButton>();
        Timer timer=new Timer (25,this)  ;

        boolean stop=true;

        int moveIndex[];

        JProgressBar health,stamina,opHealth,opStamina;

        JButton item1,item2;

		ItemsClass items;
        
        //MoveCalc moveCalc=new MoveCalc();//------------------------------------------------------not connected yet
        //ItemCalc itemCalc=new ItemCalc();//------------------------------------------------------not connected yet


        public BattleScreen() {

                int x=54,y=530;

                int index;

                setLayout(null);

                setSize(1280, 800);

                JLabel lblNewLabel = new JLabel("Health");
                lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
                lblNewLabel.setBounds(345, 71, 55, 47);
                add(lblNewLabel);

                //user health bar
                health = new JProgressBar();
                health.setBounds(936, 373, 310, 33);
                add(health);


                //user stamina bar
                stamina = new JProgressBar();
                stamina.setBounds(936, 419, 310, 33);
                add(stamina);

                //oppponent health bar
                opHealth = new JProgressBar();
                opHealth.setBounds(25, 75, 310, 33);
                add(opHealth);

                //opponent stamina bar
                opStamina = new JProgressBar();
                opStamina.setBounds(25, 119, 310, 33);
                add(opStamina);


                JLabel lblStamina = new JLabel("Stamina");
                lblStamina.setFont(new Font("Tahoma", Font.PLAIN, 14));
                lblStamina.setBounds(345, 105, 55, 47);
                add(lblStamina);


                JLabel label = new JLabel("Health");
                label.setFont(new Font("Tahoma", Font.PLAIN, 14));
                label.setBounds(861, 362, 55, 47);
                add(label);

                JLabel label_1 = new JLabel("Stamina");
                label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
                label_1.setBounds(861, 418, 55, 47);
                add(label_1);      

                index=0;
                //create buttons
                for (int b=0;b<2;b++)
                {
                        x=54;
                        for (int a=0;a<3;a++)
                        {
                              
                                moveButton.add(new JButton());
                                moveButton.get(index).setFont(new Font("Vijaya", Font.PLAIN, 25));
                                moveButton.get(index).setBounds(x, y, 252, 110);
                                add(moveButton.get(index));     

                                x=x+306;
                                index++;
                        }

                        y=651;              
                }
               
                //item1 button
                item1 = new JButton();             
                item1.setFont(new Font("Vijaya", Font.PLAIN, 25));
                item1.setBounds(972, 530, 252, 110);
                add(item1);

                //item2 button
                item2 = new JButton();
                item2.setFont(new Font("Vijaya", Font.PLAIN, 25));
                item2.setBounds(972, 651, 252, 110);
                add(item2);
        }

        
        //set up a new battle : health, stamina, opponent health, opponent stamina, the 6 moves being used, picture of 
        public void newBattle(int h,int s, int oph, int ops,int moveIndex2[],ImageIcon picture,String uName,String oName,ItemsClass items2)
        {
        	
            moveIndex=moveIndex2;
        	items=items2;
        	
        	
                Moves moves=new Moves();//-----------------------------------------------------------class not yet made
             moveIndex=moveIndex2;

                //set names of buttons
                for (int b=0;b<6;b++)
                {
                        moveButton.get(b).setText(moves.getName(moveIndex[b])); 
                        moveButton.get(b).setActionCommand(Integer.toString(moveIndex2[b]));
                        moveButton.get(b).addActionListener(this);
                }                
                
                item1.setText("Health Potion :" + items.getItemCount(0)+" left");       
               item2.setText("Stamina Potion :" + items.getItemCount(1)+" left");
//item1.addActionListener(new ActionListener());
            
                Image image,image2;             
                ImageIcon ii = new ImageIcon("A2.png");
                image = ii.getImage();
                image2=image.getScaledInstance(521,273,java.awt.Image.SCALE_SMOOTH);
                ii=new ImageIcon(image2);


                JLabel User = new JLabel(ii);
                User.setBounds(86, 246, 521, 273);
                add(User);

                ii = new ImageIcon("character.png");
                image = ii.getImage();
                image2=image.getScaledInstance(218,286,java.awt.Image.SCALE_SMOOTH);
                ii=new ImageIcon(image2);

                JLabel opponent = new JLabel(ii);
                opponent.setBounds(642, 21, 218, 286);
                add(opponent);              

                health.setMaximum(h);
                health.setValue(h);
                stamina.setMaximum(s);
                stamina.setValue(s);
                opHealth.setMaximum(oph);
                opHealth.setValue(oph);
                opStamina.setMaximum(ops);
                opStamina.setValue(oph);
                
                JLabel name = new JLabel(uName);
                name.setFont(new Font("Stencil", Font.PLAIN, 30));
                name.setHorizontalAlignment(SwingConstants.CENTER);
                name.setBounds(989, 336, 191, 26);
                add(name);
                
                JLabel oppName = new JLabel(oName);
                oppName.setHorizontalAlignment(SwingConstants.CENTER);
                oppName.setFont(new Font("Stencil", Font.PLAIN, 30));
                oppName.setBounds(72, 38, 191, 26);
                add(oppName);

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            //int index=Integer.parseInt(e.getActionCommand());
            //newStats=moveCalc(moveIndex[index],health.getValue(),stamina.getValue(),opHealth.getValue(),opStamina.getValue());//--------------------------to be added
                int icnt=2;

                int newStats[];

                Object src=e.getSource();


                //MOVE BUTTONs
                for (int cnt=0;cnt<6;cnt++)
                {
                        if(moveButton.get(cnt)==src)
                        {                        
                                //newStats=moveCalc(moveIndex[cnt],health.getValue(),stamina.getValue(),opHealth.getValue(),opStamina.getValue());//--------------------------to be added
                                icnt=0;//dont check for item button
                                cnt=6;
                                
                        }            
                }

                timer.start();
                
               // update(200,200,200,200);
                
//item buttons
               for (int cnt=0;cnt<icnt;cnt++)
                {

                        //newStats=itemCalc(itemIndex[cnt],health.getValue(),stamina.getValue(),opHealth.getValue(),opStamina.getValue());              
               }

              //  update(newStats[0],newStats[1],newStats[2],newStats[3]);//0---------------------------------------to be added
              

                //reset progress bars
                //health.setValue(newStats[0]);//--------------------------------------------to be added
                //stamina.setValue(newStats[1]);
                // opHealth.setValue(newStats[2]);
                // opStamina.setValue(newStats[3]);
        }

       
        //animate progress bars
        public void update(int newh,int news,int newoph,int newops)
        {
                 stop=true;
                
                check(newh,health);
                check(news,stamina);
                check(newoph,opHealth);
                check(newops,opStamina);
                repaint();
                if (stop)
                {
                        timer.stop();
                }
                
        }

        //animate progress bars: check if progress bar should finish or not
public void check(int num,JProgressBar bar)
{
        if (bar.getValue()!=num)
        {
                bar.setValue(bar.getValue()-1);
                stop=false;
                
        }
        
}
}
