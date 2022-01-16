package WeblerAirlines;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Controller {

    private static FlightBT flights;
    private static List<Journey> journeys = new ArrayList<>();

    public static void main(String[] args) {
        addJourneys();
        menu();
    }

    private static void addJourneys() {
        for (int i = 0; i < Airport.values().length; i++) {
            for (int l = i + 1; l < Airport.values().length; l++) {
                journeys.add(new Journey(Airport.values()[i], Airport.values()[l], 180));
                journeys.add(new Journey(Airport.values()[l], Airport.values()[i], 180));
            }
        }
    }

    private static void menu() {
        int input = TerminalInput.select("Webler Airlines",
                "Exit",
                "Add Flight",
                "Display Flights");

        switch (input){
            case 0:
                Thread exitThread = new Thread(() -> {
                    System.out.println("Exiting in 5 seconds. Press enter to cancel");
                    try {
                        Thread.sleep(5000);
                        System.exit(0);
                    } catch (InterruptedException e) {}
                });
                exitThread.start();
                new Scanner(System.in).nextLine();
                exitThread.interrupt();
                System.out.println("Cancelled");
                break;
            case 1:
                String flightNo = TerminalInput.getString("Enter flight number");
                Journey journey = journeys.get(TerminalInput.select("Select journey", journeys.stream().toArray()));
                Date departure = TerminalInput.getDate("Please enter departure date");
                addFlight(flightNo, journey, departure);
                break;
            case 2:
                diplayFlights();
                break;

        }

        menu();
    }

    private static void diplayFlights() {
        if(flights == null) {
            System.out.println("No flights to display.");
        } else {
            System.out.println(flights);
        }
    }

    private static void addFlight(String flightNo, Journey journey, Date departure){
        if(flights == null) {
            flights = new FlightBT(flightNo, journey, departure);
        } else {
            try {
                flights.add(new FlightBT(flightNo, journey, departure));
            } catch (FlightAlreadyExistsException e) {
                e.printStackTrace();
            }
        }
    }
}
