
import java.rmi.Naming;
import java.rmi.registry.*;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtCompanyid;
	private JTextField txtUserid;
	private JPasswordField passwordField;
	private JTextField textField;
	String server_address = "localhost";
	int xx,xy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setUndecorated(true);
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
	public Login() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 416);
		ImageIcon icon = new ImageIcon(main_page.class.getResource("/images/Logo_1.png"));
		setIconImage(icon.getImage());
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx=e.getX();
				xy=e.getY();
			}
		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x=e.getXOnScreen();
				int y=e.getYOnScreen();
				Login.this.setLocation(x-xx,y-xy);
			}
		});
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 313, 416);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Company Asset/Vehicles Tracking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(new Color(255, 239, 213));
		lblNewLabel.setBounds(35, 276, 293, 52);
		panel.add(lblNewLabel);
		
		JLabel lblAndManagement = new JLabel("and Management");
		lblAndManagement.setForeground(new Color(255, 239, 213));
		lblAndManagement.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAndManagement.setBounds(86, 298, 136, 52);
		panel.add(lblAndManagement);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/res/enable-gps-iphone-670x335_2.jpg")));
		label.setBounds(0, 0, 313, 227);
		panel.add(label);
		
		JLabel lblServerAddress = new JLabel("Server Address");
		lblServerAddress.setForeground(Color.WHITE);
		lblServerAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblServerAddress.setBounds(40, 350, 97, 14);
		panel.add(lblServerAddress);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.ITALIC, 15));
		textField.setText("localhost");
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});
		
		textField.setBounds(159, 346, 144, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String arg1 = txtCompanyid.getText();
				String arg2 = txtUserid.getText();
				String arg3 = passwordField.getText();
				server_address = textField.getText();
				LoginInterface stub;
				try {
					// String rmi_uri = "rmi://"+server_address+"/ABC";
					 stub = (LoginInterface)Naming.lookup("rmi://"+server_address+"/ABC"); 
			         stub.getuserdata(arg1, arg2, arg3);
						
						if(stub.checkpassword()){
							//System.out.print(stub.getCompany());
							JOptionPane.showMessageDialog(null, "Login Success to "+stub.getCompany());
							if(stub.getCompany().equals("sysadmin")){
								dispose();
								Admin_main_page adminview = new Admin_main_page(server_address);
								adminview.setVisible(true);
							}
							else{
								dispose();
								main_page mainview = new main_page(stub.getCompany(),server_address);
								mainview.setVisible(true);
							}
						}
							
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Algerian", Font.BOLD, 12));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(241,57,83));
		btnNewButton.setBounds(386, 321, 270, 30);
		contentPane.add(btnNewButton);
		
		txtCompanyid = new JTextField();
		txtCompanyid.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtCompanyid.setText("CompanyId");
		txtCompanyid.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCompanyid.setText("");
			}
		});
		txtCompanyid.setBounds(386, 57, 270, 44);
		contentPane.add(txtCompanyid);
		txtCompanyid.setColumns(10);
		
		JLabel lblCompanyid = new JLabel("CompanyId");
		lblCompanyid.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCompanyid.setBounds(386, 22, 112, 24);
		contentPane.add(lblCompanyid);
		
		JLabel lblUserid = new JLabel("UserID");
		lblUserid.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUserid.setBounds(386, 123, 46, 14);
		contentPane.add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(386, 213, 91, 24);
		contentPane.add(lblPassword);
		
		txtUserid = new JTextField();
		txtUserid.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtUserid.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtUserid.setText("");
			}
		});
		txtUserid.setText("UserId");
		txtUserid.setBounds(386, 160, 270, 42);
		contentPane.add(txtUserid);
		txtUserid.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(386, 248, 270, 44);
		contentPane.add(passwordField);
		
		JLabel lblX_close = new JLabel("X");
		lblX_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblX_close.setForeground(new Color(241,57,83));
		//lblX.setBackground(new Color(241,57,83));
		lblX_close.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblX_close.setBounds(702, 0, 8, 14);
		contentPane.add(lblX_close);
	}
}
