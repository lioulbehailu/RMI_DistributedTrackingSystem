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

public class AddAssetView extends JFrame {

	private JPanel contentPane;
	String Session_cid;
	String server_address;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAssetView frame = new AddAssetView();
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
	public AddAssetView(String Session_cid,String server_address) {
		this.Session_cid = Session_cid;
		this.server_address = server_address;
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
		lblLogo.setIcon(new ImageIcon(AddAssetView.class.getResource("/Images/Logo_1.png")));
		lblLogo.setBounds(24, 11, 184, 176);
		panel_1.add(lblLogo);
		
		JLabel lblAddNewAsset = new JLabel("Add New Asset");
		lblAddNewAsset.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAddNewAsset.setForeground(Color.WHITE);
		lblAddNewAsset.setBounds(200, 128, 217, 48);
		panel_1.add(lblAddNewAsset);
		JLabel lblComanyName = new JLabel("Asset Id");
		lblComanyName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComanyName.setBounds(197, 233, 86, 14);
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
		
		JTextField txtEnterAssetId = new JTextField();
		txtEnterAssetId.setText("enter asset Id");
		txtEnterAssetId.setFont(new Font("Tahoma", Font.ITALIC, 12));
		txtEnterAssetId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEnterAssetId.setText("");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(txtEnterAssetId);
			}
			@Override
			public void mouseExited(MouseEvent e){
				resetcolor(txtEnterAssetId);
			}
		});
		txtEnterAssetId.setBounds(313, 216, 209, 42);
		panel.add(txtEnterAssetId);
		txtEnterAssetId.setColumns(10);
		
		JTextField txtEnterAssetName = new JTextField();
		txtEnterAssetName.setText("enter Asset name");
		txtEnterAssetName.setFont(new Font("Tahoma", Font.ITALIC, 12));
		txtEnterAssetName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEnterAssetName.setText("");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(txtEnterAssetName);
			}
			@Override
			public void mouseExited(MouseEvent e){
				resetcolor(txtEnterAssetName);
			}
		});
		txtEnterAssetName.setColumns(10);
		txtEnterAssetName.setBounds(313, 285, 209, 42);
		panel.add(txtEnterAssetName);
		
		JLabel lblAssetName = new JLabel("Asset name");
		lblAssetName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAssetName.setBounds(197, 293, 86, 14);
		panel.add(lblAssetName);
		
		JTextField txtEnterVehicleId = new JTextField();
		txtEnterVehicleId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEnterVehicleId.setText("");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(txtEnterVehicleId);
			}
			@Override
			public void mouseExited(MouseEvent e){
				resetcolor(txtEnterVehicleId);
			}
		});
		txtEnterVehicleId.setColumns(10);
		txtEnterVehicleId.setText("enter vehicle Id");
		txtEnterVehicleId.setFont(new Font("Tahoma", Font.ITALIC, 12));
		txtEnterVehicleId.setBounds(313, 360, 209, 42);
		panel.add(txtEnterVehicleId);
		
		JLabel lblComany = new JLabel("Vehicle ID");
		lblComany.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComany.setBounds(197, 365, 86, 14);
		panel.add(lblComany);
		
		JLabel lblPassword = new JLabel("Asset Detail");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(197, 432, 74, 14);
		panel.add(lblPassword);
		
		JButton btnNewButton = new JButton("Add Asset");
		btnNewButton.setForeground(Color.WHITE);
		
		btnNewButton.setBackground(new Color(144,12,63));
		btnNewButton.setBounds(313, 536, 208, 33);
		panel.add(btnNewButton);
		
		JTextField txtEnterAssetDetail = new JTextField();
		txtEnterAssetDetail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEnterAssetDetail.setText("");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(txtEnterAssetDetail);
			}
			@Override
			public void mouseExited(MouseEvent e){
				resetcolor(txtEnterAssetDetail);
			}
		});
		txtEnterAssetDetail.setText("enter asset detail");
		txtEnterAssetDetail.setFont(new Font("Tahoma", Font.ITALIC, 12));
		txtEnterAssetDetail.setBounds(313, 430, 209, 95);
		panel.add(txtEnterAssetDetail);
		txtEnterAssetDetail.setColumns(10);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String arg1 = txtEnterAssetId.getText();
				String arg2 = txtEnterAssetName.getText();
				String arg3 = txtEnterVehicleId.getText();
				String arg4 = txtEnterAssetDetail.getText();
		
				
				VehicleMgt_Int stub;
				try { 
					 stub = (VehicleMgt_Int)Naming.lookup("rmi://"+server_address+"/ABCDE"); 
			         stub.addAsset(arg1,Session_cid,arg3,arg2,arg4);
			         JOptionPane.showMessageDialog(null, "you have Succefully added asset named: "+arg2);
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
				
				
				
			}
		});
		
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
