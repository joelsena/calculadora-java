import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.MatteBorder;

public class Calc extends JFrame {

	private JPanel contentPane;
	private JTextField calc;
	double num1 ;
	double num2 ;
	double res ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Calc() {
		super("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 330, 365);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		calc = new JTextField();
		calc.setBounds(15, 11, 286, 47);
		calc.setBackground(Color.DARK_GRAY);
		calc.setForeground(Color.white);
		calc.setFont(new Font("Consolas",Font.BOLD,17));
		contentPane.add(calc);
		calc.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(15, 120, 202, 196);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));

		JButton bt1 = new JButton("1");
		bt1.setBackground(Color.DARK_GRAY);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String rep = calc.getText();
				calc.setText(rep+"1");
			}
		});
		bt1.setFont(new Font("Consolas",Font.BOLD,17));
		bt1.setForeground(Color.white);
		panel.add(bt1);

		JButton bt2 = new JButton("2");
		bt2.setBackground(Color.DARK_GRAY);
		bt2.setForeground(Color.white);
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String rep = calc.getText();
				calc.setText(rep+"2");
			}
		});
		bt2.setFont(new Font("Consolas",Font.BOLD,17));
		panel.add(bt2);

		JButton bt3 = new JButton("3");
		bt3.setBackground(Color.DARK_GRAY);
		bt3.setForeground(Color.white);
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String rep = calc.getText();
				calc.setText(rep+"3");
			}
		});
		bt3.setFont(new Font("Consolas",Font.BOLD,17));
		panel.add(bt3);

		JButton bt4 = new JButton("4");
		bt4.setBackground(Color.DARK_GRAY);
		bt4.setForeground(Color.white);
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String rep = calc.getText();
				calc.setText(rep+"4");
			}
		});
		bt4.setFont(new Font("Consolas",Font.BOLD,17));
		panel.add(bt4);

		JButton bt5 = new JButton("5");
		bt5.setBackground(Color.DARK_GRAY);
		bt5.setForeground(Color.white);
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String rep = calc.getText();
				calc.setText(rep+"5");
			}
		});
		bt5.setFont(new Font("Consolas",Font.BOLD,17));
		panel.add(bt5);

		JButton bt6 = new JButton("6");
		bt6.setBackground(Color.DARK_GRAY);
		bt6.setForeground(Color.white);
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String rep = calc.getText();
				calc.setText(rep+"6");
			}
		});
		bt6.setFont(new Font("Consolas",Font.BOLD,17));
		panel.add(bt6);

		JButton bt7 = new JButton("7");
		bt7.setBackground(Color.DARK_GRAY);
		bt7.setForeground(Color.white);
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String rep = calc.getText();
				calc.setText(rep+"7");
			}
		});
		bt7.setFont(new Font("Consolas",Font.BOLD,17));
		panel.add(bt7);

		JButton bt8 = new JButton("8");
		bt8.setBackground(Color.DARK_GRAY);
		bt8.setForeground(Color.white);
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String rep = calc.getText();
				calc.setText(rep+"8");
			}
		});
		bt8.setFont(new Font("Consolas",Font.BOLD,17));
		panel.add(bt8);

		JButton bt9 = new JButton("9");
		bt9.setBackground(Color.DARK_GRAY);
		bt9.setForeground(Color.white);
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String rep = calc.getText();
				calc.setText(rep+"9");
			}
		});
		bt9.setFont(new Font("Consolas",Font.BOLD,17));
		panel.add(bt9);

		JLabel label = new JLabel("");
		panel.add(label);

		JButton bt0= new JButton("0");
		bt0.setBackground(Color.DARK_GRAY);
		bt0.setForeground(Color.white);
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String rep = calc.getText();
				calc.setText(rep+"0");
			}
		});
		bt0.setFont(new Font("Consolas",Font.BOLD,17));
		panel.add(bt0);

		JLabel label_1 = new JLabel("");
		panel.add(label_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(227, 69, 74, 247);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(5, 0,0, 0));

		JButton btMenos = new JButton("-");
		btMenos.setBackground(Color.DARK_GRAY);
		btMenos.setForeground(Color.white);
		btMenos.setFont(new Font("Consolas",Font.BOLD,17));
		btMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Double.parseDouble(calc.getText());
					calc.setText(" - ");
				}catch(Exception ae) {}
			}
		});
		panel_1.add(btMenos);

		JButton btMulti = new JButton("*");
		btMulti.setBackground(Color.DARK_GRAY);
		btMulti.setForeground(Color.white);
		btMulti.setFont(new Font("Consolas",Font.BOLD,17));
		btMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Double.parseDouble(calc.getText());
					calc.setText(" * ");
				}catch(Exception ae) {}
			}
		});
		panel_1.add(btMulti);

		JButton btDiv = new JButton("\u00F7");
		btDiv.setBackground(Color.DARK_GRAY);
		btDiv.setForeground(Color.white);
		btDiv.setFont(new Font("Consolas",Font.BOLD,17));
		btDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Double.parseDouble(calc.getText());
					calc.setText(" \u00F7 ");
				}catch(Exception ae) {}
			}
		});
		panel_1.add(btDiv);

		JButton btMais = new JButton("+");
		btMais.setBackground(Color.DARK_GRAY);
		btMais.setForeground(Color.white);
		btMais.setFont(new Font("Consolas",Font.BOLD,17));
		btMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Double.parseDouble(calc.getText());
					calc.setText(" + ");

				}catch(Exception ae) {}
			}
		});
		panel_1.add(btMais);

		JButton btIgual = new JButton("=");
		btIgual.setBackground(Color.DARK_GRAY);
		btIgual.setForeground(Color.white);
		btIgual.setFont(new Font("Consolas",Font.BOLD,17));
		btIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num2 = Double.parseDouble(calc.getText().substring(2));
					String opt = calc.getText().substring(1,2);
					switch(opt) {
					case "-":
						res = num1-num2;
						calc.setText(res+"");
						break;
					case "+":
						res = num1+num2;
						calc.setText(res+"");
						break;
					case "*":
						res = num1*num2;
						calc.setText(res+"");
						break;
					case "\u00F7":
						res = num1/num2;
						calc.setText(res+"");
						break;
					}
				}catch(Exception ae) {

				}
			}
		});
		panel_1.add(btIgual);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(15, 69, 202, 38);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));

		JButton btnC = new JButton("C");
		btnC.setBackground(Color.DARK_GRAY);
		btnC.setForeground(Color.white);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setText("");
			}
		});
		btnC.setFont(new Font("Consolas",Font.BOLD,17));
		panel_2.add(btnC);

		JButton btRaiz = new JButton("\u221A");
		btRaiz.setBackground(Color.DARK_GRAY);
		btRaiz.setForeground(Color.white);
		btRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					num1 = Double.parseDouble(calc.getText());
					res = Math.sqrt(num1);
					calc.setText(res+"");
				}catch(Exception e) {}
			}
		});
		btRaiz.setFont(new Font("Consolas",Font.BOLD,17));
		panel_2.add(btRaiz);
	}
}
