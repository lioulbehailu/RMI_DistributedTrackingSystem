import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class driverDetail extends JFrame {

	private JPanel contentPane;
	private JTable table;
	Vehicle vehic;
	ArrayList<Asset> list = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					driverDetail frame = new driverDetail();
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
	public driverDetail(Vehicle vehic) {
		this.vehic=vehic;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 825, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon icon= new ImageIcon(driverDetail.class.getResource("/Images/Logo_1.png"));
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
		label.setIcon(new ImageIcon(driverDetail.class.getResource("/Images/icons8-bus-filled-50_new.png")));
		label.setBounds(131, 53, 66, 66);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(driverDetail.class.getResource("/Images/Add_car_2_new.png")));
		label_1.setBounds(158, 32, 71, 76);
		panel_1.add(label_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(driverDetail.class.getResource("/Images/icons8-driver_new.png")));
		lblNewLabel.setBounds(207, 63, 50, 56);
		panel_1.add(lblNewLabel);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(driverDetail.class.getResource("/Images/icons8-manage-assest50_new.png")));
		label_2.setBounds(170, 94, 50, 56);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(driverDetail.class.getResource("/Images/Addcompany_new.png")));
		label_3.setBounds(116, 94, 66, 66);
		panel_1.add(label_3);
		
		JLabel lblComanyName = new JLabel("Vehicle Id");
		lblComanyName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComanyName.setBounds(53, 258, 86, 14);
		panel.add(lblComanyName);
		
		JLabel label0 = new JLabel("Driver Id");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(197, 293, 86, 14);
		panel.add(label0);
		
		JLabel lblComany = new JLabel("Driver Id");
		lblComany.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComany.setBounds(53, 313, 86, 14);
		panel.add(lblComany);
		
		JLabel label_4 = new JLabel("Vehicle Model");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(53, 374, 86, 14);
		panel.add(label_4);
		
		JLabel lblLicencePlate = new JLabel("Licence plate");
		lblLicencePlate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLicencePlate.setBounds(53, 433, 86, 14);
		panel.add(lblLicencePlate);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(313, 231, 421, 227);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			
			},
			new String[] {
				"Asset Id", "Asset Name", "Asset Detail"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(180);
		table.getColumnModel().getColumn(2).setMinWidth(20);
		scrollPane.setViewportView(table);
		
		ArrayList<Asset> list = vehic.assets;
		System.out.println(list.size());
		
		DefaultTableModel model =(DefaultTableModel) table.getModel();
		Object rowData[] = new Object[3];
		for(int i =0;i< list.size();i++)
		{
			rowData[0]=list.get(i).assetID;
			rowData[1]=list.get(i).assetName;
			rowData[2]=list.get(i).assetDetail;
			model.addRow(rowData);
		}
	
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(165, 259, 122, 25);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(149, 314, 122, 25);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(149, 375, 122, 25);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(149, 434, 122, 25);
		panel.add(label_8);
	}
	public void setcolor(JPanel panel){
		panel.setBackground(new Color(189, 195, 199));
	}
	public void resetcolor(JPanel panel){
		panel.setBackground(new Color(240,240,240));
	}
}
