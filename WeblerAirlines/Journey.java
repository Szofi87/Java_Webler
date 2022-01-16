package WeblerAirlines;

public class Journey {
    private Airport from, to;
    private int duration;

    public Journey(Airport from, Airport to, int duration) {
        this.from = from;
        this.to = to;
        this.duration = duration;
    }

    public Airport getFrom() {
        return from;
    }

    public Airport getTo() {
        return to;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "%s => %s, %d min".formatted(from, to, duration);
    }
}
