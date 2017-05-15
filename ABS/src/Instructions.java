import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Instructions extends JPanel {

	/**
	 * Create the panel.
	 */
	public Instructions() {
		setLayout(null);
		
		JLabel lblHelpinstructions = new JLabel("Help/Instructions");
		lblHelpinstructions.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHelpinstructions.setBounds(130, 11, 195, 25);
		add(lblHelpinstructions);
		
		JLabel lblInstructionsOnHow = new JLabel("instructions on how to play");
		lblInstructionsOnHow.setBounds(10, 75, 210, 201);
		add(lblInstructionsOnHow);
		
		JLabel lblPictureOfTypes = new JLabel("picture of types and weaknesses");
		lblPictureOfTypes.setBounds(270, 168, 170, 14);
		add(lblPictureOfTypes);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(294, 266, 89, 23);
		add(btnBack);
		
        btnBack.addActionListener (new ActionListener ()
        {
            public void actionPerformed (ActionEvent e) //when button is clicked the following logic is executed
            {

            }
        }
        );

	}
}
