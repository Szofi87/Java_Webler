package cellsplittingsimulator;

import java.util.ArrayList;
import java.util.List;

public class CellGroupSimulator {

    // cells of this group
    private List<Cell> cells;

    // thread running the growing process in the background for this simulator
    private Thread growingThread;

    // start growing cells for a given duration with a given starting dna (random seed) and execute the specified runnable
    // when growing has finished (by reaching time limit or by stopping growing)
    public void growCells(long startingDNA, int seconds, Runnable growingFinishedRunnable) {
        // throw IllegalArgumentException if given duration is invalid
        // growingFinishedRunnable may be null, handle that case
        // TODO implement
        if (seconds <= 0) throw new IllegalArgumentException("Simulation time limit must be minimum 1 second");
        cells = new ArrayList<>();
        // create an initial cell with the given starter dna and start growing from that one
        // make sure to grow the cells on the appropriate thread
        // TODO implement
        growingThread = new Thread(() -> {
            Cell cell = new Cell(startingDNA);
            cells.add(cell);
            try {
                cell.grow(this, (seconds * 1000));
            } catch (InterruptedException e) {
                System.out.println("Growing Stopped");
            }
            if (growingFinishedRunnable != null) growingFinishedRunnable.run();
        });
        growingThread.start();
    }

    // add given cell to cell list
    void addCell(Cell cell) {

            cells.add(cell);
        }

    // tells whether the growingThread is still running
    public boolean isGrowing() {

            if (this.growingThread != null) {

                return this.growingThread.isAlive();

            } else return false;
        }

    // stops the growingThread
    public void stopGrowing() {

        if (this.growingThread != null) {

            this.growingThread.interrupt();
        }
    }

    /*
     * example toString result:
     *
     * 4 cells:
     * Cell[441669442829]
     * Cell[441669442830]
     * Cell[441669442831]
     * Cell[441669442832]
     *
     */
    @Override
    public String toString() {
        // TODO implement
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("%d cells:\n".formatted(cells.size()));
        for (Cell cell : cells) {
            stringBuilder.append(cell + "\n");
        }
        return stringBuilder.toString();
    }

    public List<Cell> getCells() {
        return cells;
    }

    public Thread getGrowingThread() {
        return growingThread;
    }
}
