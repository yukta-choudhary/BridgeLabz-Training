package com.smartcityworkshop;

public class BusService implements TransportService {
    private String route;
    private double fare;
    private String departureTime;

    public BusService(String route, double fare, String departureTime) {
        this.route = route;
        this.fare = fare;
        this.departureTime = departureTime;
    }

    public String getServiceName() { return "Bus"; }
    public double getFare() { return fare; }
    public String getRoute() { return route; }
    public String getDepartureTime() { return departureTime; }
}
