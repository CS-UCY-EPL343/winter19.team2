

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Client extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField address;
	private JTextField hphone;
	private JTextField phone;
	private JTextField date;
	private JTextField surname;
	private JTextField name;
	private JTextField id;
	static SQLprocedure proc = new SQLprocedure ();
	private JTextField email;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client window = new Client();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Client() {
		setResizable(false);
		initialize();
	}

	/**
	 * Initialize the contents of the
	 */
	private void initialize() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setBackground(new Color(135, 206, 250));
		setBounds(100, 100, 700, 543);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblInsertNewClient = new JLabel("INSERT NEW CLIENT");
		lblInsertNewClient.setForeground(new Color(0, 0, 0));
		lblInsertNewClient.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInsertNewClient.setBackground(new Color(135, 206, 250));
		lblInsertNewClient.setBounds(247, 11, 264, 36);
		getContentPane().add(lblInsertNewClient);
		



	   
		JLabel labelID = new JLabel("ID :");
		labelID.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelID.setForeground(new Color(34, 139, 34));
		labelID.setHorizontalAlignment(SwingConstants.RIGHT);
		labelID.setBounds(0, 70, 124, 14);
		getContentPane().add(labelID);

		JLabel label_1 = new JLabel("NAME :");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setForeground(new Color(34, 139, 34));
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(0, 123, 124, 14);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("SURNAME :");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setForeground(new Color(34, 139, 34));
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(0, 176, 124, 14);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("DATE OF BIRTH :");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setForeground(new Color(34, 139, 34));
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(0, 232, 124, 14);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("PHONE NUMBER :");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setForeground(new Color(34, 139, 34));
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(0, 320, 124, 14);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("HOME NUMBER :");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setForeground(new Color(34, 139, 34));
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(0, 373, 124, 14);
		getContentPane().add(label_5);

		JLabel label_6 = new JLabel("ADDRESS :");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_6.setForeground(new Color(34, 139, 34));
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(0, 426, 124, 14);
		getContentPane().add(label_6);

		address = new JTextField();
		address.setColumns(10);
		address.setBounds(144, 423, 340, 20);
		getContentPane().add(address);

		hphone = new JTextField();
		hphone.setColumns(10);
		hphone.setBounds(144, 370, 170, 20);
		getContentPane().add(hphone);

		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(144, 317, 170, 20);
		getContentPane().add(phone);

		date = new JTextField();
		date.setColumns(10);
		date.setBounds(144, 229, 170, 20);
		getContentPane().add(date);

		surname = new JTextField();
		surname.setColumns(10);
		surname.setBounds(144, 176, 170, 20);
		getContentPane().add(surname);

		name = new JTextField();
		name.setColumns(10);
		name.setBounds(144, 123, 170, 20);
		getContentPane().add(name);

		id = new JTextField();
		id.setColumns(10);
		id.setBounds(144, 70, 85, 20);
		getContentPane().add(id);

		JButton btnBack = new JButton("<BACK");
		btnBack.setBackground(new Color(34, 139, 34));
		btnBack.setForeground(Color.WHITE);
		btnBack.setBounds(10, 11, 89, 23);
		getContentPane().add(btnBack);

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Authentication.MainMenu.setVisible(true);
					Authentication.InsertClient.dispose();
				} catch (Exception e) {
					;
				}
			}
		});

		JButton btnSave = new JButton("ADD");
		btnSave.setBackground(new Color(34, 139, 34));
		btnSave.setForeground(Color.WHITE);
		btnSave.setBounds(585, 414, 89, 23);
		getContentPane().add(btnSave);
		
		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setForeground(new Color(34, 139, 34));
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(0, 278, 124, 14);
		getContentPane().add(lblEmail);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(144, 275, 170, 20);
		getContentPane().add(email);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setIcon(new ImageIcon("images\\cool-background.jpg"));
		lblNewLabel.setBounds(0, 0, 1000, 549);
		getContentPane().add(lblNewLabel);
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					List<String> input = new ArrayList();
					input.add(id.getText());
					input.add(name.getText());
					input.add(surname.getText());
					input.add(date.getText());
					input.add(email.getText());
					input.add(phone.getText());
					input.add(hphone.getText());
					input.add(address.getText());
					input.add(Authentication.SSN);
					String output = proc.superFunction(input, "ClientInsert", true);
					if (output.equals("Error")) JOptionPane.showMessageDialog(null, "Error: Please fill all Information");
					else JOptionPane.showMessageDialog(null, "Client Added" );
				} catch (Exception e) {
					;
				}
			}
		});
	}
}