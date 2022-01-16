package WeblerAirlines;

import java.util.Date;

public class Flight implements Comparable<Flight>{
    protected String flightNo;
    protected Journey journey;
    protected Date departure;

    public Flight(String flightNo, Journey journey, Date departure) {
        this.flightNo = flightNo;
        this.journey = journey;
        this.departure = departure;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public Journey getJourney() {
        return journey;
    }

    public Date getDeparture() {
        return departure;
    }

    @Override
    public int compareTo(Flight o) {
        return this.flightNo.compareTo(o.flightNo);
    }

    @Override
    public String toString() {
        return "[%s, %s, %tc]".formatted(flightNo, journey, departure);
    }
}
