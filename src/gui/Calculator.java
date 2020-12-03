package gui;
import java.util.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {
	private String s="";int x=1;
	private boolean valdot=true;// DECIMAL GET ENTER IF VALDOT IS TRUE	
	Vector <Double> vdouble= new Vector <Double>();
	Vector <Character> vchar= new Vector <Character> ();

	private JFrame frmCalculator;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setAlwaysOnTop(true);
		frmCalculator.setBackground(Color.BLACK);
		frmCalculator.setTitle("Calculator 2.0");
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\programming\\java\\eclipse\\gui\\bin\\download.png"));
		frmCalculator.getContentPane().setBackground(new Color(51, 51, 51));
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(0, 0, 0));
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setColumns(10);
		textField.setBounds(10, 10, 362, 44);
		frmCalculator.getContentPane().add(textField);
		
		JButton button = new JButton("C");
		button.setBackground(new Color(102, 102, 102));
		button.setForeground(new Color(255, 255, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s="";
				textField.setText(s);
				vdouble.clear();
				vchar.clear();
				valdot=true;
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.setBounds(23, 64, 60, 52);
		frmCalculator.getContentPane().add(button);
		
		JButton button_1 = new JButton("7");
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(102, 102, 102));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+="7";
				textField.setText(s);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_1.setBounds(23, 126, 60, 52);
		frmCalculator.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("8");
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setBackground(new Color(102, 102, 102));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+="8";
				textField.setText(s);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_2.setBounds(92, 126, 60, 52);
		frmCalculator.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("9");
		button_3.setForeground(Color.WHITE);
		button_3.setBackground(new Color(102, 102, 102));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+="9";
				textField.setText(s);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_3.setBounds(162, 126, 60, 52);
		frmCalculator.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.setForeground(Color.WHITE);
		button_4.setBackground(new Color(102, 102, 102));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+="4";
				textField.setText(s);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_4.setBounds(23, 188, 60, 52);
		frmCalculator.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setForeground(Color.WHITE);
		button_5.setBackground(new Color(102, 102, 102));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+="5";
				textField.setText(s);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_5.setBounds(92, 188, 60, 52);
		frmCalculator.getContentPane().add(button_5);
		
		
		JButton button_6 = new JButton("6");
		button_6.setForeground(Color.WHITE);
		button_6.setBackground(new Color(102, 102, 102));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+="6";
				textField.setText(s);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_6.setBounds(162, 188, 60, 52);
		frmCalculator.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("1");
		button_7.setForeground(Color.WHITE);
		button_7.setBackground(new Color(102, 102, 102));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+="1";
				textField.setText(s);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_7.setBounds(23, 250, 60, 52);
		frmCalculator.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("2");
		button_8.setForeground(Color.WHITE);
		button_8.setBackground(new Color(102, 102, 102));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+="2";
				textField.setText(s);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_8.setBounds(92, 250, 60, 52);
		frmCalculator.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("3");
		button_9.setForeground(Color.WHITE);
		button_9.setBackground(new Color(102, 102, 102));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+="3";
				textField.setText(s);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_9.setBounds(162, 250, 60, 52);
		frmCalculator.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.setForeground(Color.WHITE);
		button_10.setBackground(new Color(102, 102, 102));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+="0";
				textField.setText(s);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_10.setBounds(23, 311, 129, 52);
		frmCalculator.getContentPane().add(button_10);
		
		JButton button_11 = new JButton(".");
		button_11.setForeground(Color.WHITE);
		button_11.setBackground(new Color(102, 102, 102));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.length()>0 && valdot) 
				{
					s+=".";
					valdot=false;
					textField.setText(s);
				}				
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_11.setBounds(162, 311, 60, 52);
		frmCalculator.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("+");
		button_12.setForeground(Color.WHITE);
		button_12.setBackground(new Color(102, 102, 102));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(s.length()>0)
				{
					vdouble.add(Double.parseDouble(s));
					vchar.add('+');
					s="";
					valdot=true;
				}
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_12.setBounds(232, 188, 60, 114);
		frmCalculator.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.setForeground(Color.WHITE);
		button_13.setBackground(new Color(102, 102, 102));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
						if(s.length()>0 && vchar.size()!=0)
						{
							vdouble.add(Double.parseDouble(s));
							s="";
						}
						if(vchar.size()>0)
						{
							int i=0,j=0;
							double ans=vdouble.get(i++);
							for (; i<vdouble.size(); )
							{
								try
								{
									char c=vchar.get(j++);
									switch(c)
									{
									case '+':	ans+=vdouble.get(i++);
												break;
									case '-':	ans-=vdouble.get(i++);
												break;
									case '*':	ans*=vdouble.get(i++);
												break;
									case '/':	ans/=vdouble.get(i++);
												break;
									case '%':	ans%=vdouble.get(i++);
												break;
									
									}
								}
								catch(ArithmeticException a)
								{
									textField.setText(a.getMessage());
								}
							}
							vdouble.clear();
							vchar.clear();
							s=Double.toString(ans);
							textField.setText(s);
							valdot=true;
						}		
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_13.setBounds(232, 311, 130, 52);
		frmCalculator.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("-");
		button_14.setForeground(Color.WHITE);
		button_14.setBackground(new Color(102, 102, 102));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.length()>0)
				{
					vdouble.add(Double.parseDouble(s));
					vchar.add('-');
					s="";
					valdot=true;
				}
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_14.setBounds(232, 126, 60, 52);
		frmCalculator.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("*");
		button_15.setForeground(Color.WHITE);
		button_15.setBackground(new Color(102, 102, 102));
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.length()>0)
				{
					vdouble.add(Double.parseDouble(s));
					vchar.add('*');
					s="";
					valdot=true;
				}
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_15.setBounds(302, 126, 60, 52);
		frmCalculator.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("/");
		button_16.setForeground(Color.WHITE);
		button_16.setBackground(new Color(102, 102, 102));
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.length()>0)
				{
					vdouble.add(Double.parseDouble(s));
					vchar.add('/');
					s="";
					valdot=true;
				}
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_16.setBounds(302, 188, 60, 52);
		frmCalculator.getContentPane().add(button_16);
		
		JButton btnRemender = new JButton("R");
		btnRemender.setForeground(Color.WHITE);
		btnRemender.setBackground(new Color(102, 102, 102));
		btnRemender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.length()>0)
				{
					vdouble.add(Double.parseDouble(s));
					vchar.add('%');
					s="";
					valdot=true;
				}
			}
		});
		btnRemender.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRemender.setBounds(302, 250, 60, 52);
		frmCalculator.getContentPane().add(btnRemender);
		
		JButton button_18 = new JButton("<--");
		button_18.setForeground(Color.WHITE);
		button_18.setBackground(new Color(102, 102, 102));
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.length()>0)
				{
					s=s.substring(0, s.length()-1);
					textField.setText(s);
				}
			}
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_18.setBounds(232, 64, 130, 52);
		frmCalculator.getContentPane().add(button_18);
		frmCalculator.setBounds(100, 100, 396, 408);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
