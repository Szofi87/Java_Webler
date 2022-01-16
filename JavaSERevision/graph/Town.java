package graph;

import java.util.ArrayList;
import java.util.List;

public class Town {
    private String name;
    private List<Town> neighbouringTowns;

    public Town(String name) {
        this.name = name;
        this.neighbouringTowns = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Town> getNeighbouringTowns() {
        return neighbouringTowns;
    }

    public void setNeighbouringTowns(List<Town> neighbouringTowns) {
        this.neighbouringTowns = neighbouringTowns;
    }

    public void addNeighbouringTown(Town town) {
        this.neighbouringTowns.add(town);
        town.neighbouringTowns.add(this);
    }
}
