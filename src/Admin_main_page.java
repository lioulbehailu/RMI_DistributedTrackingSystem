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

public class Admin_main_page extends JFrame {

	private JPanel contentPane;
	public String server_address;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
				try {
					Admin_main_page frame = new Admin_main_page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

	*//**
	 * Create the frame.
	 */
	public Admin_main_page(String server_address) {
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
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 240, 240));
		panel_2.setBounds(187, 288, 203, 187);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblHome = new JLabel("Add");
		lblHome.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHome.setBounds(93, 117, 57, 14);
		panel_2.add(lblHome);
		
		JLabel LabelAddcomp = new JLabel("");
		LabelAddcomp.setBounds(74, 27, 106, 121);
		panel_2.add(LabelAddcomp);
		LabelAddcomp.setIcon(new ImageIcon(Admin_main_page.class.getResource("/Images/Addcompany.png")));
		
		JLabel lblAsset = new JLabel("Company");
		lblAsset.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAsset.setBounds(76, 130, 61, 18);
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(panel_2);
				LabelAddcomp.setBounds(74, 27, 119, 137);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetcolor(panel_2);
				LabelAddcomp.setBounds(74, 27, 106, 121);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
					
							RegisterCompany frame = new RegisterCompany(server_address);
							frame.setVisible(true);
			}
		});
		panel_2.add(lblAsset);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(240, 240, 240));
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(panel_7);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetcolor(panel_7);
			}
		});
		panel_7.setLayout(null);
		panel_7.setBounds(482, 288, 196, 187);
		panel.add(panel_7);
		
		JLabel lblLogout = new JLabel("Logout");
		lblLogout.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLogout.setBounds(81, 112, 57, 14);
		panel_7.add(lblLogout);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(main_page.class.getResource("/Images/logout (1).png")));
		label_5.setBounds(71, 39, 57, 72);
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setcolor(panel_7);
				label_5.setBounds(71, 39, 67, 80);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetcolor(panel_7);
				label_5.setBounds(71, 39, 57, 72);
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
