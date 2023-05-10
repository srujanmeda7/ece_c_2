package ECE_C_APPS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class movie {

	private JFrame frame;
	private JTextField t1;
	String name,fs,ts;
	int ticket,bill;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movie window = new movie();
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
	public movie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 0));
		frame.setBounds(100, 100, 461, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKETS");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(107, 11, 251, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 103, 93, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE");
		lblNewLabel_2.setForeground(new Color(255, 250, 250));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(10, 166, 93, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TICKETS");
		lblNewLabel_3.setForeground(new Color(255, 250, 250));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(10, 224, 114, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBounds(112, 105, 246, 32);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Asuran", "Rc15", "Bheemla nayak"}));
		c1.setBounds(178, 173, 114, 22);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4"}));
		c2.setBounds(178, 224, 114, 22);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				payment p=new payment();
				 name= t1.getText();
				 fs=(String) c1.getSelectedItem();
				 ts=(String) c2.getSelectedItem();
				 ticket=Integer.parseInt(ts);
				 bill=0;
				if(fs=="RRR")
				{
				     JOptionPane.showMessageDialog(btnNewButton,
				    		 "Invalid"); 
				}
				else if(fs=="Asuran" )
				{
					
				      bill=ticket*200;
				      JOptionPane.showMessageDialog(btnNewButton,
						"Hello"+name+"\n movie: "+fs+
						  "\n Tickets: "+ts+
						  "\n Your bill :"+bill);
				}
				else if(fs=="Rc15" )
				{
					
				bill=ticket*150;
				JOptionPane.showMessageDialog(btnNewButton,
						"Hello"+name+"\n movie: "+fs+
						  "\n Tickets: "+ts+
						  "\n Your bill :"+bill);
				}
				else if(fs=="Bheemla nayak" )
				{
					
				bill=ticket*250;
				JOptionPane.showMessageDialog(btnNewButton,
						"Hello"+name+"\n movie: "+fs+
						  "\n Tickets: "+ts+
						  "\n Your bill :"+bill);
				}
				else 
				{
					JOptionPane.showMessageDialog(btnNewButton,"please select anyone");
				}
	
			 p.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnNewButton.setBounds(169, 306, 131, 37);
		frame.getContentPane().add(btnNewButton);
	}

	
}
