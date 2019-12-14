
import com.teamdev.jxmaps.GeocoderRequest;
import com.teamdev.jxmaps.GeocoderCallback;
import com.teamdev.jxmaps.Marker;
import com.teamdev.jxmaps.MapViewOptions;
import com.teamdev.jxmaps.InfoWindow;
import com.teamdev.jxmaps.LatLng;
import com.teamdev.jxmaps.GeocoderStatus;
import com.teamdev.jxmaps.GeocoderResult;
import com.teamdev.jxmaps.Map;
import com.teamdev.jxmaps.MapReadyHandler;
import com.teamdev.jxmaps.MapStatus;
import com.teamdev.jxmaps.swing.MapView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MapViewer extends MapView {
	static ArrayList<Double> lats=null;
	static ArrayList<Double> longs=null;
	
    public MapViewer(MapViewOptions options) {
        super(options);
        setOnMapReadyHandler(new MapReadyHandler() {
            @Override
            public void onMapReady(MapStatus status) {
                if (status == MapStatus.MAP_STATUS_OK) {
                    final Map map = getMap();
                    map.setZoom(7.0);
                    GeocoderRequest request = new GeocoderRequest(map);
                    request.setAddress("A");

                    getServices().getGeocoder().geocode(request, new GeocoderCallback(map) {
                        @Override
                        public void onComplete(GeocoderResult[] result, GeocoderStatus status) {
                            if (status == GeocoderStatus.OK) {
                                //map.setCenter(result[0].getGeometry().getLocation());
                              //map.setCenter(new LatLng(35.91466, 10.312499));
                                map.setCenter (new LatLng(lats.get(0), longs.get(0)));
                                Marker marker = new Marker(map);                          
                                marker.setPosition(new LatLng(lats.get(0), longs.get(0)));
                                System.out.println(lats.get(0));
                                final InfoWindow window = new InfoWindow(map);
                                window.setContent("Vehicle_ID");
                                window.open(map, marker);
                                
                                
                            }
                        }
                    });
                }
            }
        });
    }

    public MapViewer(ArrayList<Double> lats,ArrayList<Double> longs) {

    	this.lats = lats;
    	this.longs = longs;
    	
    	//System.out.println(lats.get(0)+"vvvgvg");
    	
        MapViewOptions options = new MapViewOptions();
        options.importPlaces();
        final MapViewer mapView = new MapViewer(options);

        JFrame frame = new JFrame("Maps - Hello, World!");

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.add(mapView, BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
        
       /* VehicleMgt veh= new VehicleMgt("ASTU");
       // System.out.println(veh.getVehicleCount());
        veh.fetchVehiclesData();
        veh.addVehicle("vastu871", "ASTU", "dastu456", "Toyota Corrolla", "24344", 8.7657, 33.68678);
        veh.addAsset("aastu4356", "ASTU", "vastu871", "document", "for students graduation");
        System.out.println(veh.getVehicleCount());*/
        
        
    }
}

