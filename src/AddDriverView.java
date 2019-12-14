import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
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

public class AddDriverView extends JFrame {

	private JPanel contentPane;
	String Session_cid;
	String server_address;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddDriverView frame = new AddDriverView();
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
	public AddDriverView(String Session_cid,String server_address) {
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
		lblLogo.setIcon(new ImageIcon(AddDriverView.class.getResource("/Images/Logo_1.png")));
		lblLogo.setBounds(24, 11, 184, 176);
		panel_1.add(lblLogo);
		
		JLabel lblAddNewDriver = new JLabel("Add New Driver");
		lblAddNewDriver.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAddNewDriver.setForeground(Color.WHITE);
		lblAddNewDriver.setBounds(194, 138, 206, 38);
		panel_1.add(lblAddNewDriver);
		JLabel lblComanyName = new JLabel("Driver Id");
		lblComanyName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComanyName.setBounds(197, 261, 86, 14);
		panel.add(lblComanyName);
		
		
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
		
		JTextField txtEnterDriverId = new JTextField();
		txtEnterDriverId.setText("enter driver Id");
		txtEnterDriverId.setFont(new Font("Tahoma", Font.ITALIC, 12));
		txtEnterDriverId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEnterDriverId.setText("");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(txtEnterDriverId);
			}
			@Override
			public void mouseExited(MouseEvent e){
				resetcolor(txtEnterDriverId);
			}
		});
		txtEnterDriverId.setBounds(313, 248, 209, 42);
		panel.add(txtEnterDriverId);
		txtEnterDriverId.setColumns(10);
		
		JTextField txtEnterDriverName = new JTextField();
		txtEnterDriverName.setText("enter Driver name");
		txtEnterDriverName.setFont(new Font("Tahoma", Font.ITALIC, 12));
		txtEnterDriverName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEnterDriverName.setText("");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(txtEnterDriverName);
			}
			@Override
			public void mouseExited(MouseEvent e){
				resetcolor(txtEnterDriverName);
			}
		});
		txtEnterDriverName.setColumns(10);
		txtEnterDriverName.setBounds(313, 337, 209, 42);
		panel.add(txtEnterDriverName);
		
		JLabel lblAssetName = new JLabel("Driver name");
		lblAssetName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAssetName.setBounds(197, 350, 86, 14);
		panel.add(lblAssetName);
		
		JTextField txtEnterPhone = new JTextField();
		txtEnterPhone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEnterPhone.setText("");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(txtEnterPhone);
			}
			@Override
			public void mouseExited(MouseEvent e){
				resetcolor(txtEnterPhone);
			}
		});
		txtEnterPhone.setColumns(10);
		txtEnterPhone.setText("enter phone number");
		txtEnterPhone.setFont(new Font("Tahoma", Font.ITALIC, 12));
		txtEnterPhone.setBounds(313, 427, 209, 42);
		panel.add(txtEnterPhone);
		
		JLabel lblComany = new JLabel("Phone Number");
		lblComany.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComany.setBounds(197, 440, 97, 14);
		panel.add(lblComany);
		
		JButton btnNewButton = new JButton("Add Asset");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String arg1 = txtEnterDriverId.getText();
				String arg2 = txtEnterDriverName.getText();
				String arg3 = txtEnterPhone.getText();
		
				
				Double vlat=8.54645;
				Double vlong=38.56546;
				
				DriverMgt_Int stub;
				try { 
					 stub = (DriverMgt_Int)Naming.lookup("rmi://"+server_address+"/ABCDEF"); 
			         stub.addDriver(arg1,Session_cid,arg2,Integer.parseInt(arg3),0,vlat,vlong);
			         JOptionPane.showMessageDialog(null, "You hava Successfully added driver :"+arg2);
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBackground(new Color(144,12,63));
		btnNewButton.setBounds(313, 509, 208, 33);
		panel.add(btnNewButton);
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


