package ECE_C_APPS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ecom {

	private JFrame frame;
	int i=0,j=0,k=0;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ecom window = new Ecom();
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
	public Ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 0));
		frame.setBounds(100, 100, 729, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amazon");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(320, 11, 115, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\admim\\Desktop\\71MaGTXl7ML._UY741_.jpg"));
		lblNewLabel_1.setBounds(39, 75, 165, 204);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\admim\\Desktop\\s1.jpg"));
		lblNewLabel_2.setBounds(226, 75, 165, 204);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\admim\\Desktop\\l1.jpg"));
		lblNewLabel_2_1.setBounds(427, 75, 154, 204);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Rs.499/-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(88, 303, 79, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Rs.799/-");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(275, 303, 69, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Rs.69,999/-");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(459, 303, 110, 14);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "black", "blue", "white "}));
		comboBox.setBounds(72, 331, 104, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"select ", "black ", "blue", "white", "red"}));
		comboBox_1.setBounds(257, 328, 120, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"select", "Grey", "White", "Gold"}));
		comboBox_2.setBounds(449, 328, 120, 22);
		frame.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Size", "S", "M", "L", "XL", "XXL", "XXXL"}));
		comboBox_3.setBounds(72, 364, 104, 22);
		frame.getContentPane().add(comboBox_3);
		
		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setModel(new DefaultComboBoxModel(new String[] {"Size", "7", "8", "9", "10"}));
		comboBox_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_3_1.setBounds(257, 364, 120, 22);
		frame.getContentPane().add(comboBox_3_1);
		
		JComboBox comboBox_3_1_1 = new JComboBox();
		comboBox_3_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "6GB Ram + 128 GB Stroage", "8GB Ram + 256 GB Stroage"}));
		comboBox_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_3_1_1.setBounds(449, 361, 120, 22);
		frame.getContentPane().add(comboBox_3_1_1);
		
		JLabel lb = new JLabel("CART : 0");
		lb.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb.setBounds(561, 15, 131, 31);
		frame.getContentPane().add(lb);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART :"+i);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(57, 397, 131, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				j++;
				lb.setText("CART :"+j);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(252, 397, 120, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				k++;
				lb.setText("CART :"+k);
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(438, 397, 131, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnUndoCart_1 = new JButton("Undo Cart");
		btnUndoCart_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i--;
				if(i>=0)
				lb.setText("CART :"+i);	
				else
					JOptionPane.showMessageDialog(btnNewButton,"No items Added");
			}
			
		});
		btnUndoCart_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUndoCart_1.setBounds(57, 428, 131, 23);
		frame.getContentPane().add(btnUndoCart_1);
		
		JButton btnUndoCart = new JButton("Undo Cart");
		btnUndoCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j--;
				if(j>=0)
					lb.setText("CART :"+j);	
					else
						JOptionPane.showMessageDialog(btnNewButton,"No items Added");
			}
		});
		btnUndoCart.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUndoCart.setBounds(252, 431, 131, 23);
		frame.getContentPane().add(btnUndoCart);
		
		JButton btnUncart = new JButton("Undo Cart");
		btnUncart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				k--;
				if(k>=0)
					lb.setText("CART :"+k);	
					else
						JOptionPane.showMessageDialog(btnNewButton,"No items Added");
			}
		});
		btnUncart.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUncart.setBounds(438, 430, 131, 23);
		frame.getContentPane().add(btnUncart);
	}
}
