import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SystemAdmin_Int extends Remote{

	public void registerUser() throws RemoteException;
	public void registerCompany() throws RemoteException;
	public void getdata(String arg1,String arg2,String arg3,String arg4) throws RemoteException;
}
