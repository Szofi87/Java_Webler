package cellsplittingsimulator;

import java.util.Random;

/*
 * Class representing a single cell
 * each cell has its on DNA (a long value)
 */
public class Cell {

    private long dna;

    public Cell(long dna) {
        // TODO implement
        this.dna = dna;
    }

    // simulate cell growth
    // this method takes a cellGroupSimulator where the grown cells will be added
    // and a timeLeft that represents the time left to grow in milliseconds
    public void grow(CellGroupSimulator cellGroupSimulator, long timeLeft) throws InterruptedException {

        // 1. create Random object using DNA as seed
        // !!! use the java.util.Random and nextInt() for compatibility with tests !!!
        Random random = new Random(dna); // TODO implement

        // 2. generate random number between 0 and 1000 and sleep for that many milliseconds
        // if the time left to grow is less than the time we need to grow the next generation
        // of cells, return from this function
        long sleepForMillis = random.nextInt(1000); // TODO implement

        // 3. generate random boolean
        // if true wait for the duration chosen (or until the thread is interrupted)
        // in step 2 and recursively grow another cell
        // otherwise return from function
        // child cell should have this cell's dna+1
        boolean growChildCell = random.nextBoolean();// TODO implement

        if (growChildCell) {
            // TODO implement
            if (sleepForMillis <= timeLeft) {
                Thread.sleep(sleepForMillis);
                timeLeft -= sleepForMillis;
            } else return;

            Cell childCell = new Cell(dna + 1);

            cellGroupSimulator.addCell(childCell);
            childCell.grow(cellGroupSimulator, timeLeft);
        }
    }


    @Override
    public String toString() {
        // TODO implement
        return "Cell[%d]".formatted(dna);
    }
}
