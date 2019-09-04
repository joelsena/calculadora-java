import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class Calc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(15, 11, 202, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 36, 202, 196);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnNewButton = new JButton("1");
		/*btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});*/
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("2");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("3");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("4");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("5");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton("6");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_5 = new JButton("9");
		panel.add(btnNewButton_5);
		
		JLabel label = new JLabel("");
		panel.add(label);
		
		JButton btnNewButton_9 = new JButton("0");
		panel.add(btnNewButton_9);
		
		JLabel label_1 = new JLabel("");
		panel.add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(227, 36, 74, 196);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(5, 0,0, 0));
		
		JButton button_1 = new JButton("-");
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("*");
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("\u00F7");
		panel_1.add(button_3);
		
		JButton button = new JButton("+");
		panel_1.add(button);
		
		JButton button_4 = new JButton("=");
		panel_1.add(button_4);
	}
}
