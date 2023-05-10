package ECE_C_APPS;

import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class freind {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					freind window = new freind();
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
	public freind() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 28));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 625, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("your name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(160, 86, 107, 19);
		frame.getContentPane().add(lblNewLabel);
		
		t1= new JTextField();
		t1.setBackground(Color.WHITE);
		t1.setBounds(296, 89, 129, 28);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("your friend name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(108, 136, 159, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(296, 139, 129, 28);
		frame.getContentPane().add(t2);
		
		JLabel lblNewLabel_2 = new JLabel(" friendship calculator");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(160, 26, 279, 48);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1=t1.getText();
				String n2=t2.getText();
				Random r=new Random();
				int p=r.nextInt(9,100);
				JOptionPane.showMessageDialog(btnNewButton, "hello"+n1+"\n your frienship %:"+p);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(230, 198, 121, 43);
		frame.getContentPane().add(btnNewButton);
	}
}
