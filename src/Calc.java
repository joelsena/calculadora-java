import java.awt.EventQueue;
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
	private JTextField textField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
					frame.setVisible(true);
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
		
		textField = new JTextField();
		textField.setBounds(15, 11, 286, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(15, 120, 202, 196);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton bt1 = new JButton("1");
		bt1.setBackground(Color.LIGHT_GRAY);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				textField.setText("1");
			}
		});
		panel.add(bt1);

		JButton bt2 = new JButton("2");
		bt2.setBackground(Color.LIGHT_GRAY);
		panel.add(bt2);
		
		JButton bt3 = new JButton("3");
		bt3.setBackground(Color.LIGHT_GRAY);
		panel.add(bt3);
		
		JButton bt4 = new JButton("4");
		bt4.setBackground(Color.LIGHT_GRAY);
		panel.add(bt4);
		
		JButton bt5 = new JButton("5");
		bt5.setBackground(Color.LIGHT_GRAY);
		panel.add(bt5);
		
		JButton bt6 = new JButton("6");
		bt6.setBackground(Color.LIGHT_GRAY);
		panel.add(bt6);
		
		JButton bt7 = new JButton("7");
		bt7.setBackground(Color.LIGHT_GRAY);
		panel.add(bt7);
		
		JButton bt8 = new JButton("8");
		bt8.setBackground(Color.LIGHT_GRAY);
		panel.add(bt8);
		
		JButton bt9 = new JButton("9");
		bt9.setBackground(Color.LIGHT_GRAY);
		panel.add(bt9);
		
		JLabel label = new JLabel("");
		panel.add(label);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setBackground(Color.LIGHT_GRAY);
		panel.add(btnNewButton_9);
		
		JLabel label_1 = new JLabel("");
		panel.add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(227, 69, 74, 247);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(5, 0,0, 0));
		
		JButton btMenos = new JButton("-");
		btMenos.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btMenos);
		
		JButton btMulti = new JButton("*");
		btMulti.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btMulti);
		
		JButton btDiv = new JButton("\u00F7");
		btDiv.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btDiv);
		
		JButton btMais = new JButton("+");
		btMais.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btMais);
		
		JButton btIgual = new JButton("=");
		btIgual.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btIgual);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(15, 69, 202, 38);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.LIGHT_GRAY);
		panel_2.add(btnC);
		
		JButton btRaiz = new JButton("\u221A");
		btRaiz.setBackground(Color.LIGHT_GRAY);
		panel_2.add(btRaiz);
	}
}
