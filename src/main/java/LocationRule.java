/**
 * Created by usrc on 6/27/2016.
 */
public class LocationRule {
    String name = "";

    public LocationRule(double lat, double lon, double radius) {
        gps.setLat(lat);
        gps.setLon(lon);
        this.radius = radius;
    }

    public GPS getGps() {
        return gps;
    }

    GPS gps = new GPS();

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    double radius;
    public LocationRule(String line) {
        String[] strs = line.split(",");
        name = strs[0];
        gps.setLat(Double.parseDouble(strs[1]));
        gps.setLon(Double.parseDouble(strs[2]));
        radius = Double.parseDouble(strs[3]);
    }
}
