import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Vehicle implements Serializable {
	public String companyID;
	public String vehicleID;
	public String driverID;
	public String vehicleModel;
	public String licensePlate;
	public Double lastLocationLat;
	public Double lastLocationLong;
	public ArrayList<Asset> assets=new ArrayList<>();
	
	public Vehicle(String companyID, String vehicleID, ArrayList<Asset> assets, String driverID, String vehicleModel,
			String licensePlate, Double lastLocationLat, Double lastLocationLong) {
		super();
		this.companyID = companyID;
		this.vehicleID = vehicleID;
		this.assets = assets;
		this.driverID = driverID;
		this.vehicleModel = vehicleModel;
		this.licensePlate = licensePlate;
		this.lastLocationLat = lastLocationLat;
		this.lastLocationLong = lastLocationLong;
	}
	public Vehicle( String vehicleID,String companyID,String driverID, String vehicleModel,
			String licensePlate, Double lastLocationLat, Double lastLocationLong) {
		super();
		this.companyID = companyID;
		this.vehicleID = vehicleID;
		this.driverID = driverID;
		this.vehicleModel = vehicleModel;
		this.licensePlate = licensePlate;
		this.lastLocationLat = lastLocationLat;
		this.lastLocationLong = lastLocationLong;
	}

}
