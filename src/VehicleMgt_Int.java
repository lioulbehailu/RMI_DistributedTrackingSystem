import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface VehicleMgt_Int extends Remote {
	public void setCompany(String companyID) throws RemoteException;
	public int getVehicleCount() throws RemoteException;
	public ArrayList<Vehicle> getVehicles() throws RemoteException;
	public void fetchVehiclesData() throws RemoteException;
	public ArrayList<Asset> getassetsonVehicle(String vehicleID) throws RemoteException;
	public void setassetsonvehicles() throws RemoteException;
	public void fetchassets() throws RemoteException;
	public void addVehicle(String vid,String cid,String did,String vm,String lp,Double lat,Double lon) throws RemoteException;
	public void addAsset(String aid,String cid,String vid,String aname,String adetail) throws RemoteException;
}
