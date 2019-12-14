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

public class main_page extends JFrame {
	
	private JPanel contentPane;
    public String Session_cid;
    public String server_address;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_page frame = new main_page(Session_cid);
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
	public main_page(String Session_cid,String server_address) {
		this.Session_cid = Session_cid;
		this.server_address=server_address;
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
		lblLogo.setIcon(new ImageIcon(main_page.class.getResource("/Images/Logo_1.png")));
		lblLogo.setBounds(24, 11, 184, 176);
		panel_1.add(lblLogo);
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ManageVehicle.class.getResource("/Images/icons8-bus-filled-50_new.png")));
		label.setBounds(131, 53, 66, 66);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ManageVehicle.class.getResource("/Images/Add_car_2_new.png")));
		label_1.setBounds(158, 32, 71, 76);
		panel_1.add(label_1);
		
		JLabel Label_2 = new JLabel("");
		Label_2.setIcon(new ImageIcon(ManageVehicle.class.getResource("/Images/icons8-driver_new.png")));
		Label_2.setBounds(207, 63, 50, 56);
		panel_1.add(Label_2);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(ManageVehicle.class.getResource("/Images/icons8-manage-assest50_new.png")));
		label_2.setBounds(170, 94, 50, 56);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ManageVehicle.class.getResource("/Images/Addcompany_new.png")));
		label_3.setBounds(116, 94, 66, 66);
		panel_1.add(label_3);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(343, 222, 142, 136);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblHome = new JLabel("Manage");
		lblHome.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHome.setBounds(34, 88, 57, 14);
		panel_2.add(lblHome);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(34, 11, 70, 89);
		panel_2.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(main_page.class.getResource("/Images/icons8-manage-assest50.png")));
		
		JLabel lblAsset = new JLabel("Asset");
		lblAsset.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAsset.setBounds(44, 100, 46, 14);
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(panel_2);
				lblNewLabel.setBounds(34, 11, 71, 77);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetcolor(panel_2);
				lblNewLabel.setBounds(34, 11, 70, 89);
			}
		});
		panel_2.add(lblAsset);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 240, 240));
		panel_3.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				ManageVehicle mv = new ManageVehicle(Session_cid,server_address);
				mv.setVisible(true);
				
			}
		});
		panel_3.setBounds(110, 222, 136, 136);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Manage");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(38, 86, 51, 14);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Vehicles");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(38, 99, 69, 14);
		panel_3.add(lblNewLabel_3);
		
		JLabel labelBus = new JLabel("");
		labelBus.setIcon(new ImageIcon(main_page.class.getResource("/Images/icons8-bus-filled-50.png")));
		labelBus.setBounds(36, 11, 64, 64);
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(panel_3);
				labelBus.setBounds(36, 11, 71, 77);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetcolor(panel_3);
				labelBus.setBounds(36, 11, 64, 64);
			}
		});
		panel_3.add(labelBus);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(240, 240, 240));
		panel_4.setBounds(575, 222, 142, 136);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblAddVehicle = new JLabel("Add Vehicle");
		lblAddVehicle.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddVehicle.setBounds(30, 111, 91, 14);
		panel_4.add(lblAddVehicle);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(main_page.class.getResource("/Images/Add_car_2.png")));
		label_4.setBounds(30, 22, 69, 78);
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(panel_4);
				label_4.setBounds(30, 22, 71, 77);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetcolor(panel_4);
				label_4.setBounds(30, 22, 69, 78);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				AddVehicleView av = new AddVehicleView(Session_cid,server_address);
				av.setVisible(true);
				
			}
			
		});
		panel_4.add(label_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(110, 386, 142, 136);
		panel.add(panel_5);
		
		JLabel lblAddAsset = new JLabel("Add Asset");
		lblAddAsset.setBackground(new Color(144, 12, 63));
		lblAddAsset.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddAsset.setBounds(29, 81, 87, 14);
		panel_5.add(lblAddAsset);
		
		JLabel label_add = new JLabel("");
		label_add.setIcon(new ImageIcon(main_page.class.getResource("/Images/baseline_add_circle_black_36dp.png")));
		label_add.setBounds(29, 11, 72, 72);
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(panel_5);
				label_add.setBounds(29, 11, 71, 77);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetcolor(panel_5);
				label_add.setBounds(29, 11, 72, 72);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				AddAssetView aas = new AddAssetView(Session_cid,server_address);
				aas.setVisible(true);
				
			}
		});
		panel_5.add(label_add);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(240, 240, 240));
		panel_6.setLayout(null);
		panel_6.setBounds(343, 386, 142, 136);
		panel.add(panel_6);
		
		JLabel lblAddDriver = new JLabel("Add Driver");
		lblAddDriver.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddDriver.setBounds(28, 93, 89, 14);
		panel_6.add(lblAddDriver);
		
		JLabel label_30 = new JLabel("");
		label_30.setBounds(29, 11, 88, 72);
		panel_6.add(label_30);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(main_page.class.getResource("/Images/icons8-driver.png")));
		label_10.setBounds(43, 21, 46, 49);
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(panel_6);
				label_10.setBounds(43, 21, 71, 77);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetcolor(panel_6);
				label_10.setBounds(43, 21, 46, 49);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				AddDriverView adv = new AddDriverView(Session_cid,server_address);
				adv.setVisible(true);
				
			}
		});
		panel_6.add(label_10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(240, 240, 240));
		panel_7.setLayout(null);
		panel_7.setBounds(575, 386, 142, 136);
		panel.add(panel_7);
		
		JLabel lblLogout = new JLabel("Logout");
		lblLogout.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLogout.setBounds(49, 97, 57, 14);
		panel_7.add(lblLogout);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(main_page.class.getResource("/Images/logout (1).png")));
		label_5.setBounds(39, 11, 74, 75);
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(panel_7);
				label_5.setBounds(39, 11, 80, 80);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetcolor(panel_7);
				label_5.setBounds(39, 11, 74, 75);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Login lg = new Login();
				lg.setVisible(true);
			}
		});
		panel_7.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(43, 21, 46, 49);
		panel_7.add(label_6);
	}
	public void setcolor(JPanel panel){
		panel.setBackground(new Color(189, 195, 199));
	}
	public void resetcolor(JPanel panel){
		panel.setBackground(new Color(240,240,240));
	}
}
