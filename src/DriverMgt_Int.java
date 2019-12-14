import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface DriverMgt_Int extends Remote {
	public void fetchDriversData() throws RemoteException;
	public void addDriver(String did,String cid,String dn,int dp,int ds,Double lats,Double longs) throws RemoteException;
}