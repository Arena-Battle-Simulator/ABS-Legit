/*
 * WILL THIS SHOW UP?????????
 * Anna Westland-Tegart
 * ABS Skill Picker
 */
//package absSkillsWestlandTegart;

//TESTING

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SkillsGUI extends JFrame {

	private JPanel contentPane;

	int width_1;
	int width_2;
	int width_3;
	int width_4;
	int width_5;
	int width_6;
	int width_7;
	int width_8;
	
	JLabel lblLocked_1;
	JLabel lblLocked_2;
	JLabel lblLocked_3;
	JLabel lblLocked_4;
	JLabel lblLocked_5;
	JLabel lblLocked_6;
	JLabel lblLocked_7;
	JLabel lblLocked_8;
	
	JLabel lblNew_1;
	JLabel lblNew_2;
	JLabel lblNew_3;
	JLabel lblNew_4;
	JLabel lblNew_5;
	JLabel lblNew_6;
	JLabel lblNew_7;
	JLabel lblNew_8;
	
	/**
	 * Launch the application.
	 */
	
	static SkillsGUI frame; 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new SkillsGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				frame.setSize(1280,800);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SkillsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		width_1 = 0;
		width_2 = 0;
		width_3 = 0;
		width_4 = 0;
		width_5 = 0;
		width_6 = 0;
		width_7 = 0;
		width_8 = 0;
		
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		panelNorth.setLayout(new BoxLayout(panelNorth, BoxLayout.X_AXIS));
		
		JLabel lblTitle = new JLabel("Title");
		panelNorth.add(lblTitle);
		
		JLabel lblNextopponentinfo = new JLabel("NextOpponentInfo");
		panelNorth.add(lblNextopponentinfo);
		
		JLabel lblPointsRemaining = new JLabel("Points Remaining:");
		panelNorth.add(lblPointsRemaining);
		
		JLabel lblPoints = new JLabel("points");
		panelNorth.add(lblPoints);
		
		JPanel panelLeft = new JPanel();
		contentPane.add(panelLeft, BorderLayout.WEST);
		panelLeft.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow][grow][grow][grow][grow][grow]"));
		
		JPanel panel_8 = new JPanel();
		panelLeft.add(panel_8, "cell 0 0,grow");
		
		JLabel label = new JLabel("class1");
		panel_8.add(label);
		
		JLabel lblNum_1 = new JLabel("num1");
		panel_8.add(lblNum_1);
		
		
		final JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("minus button 1 pressed");
				width_1 = width_1 - 50;
				lblNew_1.setPreferredSize(new Dimension(width_1, 20));
				lblNew_1.setSize(lblNew_1.getPreferredSize());//<------- THIS IS LIKE REPAINT BUT IT ACTUALLY FIXES THE JLABEL RESIZING ISSUES --- THANK GOODNESS
				//USING REVALIDATE, WHEN WIDTH IS NEG IT STARTS EATING THE OTHER LABEL, SO EXTRA SUPER IMPORTANT TO RESTRICT WHEN YOU CAN DO PLUS/MINUS
				lblNew_1.setVisible(true);
				lblNew_1.revalidate();
			}
		});
		//contentPane.repaint();
		//contentPane.paintImmediately(contentPane.getBounds());
		//repaint();
		panel_8.add(button_1);
		
		JButton buttonP_1 = new JButton("+");
		buttonP_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				width_1 = width_1 + 50;
				lblNew_1.setPreferredSize(new Dimension(width_1, 20));
				lblNew_1.setSize(lblNew_1.getPreferredSize());
				lblNew_1.setVisible(true);
				lblNew_1.revalidate();
			}
		});
		
		//contentPane.repaint();
		//contentPane.paintImmediately(contentPane.getBounds());
		
		panel_8.add(buttonP_1);
		
		
		JPanel panel_9 = new JPanel();
		panelLeft.add(panel_9, "cell 0 1,grow");
		
		JLabel label_1 = new JLabel("class2");
		panel_9.add(label_1);
		
		JLabel lblNum_2 = new JLabel("num2");
		panel_9.add(lblNum_2);
		
		JButton button_2 = new JButton("-");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("minus button 2 pressed");
				width_2 = width_2 - 50;
				lblNew_2.setPreferredSize(new Dimension(width_2, 20));
				lblNew_2.setSize(lblNew_2.getPreferredSize());
				lblNew_2.setVisible(true);
				lblNew_2.revalidate();
			}
		});
		panel_9.add(button_2);
		
		JButton buttonP_2 = new JButton("+");
		buttonP_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				width_2 = width_2 + 50;
				lblNew_2.setPreferredSize(new Dimension(width_2, 20));
				lblNew_2.setSize(lblNew_2.getPreferredSize());
				lblNew_2.setVisible(true);
				lblNew_2.revalidate();
			}
		});
		panel_9.add(buttonP_2);
		
		JPanel panel_10 = new JPanel();
		panelLeft.add(panel_10, "cell 0 2,grow");
		
		JLabel label_2 = new JLabel("class3");
		panel_10.add(label_2);
		
		JLabel lblNum_3 = new JLabel("num3");
		panel_10.add(lblNum_3);
		
		JButton button_3 = new JButton("-");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("minus button 3 pressed");
				width_3 = width_3 - 50;
				lblNew_3.setPreferredSize(new Dimension(width_3, 20));
				lblNew_3.setSize(lblNew_3.getPreferredSize());
				lblNew_3.setVisible(true);
				lblNew_3.revalidate();
			}
		});
		panel_10.add(button_3);
		
		JButton buttonP_3 = new JButton("+");
		buttonP_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				width_3 = width_3 + 50;
				lblNew_3.setPreferredSize(new Dimension(width_3, 20));
				lblNew_3.setSize(lblNew_3.getPreferredSize());
				lblNew_3.setVisible(true);
				lblNew_3.revalidate();
			}
		});
		panel_10.add(buttonP_3);
		
		JPanel panel_11 = new JPanel();
		panelLeft.add(panel_11, "cell 0 3,grow");
		
		JLabel label_3 = new JLabel("class4");
		panel_11.add(label_3);
		
		JLabel lblNum_4 = new JLabel("num4");
		panel_11.add(lblNum_4);
		
		JButton button_4 = new JButton("-");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("minus button 4 pressed");
				width_4 = width_4 - 50;
				lblNew_4.setPreferredSize(new Dimension(width_4, 20));
				lblNew_4.setSize(lblNew_4.getPreferredSize());
				lblNew_4.setVisible(true);
				lblNew_4.revalidate();
			}
		});
		panel_11.add(button_4);
		
		JButton buttonP_4 = new JButton("+");
		buttonP_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				width_4 = width_4 + 50;
				lblNew_4.setPreferredSize(new Dimension(width_4, 20));
				lblNew_4.setSize(lblNew_4.getPreferredSize());
				lblNew_4.setVisible(true);
				lblNew_4.revalidate();
			}
		});
		panel_11.add(buttonP_4);
		
		JPanel panel_12 = new JPanel();
		panelLeft.add(panel_12, "cell 0 4,grow");
		
		JLabel label_4 = new JLabel("class5");
		panel_12.add(label_4);
		
		JLabel lblNum_5 = new JLabel("num5");
		panel_12.add(lblNum_5);
		
		JButton button_5 = new JButton("-");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("minus button 5 pressed");
				width_5 = width_5 - 50;
				lblNew_5.setPreferredSize(new Dimension(width_5, 20));
				lblNew_5.setSize(lblNew_5.getPreferredSize());
				lblNew_5.setVisible(true);
				lblNew_5.revalidate();
			}
		});
		panel_12.add(button_5);
		
		JButton buttonP_5 = new JButton("+");
		buttonP_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				width_5 = width_5 + 50;
				lblNew_5.setPreferredSize(new Dimension(width_5, 20));
				lblNew_5.setSize(lblNew_5.getPreferredSize());
				lblNew_5.setVisible(true);
				lblNew_5.revalidate();
			}
		});
		panel_12.add(buttonP_5);
		
		JPanel panel_13 = new JPanel();
		panelLeft.add(panel_13, "cell 0 5,grow");
		
		JLabel lblClass_6 = new JLabel("class6");
		panel_13.add(lblClass_6);
		
		JLabel lblNum_6 = new JLabel("num6");
		panel_13.add(lblNum_6);
		
		JButton button_6 = new JButton("-");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("minus button 6 pressed");
				width_6 = width_6 - 50;
				lblNew_6.setPreferredSize(new Dimension(width_6, 20));
				lblNew_6.setSize(lblNew_6.getPreferredSize());
				lblNew_6.setVisible(true);
				lblNew_6.revalidate();
			}
		});
		panel_13.add(button_6);
		
		JButton buttonP_6 = new JButton("+");
		buttonP_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				width_6 = width_6 + 50;
				lblNew_6.setPreferredSize(new Dimension(width_6, 20));
				lblNew_6.setSize(lblNew_6.getPreferredSize());
				lblNew_6.setVisible(true);
				lblNew_6.revalidate();
			}
		});
		panel_13.add(buttonP_6);
		
		JPanel panel_14 = new JPanel();
		panelLeft.add(panel_14, "cell 0 6,grow");
		
		JLabel lblClass_7 = new JLabel("class7");
		panel_14.add(lblClass_7);
		
		JLabel lblNum_7 = new JLabel("num7");
		panel_14.add(lblNum_7);
		
		JButton button_7 = new JButton("-");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("minus button 7 pressed");
				width_7 = width_7 - 50;
				lblNew_7.setPreferredSize(new Dimension(width_7, 20));
				lblNew_7.setSize(lblNew_7.getPreferredSize());
				lblNew_7.setVisible(true);
				lblNew_7.revalidate();
			}
		});
		panel_14.add(button_7);
		
		JButton buttonP_7 = new JButton("+");
		buttonP_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				width_7 = width_7 + 50;
				lblNew_7.setPreferredSize(new Dimension(width_7, 20));
				lblNew_7.setSize(lblNew_7.getPreferredSize());
				lblNew_7.setVisible(true);
				lblNew_7.revalidate();
			}
		});
		panel_14.add(buttonP_7);
		
		JPanel panel_15 = new JPanel();
		panelLeft.add(panel_15, "cell 0 7,grow");
		
		JLabel lblClass_8 = new JLabel("class8");
		panel_15.add(lblClass_8);
		
		JLabel lblNum_8 = new JLabel("num8");
		panel_15.add(lblNum_8);
		
		JButton button_8 = new JButton("-");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("minus button 8 pressed");
				width_8 = width_8 - 50;
				lblNew_8.setPreferredSize(new Dimension(width_8, 20));
				lblNew_8.setSize(lblNew_8.getPreferredSize());
				lblNew_8.setVisible(true);
				lblNew_8.revalidate();
			}
		});
		panel_15.add(button_8);
		
		JButton buttonP_8 = new JButton("+");
		buttonP_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				width_8 = width_8 + 50;
				lblNew_8.setPreferredSize(new Dimension(width_8, 20));
				lblNew_8.setSize(lblNew_8.getPreferredSize());
				lblNew_8.setVisible(true);
				lblNew_8.revalidate();
			}
		});
		panel_15.add(buttonP_8);
		
		JPanel panelMiddle = new JPanel();
		contentPane.add(panelMiddle, BorderLayout.CENTER);
		panelMiddle.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow][grow][grow][grow][grow][grow]"));
		
		JPanel panel = new JPanel();
		panelMiddle.add(panel, "cell 0 0,alignx left,growy");
		
		lblLocked_1 = new JLabel("locked");
		lblLocked_1.setBackground(Color.RED);
		panel.add(lblLocked_1);
		lblLocked_1.setOpaque(true); //<----- VERY IMPORTANT
		lblLocked_1.setPreferredSize(new Dimension(100, 20));
		
		lblNew_1 = new JLabel("new");
		lblNew_1.setBackground(Color.GREEN);
		panel.add(lblNew_1);
		lblNew_1.setOpaque(true);
		lblNew_1.setPreferredSize(new Dimension(500, 20));
		
		
		JPanel panel_1 = new JPanel();
		panelMiddle.add(panel_1, "cell 0 1,alignx left,growy");
		
		lblLocked_2 = new JLabel("locked");
		lblLocked_2.setPreferredSize(new Dimension(100, 20));
		lblLocked_2.setBackground(Color.RED);
		panel_1.add(lblLocked_2);
		lblLocked_2.setOpaque(true);
		
		lblNew_2 = new JLabel("new");
		lblNew_2.setBackground(Color.GREEN);
		panel_1.add(lblNew_2);
		lblNew_2.setOpaque(true);
		
		JPanel panel_2 = new JPanel();
		panelMiddle.add(panel_2, "cell 0 2,alignx left,growy");
		
		lblLocked_3 = new JLabel("locked");
		lblLocked_3.setPreferredSize(new Dimension(100, 20));
		lblLocked_3.setBackground(Color.RED);
		panel_2.add(lblLocked_3);
		lblLocked_3.setOpaque(true);
		
		lblNew_3 = new JLabel("new");
		lblNew_3.setBackground(Color.GREEN);
		panel_2.add(lblNew_3);
		lblNew_3.setOpaque(true);
		
		JPanel panel_3 = new JPanel();
		panelMiddle.add(panel_3, "cell 0 3,alignx left,growy");
		
		lblLocked_4 = new JLabel("locked");
		lblLocked_4.setPreferredSize(new Dimension(100, 20));
		lblLocked_4.setBackground(Color.RED);
		panel_3.add(lblLocked_4);
		lblLocked_4.setOpaque(true);
		
		lblNew_4 = new JLabel("new");
		lblNew_4.setBackground(Color.GREEN);
		panel_3.add(lblNew_4);
		lblNew_4.setOpaque(true);
		
		JPanel panel_4 = new JPanel();
		panelMiddle.add(panel_4, "cell 0 4,alignx left,growy");
		
		lblLocked_5 = new JLabel("locked");
		lblLocked_5.setPreferredSize(new Dimension(100, 20));
		lblLocked_5.setBackground(Color.RED);
		panel_4.add(lblLocked_5);
		lblLocked_5.setOpaque(true);
		
		lblNew_5 = new JLabel("new");
		lblNew_5.setBackground(Color.GREEN);
		panel_4.add(lblNew_5);
		lblNew_5.setOpaque(true);
		
		JPanel panel_5 = new JPanel();
		panelMiddle.add(panel_5, "cell 0 5,alignx left,growy");
		
		lblLocked_6 = new JLabel("locked");
		lblLocked_6.setPreferredSize(new Dimension(100, 20));
		lblLocked_6.setBackground(Color.RED);
		panel_5.add(lblLocked_6);
		lblLocked_6.setOpaque(true);
		
		lblNew_6 = new JLabel("new");
		lblNew_6.setBackground(Color.GREEN);
		panel_5.add(lblNew_6);
		lblNew_6.setOpaque(true);
		
		JPanel panel_6 = new JPanel();
		panelMiddle.add(panel_6, "cell 0 6,alignx left,growy");
		
		lblLocked_7 = new JLabel("locked");
		lblLocked_7.setPreferredSize(new Dimension(100, 20));
		lblLocked_7.setBackground(Color.RED);
		panel_6.add(lblLocked_7);
		lblLocked_7.setOpaque(true);
		
		lblNew_7 = new JLabel("new");
		lblNew_7.setBackground(Color.GREEN);
		panel_6.add(lblNew_7);
		lblNew_7.setOpaque(true);
		
		JPanel panel_7 = new JPanel();
		panelMiddle.add(panel_7, "cell 0 7,alignx left,growy");
		
		lblLocked_8 = new JLabel("locked");
		lblLocked_8.setPreferredSize(new Dimension(100, 20));
		lblLocked_8.setBackground(Color.RED);
		panel_7.add(lblLocked_8);
		lblLocked_8.setOpaque(true);
		
		lblNew_8 = new JLabel("new");
		lblNew_8.setBackground(Color.GREEN);
		panel_7.add(lblNew_8);
		lblNew_8.setOpaque(true);
		
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JLabel lblMessage = new JLabel("message");
		panelSouth.add(lblMessage);
		
		JButton btnConfirm = new JButton("confirm");
		panelSouth.add(btnConfirm);
		
		lblNew_1.setVisible(false);
		lblNew_1.revalidate();
		
		
	}

}
