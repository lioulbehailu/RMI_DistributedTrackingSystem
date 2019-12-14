
import java.rmi.Remote; 
import java.rmi.RemoteException; 
import java.util.*;

public interface LoginInterface extends Remote {
	
	public void getuserdata(String companyID, String userID, String password) throws Exception;
	public boolean checkpassword() throws Exception; 
	public String getCompany() throws Exception;
}
