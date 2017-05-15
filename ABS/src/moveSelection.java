import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class moveSelection extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					moveSelection frame = new moveSelection();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public moveSelection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String fireList[] = {"Flame Tackle", "Ignite", "Deep Burn", "Incinerate", "Flare Blitz", "Flamethrower", "Burning Energy", "Fire Blast", "Blast Burn", "Incindiary Execution"};
		String waterList[] = {"Aqua Tackle"};
		String grassList[] = {"Leaf Tackle"};
		String electricList[] = {"Shock Tackle"};
		String rockList[] = {"Earthern Tackle"};
		String iceList[] = {"Frost Tackle"};
		String normalList[] = {"Tackle"};
		String darkList[] = {"Dark Tackle"};
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 123, 214, 97);
		contentPane.add(textArea);
		textArea.setEditable(false);
		
		JComboBox comboBox_1 = new JComboBox(waterList);
		comboBox_1.setBounds(120, 77, 69, 20);
		contentPane.add(comboBox_1);	

		JLabel lblFire = new JLabel("Fire:");
		lblFire.setBounds(43, 54, 33, 14);
		contentPane.add(lblFire);
		
		JComboBox comboBox_2 = new JComboBox(grassList);
		comboBox_2.setBounds(199, 77, 69, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox(electricList);
		comboBox_3.setBounds(278, 77, 69, 20);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox(rockList);
		comboBox_4.setBounds(357, 77, 69, 20);
		contentPane.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox(iceList);
		comboBox_5.setBounds(436, 77, 69, 20);
		contentPane.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox(normalList);
		comboBox_6.setBounds(515, 77, 69, 20);
		contentPane.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox(darkList);
		comboBox_7.setBounds(596, 77, 69, 20);
		contentPane.add(comboBox_7);
		
		JLabel lblWater = new JLabel("Water:");
		lblWater.setBounds(120, 54, 46, 14);
		contentPane.add(lblWater);
		
		JLabel lblGrass = new JLabel("Grass:");
		lblGrass.setBounds(199, 54, 46, 14);
		contentPane.add(lblGrass);
		
		JLabel lblElectric = new JLabel("Electric:");
		lblElectric.setBounds(278, 54, 46, 14);
		contentPane.add(lblElectric);
		
		JLabel lblRock = new JLabel("Rock:");
		lblRock.setBounds(357, 54, 46, 14);
		contentPane.add(lblRock);
		
		JLabel lblIce = new JLabel("Ice:");
		lblIce.setBounds(436, 54, 46, 14);
		contentPane.add(lblIce);
		
		JLabel lblNormal = new JLabel("Normal:");
		lblNormal.setBounds(515, 54, 46, 14);
		contentPane.add(lblNormal);
		
		JLabel lblDark = new JLabel("Dark:");
		lblDark.setBounds(596, 54, 46, 14);
		contentPane.add(lblDark);
		
		JLabel lblSelectYour = new JLabel("SELECT YOUR MOVES!");
		lblSelectYour.setBounds(293, 11, 133, 14);
		contentPane.add(lblSelectYour);
		
		JButton btnConfirmSelection = new JButton("CONFIRM MOVE");
		
		btnConfirmSelection.setBounds(532, 449, 133, 23);
		contentPane.add(btnConfirmSelection);
		
		JButton btnMoveDescription = new JButton("Move Description");
		btnMoveDescription.setBounds(23, 20, 143, 23);
		contentPane.add(btnMoveDescription);
		
		JComboBox comboBox = new JComboBox(fireList);
		comboBox.setBounds(10, 77, 100, 20);
		contentPane.add(comboBox);
		
		btnMoveDescription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			textArea.setText("Incindiary Execution: Fire"  + "\n" + "\n" + "Stam Cost: 450" + "\n" + "Info: Deals 420 + 10% of the enemies" + "\n" + "missing health in flame damage.");
			
			}
		});
		
		btnConfirmSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	}
	
	}

