import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.Naming;

import javax.swing.JTextField;

public class AddVehicleView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_3;
	String Session_cid;
	String server_address;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddVehicleView frame = new AddVehicleView();
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
	public AddVehicleView(String Session_cid,String server_address) {
		this.server_address=server_address;
		this.Session_cid=Session_cid;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 825, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon icon = new ImageIcon(main_page.class.getResource("/images/Logo_1.png"));
		setIconImage(icon.getImage());
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 809, 592);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 809, 187);
		panel_1.setBackground(new Color(144, 12, 63));
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
		lblLogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLogo.setBounds(24, 11, 196, 187);
			}
			@Override
			public void mouseExited(MouseEvent e){
				lblLogo.setBounds(24, 11, 184, 176);
			}
		});
		lblLogo.setIcon(new ImageIcon(AddVehicleView.class.getResource("/Images/Logo_1.png")));
		lblLogo.setBounds(24, 11, 184, 176);
		panel_1.add(lblLogo);
		
		JLabel lblAddNewVehicle = new JLabel("Add A New Vehicle");
		lblAddNewVehicle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAddNewVehicle.setForeground(Color.WHITE);
		lblAddNewVehicle.setBounds(198, 127, 223, 38);
		panel_1.add(lblAddNewVehicle);
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ManageVehicle.class.getResource("/Images/icons8-bus-filled-50_new.png")));
		label.setBounds(131, 53, 66, 66);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ManageVehicle.class.getResource("/Images/Add_car_2_new.png")));
		label_1.setBounds(158, 32, 71, 76);
		panel_1.add(label_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ManageVehicle.class.getResource("/Images/icons8-driver_new.png")));
		lblNewLabel.setBounds(207, 63, 50, 56);
		panel_1.add(lblNewLabel);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(ManageVehicle.class.getResource("/Images/icons8-manage-assest50_new.png")));
		label_2.setBounds(170, 94, 50, 56);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ManageVehicle.class.getResource("/Images/Addcompany_new.png")));
		label_3.setBounds(116, 94, 66, 66);
		panel_1.add(label_3);
		
		JLabel lblComanyName = new JLabel("Vehicle Id");
		lblComanyName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComanyName.setBounds(197, 233, 86, 14);
		panel.add(lblComanyName);
		
		JTextField textField = new JTextField();
		textField.setText("enter vehicle Id");
		textField.setFont(new Font("Tahoma", Font.ITALIC, 12));
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(textField);
			}
			@Override
			public void mouseExited(MouseEvent e){
				resetcolor(textField);
			}
		});
		textField.setBounds(313, 216, 209, 42);
		panel.add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setText("enter Driver Id");
		textField_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_1.setText("");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(textField_1);
			}
			@Override
			public void mouseExited(MouseEvent e){
				resetcolor(textField_1);
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(313, 285, 209, 42);
		panel.add(textField_1);
		
		JLabel label0 = new JLabel("Driver Id");
		label0.setFont(new Font("Tahoma", Font.BOLD, 12));
		label0.setBounds(197, 293, 86, 14);
		panel.add(label0);
		
		JTextField textField_2 = new JTextField();
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_2.setText("");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(textField_2);
			}
			@Override
			public void mouseExited(MouseEvent e){
				resetcolor(textField_2);
			}
		});
		textField_2.setColumns(10);
		textField_2.setText("enter Vehicle Model");
		textField_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		textField_2.setBounds(313, 360, 209, 42);
		panel.add(textField_2);
		
		JLabel lblComany = new JLabel("Vehicle Model");
		lblComany.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComany.setBounds(197, 365, 86, 14);
		panel.add(lblComany);
		
		JLabel lblPassword = new JLabel("Licence Plates");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(197, 432, 74, 14);
		panel.add(lblPassword);
		
		JButton btnNewButton = new JButton("Add Vehicle");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String arg1 = textField.getText();
				String arg2 = textField_1.getText();
				String arg3 = textField_2.getText();
				String arg4 = textField_3.getText();
				
				Double vlat=8.54645;
				Double vlong=38.56546;
				VehicleMgt_Int stub;
				try { 
					 stub = (VehicleMgt_Int)Naming.lookup("rmi://"+server_address+"/ABCDE"); 
			         stub.addVehicle(arg1,Session_cid,arg2,arg3,arg4,vlat,vlong);
			         JOptionPane.showMessageDialog(null, "you Successfully add company: "+arg1);
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setBackground(new Color(144,12,63));
		btnNewButton.setBounds(314, 514, 208, 33);
		panel.add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_3.setText("");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(textField_3);
			}
			@Override
			public void mouseExited(MouseEvent e){
				resetcolor(textField_3);
			}
		});
		textField_3.setText("enter Licence Plates");
		textField_3.setFont(new Font("Tahoma", Font.ITALIC, 12));
		textField_3.setBounds(313, 430, 209, 42);
		panel.add(textField_3);
		textField_3.setColumns(10);
	}
	public void setcolor(JTextField t){
		t.setBackground(new Color(189,195,199));
	}
	public void resetcolor(JTextField t){
		t.setBackground(new Color(255,255,255));
	}
	public void setcolor(JPanel panel){
		panel.setBackground(new Color(189, 195, 199));
	}
	public void resetcolor(JPanel panel){
		panel.setBackground(new Color(240,240,240));
	}
}
