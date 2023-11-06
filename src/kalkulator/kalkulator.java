package kalkulator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class kalkulator {

	private JFrame frame;
	private JTextField textField;
	
	int prvibroj;
	int drugibroj;
	int rezultat;
	String operacija;
	String odgovor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kalkulator window = new kalkulator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public kalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 407, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(10, 24, 370, 72);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn_7 = new JButton("7");
		btn_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_7.getText();
				textField.setText(number);
			}
		});
		btn_7.setBounds(10, 117, 85, 72);
		frame.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_8.getText();
				textField.setText(number);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_8.setBounds(105, 117, 85, 72);
		frame.getContentPane().add(btn_8);
		
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_9.getText();
				textField.setText(number);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_9.setBounds(200, 117, 85, 72);
		frame.getContentPane().add(btn_9);
		
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prvibroj = Integer.parseInt(textField.getText());
				operacija = "+";
				textField.setText(null);
			}
		});
		btn_plus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_plus.setBounds(295, 117, 85, 72);
		frame.getContentPane().add(btn_plus);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_4.getText();
				textField.setText(number);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_4.setBounds(10, 199, 85, 72);
		frame.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_5.getText();
				textField.setText(number);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_5.setBounds(105, 199, 85, 72);
		frame.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_6.getText();
				textField.setText(number);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_6.setBounds(200, 199, 85, 72);
		frame.getContentPane().add(btn_6);
		
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prvibroj = Integer.parseInt(textField.getText());
				operacija = "-";
				textField.setText(null);
			}
		});
		btn_minus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_minus.setBounds(295, 199, 85, 72);
		frame.getContentPane().add(btn_minus);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_1.getText();
				textField.setText(number);
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_1.setBounds(10, 281, 85, 72);
		frame.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_2.getText();
				textField.setText(number);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_2.setBounds(105, 281, 85, 72);
		frame.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_3.getText();
				textField.setText(number);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_3.setBounds(200, 281, 85, 72);
		frame.getContentPane().add(btn_3);
		
		JButton btn_mnozenje = new JButton("*");
		btn_mnozenje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prvibroj = Integer.parseInt(textField.getText());
				operacija = "*";
				textField.setText(null);
			}
		});
		btn_mnozenje.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_mnozenje.setBounds(295, 281, 85, 72);
		frame.getContentPane().add(btn_mnozenje);
		
		JButton btn_brisanje = new JButton("C");
		btn_brisanje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btn_brisanje.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_brisanje.setBounds(10, 363, 85, 72);
		frame.getContentPane().add(btn_brisanje);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_0.getText();
				textField.setText(number);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_0.setBounds(105, 363, 85, 72);
		frame.getContentPane().add(btn_0);
		
		JButton btn_jedanko = new JButton("=");
		btn_jedanko.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				drugibroj = Integer.parseInt(textField.getText());
				
				if(operacija == "+")
				{
					rezultat = prvibroj + drugibroj;
				} else if (operacija == "-")
				{
					rezultat = prvibroj - drugibroj;
				} else if (operacija == "*")
				{
					rezultat = prvibroj * drugibroj;
				} else if (operacija == "/")
				{
					rezultat = prvibroj / drugibroj;
				}

				odgovor = String.format("%s", rezultat);
				textField.setText(odgovor);
				

				textField.setText(String.valueOf(odgovor));
				
			}
		});
		btn_jedanko.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_jedanko.setBounds(200, 363, 85, 72);
		frame.getContentPane().add(btn_jedanko);
		
		
		JButton btn_dijeljenje = new JButton("/");
		btn_dijeljenje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prvibroj = Integer.parseInt(textField.getText());
				operacija = "/";
				textField.setText(null);
			}
		});
		btn_dijeljenje.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_dijeljenje.setBounds(295, 363, 85, 72);
		frame.getContentPane().add(btn_dijeljenje);
	}
}
