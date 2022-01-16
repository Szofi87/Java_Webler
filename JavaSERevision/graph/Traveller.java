package graph;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Traveller {
    private String name;
    private Town currentTown;
    private Set<Town> visitedTowns = new HashSet<>();

    public Traveller(String name, Town currentTown) {
        this.name = name;
        this.currentTown = currentTown;
        visitedTowns.add(currentTown);
        System.out.println("%s jelenleg itt van: %s".formatted(name, currentTown.getName()));
    }

    public void travel(int unvisitedTowns) {

        if(unvisitedTowns > 0) {
            currentTown = currentTown.getNeighbouringTowns().get(new Random().nextInt(currentTown.getNeighbouringTowns().size()));
            System.out.println("%s jelenleg itt van: %s".formatted(name, currentTown.getName()));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(!visitedTowns.contains(currentTown)) {
                visitedTowns.add(currentTown);
                travel(unvisitedTowns - 1);
            } else {
                travel(unvisitedTowns);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Town getCurrentTown() {
        return currentTown;
    }

    public void setCurrentTown(Town currentTown) {
        this.currentTown = currentTown;
    }
}
