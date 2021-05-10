package eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.utils;

public class MathUtils {

    private static final int EARTH_RADIUS = 6371 * 1000; // Approx Earth radius in meters

    private static double haversin(double val) {
        return Math.pow(Math.sin(val / 2), 2);
    }

    //returns the distance between two
    public static double distanceHaversine(double lat1, double lon1, double lat2, double lon2) {

        double dLat = Math.toRadians((lat2 - lat1));
        double dLong = Math.toRadians((lon2 - lon1));

        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        double a = haversin(dLat) + Math.cos(lat1) * Math.cos(lat2) * haversin(dLong);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return EARTH_RADIUS * c;
    }
}
