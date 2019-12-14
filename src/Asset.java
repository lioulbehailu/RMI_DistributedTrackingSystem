import java.io.Serializable;

public class Asset implements Serializable {
	public String companyID;
	public String vehicleID;
	public String assetID;
	public String assetName;
	public String assetDetail;
	
	public Asset(String companyID, String vehicleID, String assetID, String assetName,String assetDetail) {
		super();
		this.companyID = companyID;
		this.vehicleID = vehicleID;
		this.assetID = assetID;
		this.assetName = assetName;
		this.assetDetail= assetDetail;
	}
}
