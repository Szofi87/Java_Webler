package WeblerAirlines;

public enum Airport {
    BUD("Budapest Liszt Ferenc Repülőtér, Hungary"),
    LUT("London Luton Airport, UK"),
    JFK("John. F. Kennedy International Airport, USA"),
    HND("Tokyo International Airport, Japan");

    private final String name;

    Airport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
