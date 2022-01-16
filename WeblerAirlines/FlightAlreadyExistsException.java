package WeblerAirlines;

public class FlightAlreadyExistsException extends IllegalStateException{

    private Flight flight;

    public FlightAlreadyExistsException(Flight flight){
        this.flight = flight;
    }

    @Override
    public String getMessage() {
        return "Flight " + flight.flightNo + " already exists.";
    }
}
