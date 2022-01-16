package graph;

public class Main {

    public static void main(String[] args) {
        Town budapest = new Town("Budapest");
        Town debrecen = new Town("Debrecen");
        Town miskolc = new Town("Miskolc");
        Town nyiregyhaza = new Town("Nyiregyhaza");
        Town pallag = new Town("Pallag");

        budapest.addNeighbouringTown(debrecen);
        budapest.addNeighbouringTown(miskolc);
        budapest.addNeighbouringTown(nyiregyhaza);
        debrecen.addNeighbouringTown(nyiregyhaza);
        debrecen.addNeighbouringTown(pallag);
        miskolc.addNeighbouringTown(nyiregyhaza);

        Traveller traveller = new Traveller("Toldi Miklos", budapest);

        traveller.travel(4);

    }

}
