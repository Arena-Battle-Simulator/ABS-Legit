import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Startmenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public Startmenu() {
		setLayout(null);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.setBounds(10, 227, 89, 23);
		add(btnNewGame);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setBounds(130, 227, 89, 23);
		add(btnContinue);
		
		JButton btnInstructions = new JButton("Instructions");
		btnInstructions.setBounds(241, 227, 89, 23);
		add(btnInstructions);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(351, 227, 89, 23);
		add(btnQuit);
		
		JLabel lblAbs = new JLabel("ABS");
		lblAbs.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblAbs.setBounds(191, 11, 69, 53);
		add(lblAbs);
		
		JLabel lblArenaBattleSiimulator = new JLabel("Arena Battle Simulator");
		lblArenaBattleSiimulator.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblArenaBattleSiimulator.setBounds(72, 75, 326, 67);
		add(lblArenaBattleSiimulator);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 11, 54, 53);
		add(label);
        btnNewGame.addActionListener (new ActionListener ()
        {
            public void actionPerformed (ActionEvent e) //when button is clicked the following logic is executed
            {

            }
        }
        );
        btnContinue.addActionListener (new ActionListener ()
        {
            public void actionPerformed (ActionEvent e) //when button is clicked the following logic is executed
            {

            }
        }
        );
        btnInstructions.addActionListener (new ActionListener ()
        {
            public void actionPerformed (ActionEvent e) //when button is clicked the following logic is executed
            {

            }
        }
        );
        btnQuit.addActionListener (new ActionListener ()
        {
            public void actionPerformed (ActionEvent e) //when button is clicked the following logic is executed
            {
            	System.exit(0);
            }
        }
        );
	}
}

