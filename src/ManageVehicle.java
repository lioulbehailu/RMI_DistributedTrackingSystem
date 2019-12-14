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
import java.awt.event.MouseListener;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class ManageVehicle extends JFrame {

	private JPanel contentPane;
	private JTable table;
	String Session_cid;
	public String server_address;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageVehicle frame = new ManageVehicle();
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
	public ManageVehicle(String Session_cid,String server_address) {
		
		this.Session_cid = Session_cid;
		this.server_address=server_address;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 825, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		lblNewLabel_4.setBounds(290, 32, 390, 38);
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
		lblLogo.setBounds(25, 11, 184, 176);
		panel_1.add(lblLogo);
		
		JLabel lblManageVehicle = new JLabel("Manage Vehicles");
		lblManageVehicle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblManageVehicle.setForeground(Color.WHITE);
		lblManageVehicle.setBounds(170, 138, 212, 38);
		panel_1.add(lblManageVehicle);
		
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(107, 245, 451, 215);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
					
					
				},
				new String[] {
					"Vehicle ID","Driver ID", "Vehicle Model", "Licence Plate", "Vehicle Detail", "Current Location"
				}
			));
			scrollPane.setViewportView(table);
		

		ArrayList<Vehicle> list=null;
	    VehicleMgt_Int stub=null;
			try { 
				 stub = (VehicleMgt_Int)Naming.lookup("rmi://"+server_address+"/ABCDE"); 
		         stub.setCompany(Session_cid);
		         stub.fetchVehiclesData();
		         stub.fetchassets();
		         stub.setassetsonvehicles();
		         System.out.println(stub.getVehicleCount());
		         
		         list  = (ArrayList<Vehicle>) stub.getVehicles();
			}
			catch(Exception e1){
				e1.printStackTrace();
			}
			
		DefaultTableModel model =(DefaultTableModel) table.getModel();
		Object rowData[] = new Object[6];
		for(int i =0;i< list.size();i++)
		{
			rowData[0]=list.get(i).vehicleID;
			rowData[1]=list.get(i).driverID;
			rowData[2]=list.get(i).vehicleModel;
			rowData[3]=list.get(i).licensePlate;
	
			rowData[4]="View Detail";
			rowData[5]="View Map";
			model.addRow(rowData);
		}
	
	final ArrayList<Vehicle> listfinal= list;
	table.addMouseListener(new MouseListener() {
		
	     
		public void mouseReleased(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {
			
				 int row=table.getSelectedRow();
				 int col=table.getSelectedColumn();
				 String s=(String)table.getValueAt(row, col);
				 //JOptionPane.showMessageDialog(null, col);
	
				 Vehicle myVehicle = listfinal.get(row);
				// System.out.println(myVehicle.assets.size());
				 if(col==4){
					 //vehicle detail .....
					 
					 driverDetail dd= new driverDetail(myVehicle);
					 dd.setVisible(true);
					 
					 
				 }
				 if(col==5){
					 
					 ArrayList<Double> lats=new ArrayList<>();
					 ArrayList<Double> longs=new ArrayList<>();
					 lats.add(0,myVehicle.lastLocationLat);
					 longs.add(0, myVehicle.lastLocationLong);
					 
					 MapViewer hell= new MapViewer(lats,longs);
					 hell.setVisible(true);
				 }	 
		}});
	}
}
