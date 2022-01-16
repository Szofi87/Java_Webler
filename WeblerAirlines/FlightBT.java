package WeblerAirlines;

import java.util.Date;

public class FlightBT extends Flight{

    private FlightBT left, right;

    public FlightBT(String flightNo, Journey journey, Date departure) {
        super(flightNo, journey, departure);
    }

    public FlightBT getLeft() {
        return left;
    }

    public void setLeft(FlightBT left) {
        this.left = left;
    }

    public FlightBT getRight() {
        return right;
    }

    public void setRight(FlightBT right) {
        this.right = right;
    }

    public void add(FlightBT flightBT) throws FlightAlreadyExistsException {
        if(this.compareTo(flightBT) == 0) {
            throw new FlightAlreadyExistsException(flightBT);
        } else if(this.compareTo(flightBT) < 0){
            if(this.right != null) this.right.add(flightBT);
            else this.right = flightBT;
        } else {
            if(this.left != null) this.left.add(flightBT);
            else this.left = flightBT;
        }
    }

    @Override
    public String toString() {
        return (left==null?"":left + "\n") + super.toString() +  (right==null?"":right + "\n");
    }
}
