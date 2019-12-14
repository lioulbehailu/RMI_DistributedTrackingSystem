import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.Naming;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterCompany extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	String server_address;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterCompany frame = new RegisterCompany();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public RegisterCompany(String server_address) {
		this.server_address= server_address;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 825, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon icon = new ImageIcon(main_page.class.getResource("/images/Logo_1.png"));
		setIconImage(icon.getImage());
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 809, 592);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(144, 12, 63));
		panel_1.setBounds(0, 0, 809, 187);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Company Asset/Vehicle ");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_4.setBounds(291, 32, 390, 38);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblTrackingManagementManagement = new JLabel("Tracking Management System");
		lblTrackingManagementManagement.setForeground(Color.WHITE);
		lblTrackingManagementManagement.setFont(new Font("Tahoma", Font.ITALIC, 23));
		lblTrackingManagementManagement.setBounds(468, 81, 390, 38);
		panel_1.add(lblTrackingManagementManagement);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(RegisterCompany.class.getResource("/Images/Logo_1.png")));
		lblLogo.setBounds(24, 11, 184, 176);
		panel_1.add(lblLogo);
		
		
		JLabel labellogo = new JLabel("");
		labellogo.setIcon(new ImageIcon(RegisterCompany.class.getResource("/Images/icons8-bus-filled-50_new.png")));
		labellogo.setBounds(131, 53, 66, 66);
		panel_1.add(labellogo);
		
		JLabel labellogo_1 = new JLabel("");
		labellogo_1.setIcon(new ImageIcon(RegisterCompany.class.getResource("/Images/Add_car_2_new.png")));
		labellogo_1.setBounds(158, 32, 71, 76);
		panel_1.add(labellogo_1);
		
		JLabel labellogo_2 = new JLabel("");
		labellogo_2.setIcon(new ImageIcon(RegisterCompany.class.getResource("/Images/icons8-driver_new.png")));
		labellogo_2.setBounds(207, 63, 50, 56);
		panel_1.add(labellogo_2);
		
		JLabel labellogo_3 = new JLabel("");
		labellogo_3.setIcon(new ImageIcon(RegisterCompany.class.getResource("/Images/icons8-manage-assest50_new.png")));
		labellogo_3.setBounds(170, 94, 50, 56);
		panel_1.add(labellogo_3);
		
		JLabel labellogo_4 = new JLabel("");
		labellogo_4.setIcon(new ImageIcon(RegisterCompany.class.getResource("/Images/Addcompany_new.png")));
		labellogo_4.setBounds(116, 94, 66, 66);
		panel_1.add(labellogo_4);
		
		
		JLabel lblCompanyName = new JLabel("Company");
		lblCompanyName.setBounds(183, 138, 60, 26);
		panel_1.add(lblCompanyName);
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(241, 144, 141, 14);
		panel_1.add(label_1);
		
		JLabel lblComanyName = new JLabel("Comany Id");
		lblComanyName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComanyName.setBounds(197, 233, 86, 14);
		panel.add(lblComanyName);
		
		textField = new JTextField();
		textField.setText("Comany Name");
		textField.setFont(new Font("Tahoma", Font.ITALIC, 15));
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});
		textField.setBounds(313, 216, 209, 42);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField.setText("");
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_1.setText("");
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(313, 285, 209, 42);
		panel.add(textField_1);
		
		JLabel label = new JLabel("Comany Name");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(197, 293, 86, 14);
		panel.add(label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(313, 360, 209, 42);
		panel.add(textField_2);
		
		JLabel lblComany = new JLabel("Username");
		lblComany.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComany.setBounds(197, 365, 86, 14);
		panel.add(lblComany);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(197, 432, 74, 14);
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(313, 432, 209, 42);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Add Company");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String arg1 = textField.getText();
				String arg2 = textField_1.getText();
				String arg3 = textField_2.getText();
				String arg4 = passwordField.getText();
				SystemAdmin_Int stub;
				try { 
					 stub = (SystemAdmin_Int)Naming.lookup("rmi://"+server_address+"/ABCD"); 
			         stub.getdata(arg1, arg2, arg3, arg4);
			         stub.registerUser();
			         stub.registerCompany();
				}
				catch(Exception e1){
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setBackground(new Color(144,12,63));
		btnNewButton.setBounds(314, 514, 208, 33);
		panel.add(btnNewButton);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(RegisterCompany.class.getResource("/Images/Addcompany.png")));
		label_2.setBounds(218, 514, 65, 67);
		panel.add(label_2);
		
		
		
		
		
	}
}
