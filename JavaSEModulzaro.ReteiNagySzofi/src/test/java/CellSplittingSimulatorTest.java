import cellsplittingsimulator.CellGroupSimulator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class CellSplittingSimulatorTest {

    private CellGroupSimulator testCellGroupSimulator;
    private long testDNA1 = 161343653429l, testDNA2 = 441669442829l, testDNA3 = 9918532837l;

    @BeforeEach
    public void beforeEach() {
        testCellGroupSimulator = new CellGroupSimulator();
    }

    @Test
    public void initialStateTest() {
        assertNull(testCellGroupSimulator.getCells());
        assertFalse(testCellGroupSimulator.isGrowing());
    }

    @Test
    public void growingTest() {
        assertDoesNotThrow(() -> {
            assertTimeout(Duration.ofSeconds(6), () -> {
                System.out.println("Growing cells with DNA1...");
                testCellGroupSimulator.growCells(testDNA1, 5, () -> {
                    assertEquals(1, testCellGroupSimulator.getCells().size());
                    assertTrue(testCellGroupSimulator.isGrowing());
                });
                while (testCellGroupSimulator.isGrowing()) ;
            });

            assertTimeout(Duration.ofSeconds(6), () -> {
                System.out.println("Growing cells with DNA2...");
                testCellGroupSimulator.growCells(testDNA2, 5, () -> {
                    assertEquals(6, testCellGroupSimulator.getCells().size());
                    assertTrue(testCellGroupSimulator.isGrowing());
                });
                while (testCellGroupSimulator.isGrowing()) ;
            });

            assertTimeout(Duration.ofSeconds(6), () -> {
                System.out.println("Growing cells with DNA3...");
                testCellGroupSimulator.growCells(testDNA3, 5, () -> {
                    assertEquals(1, testCellGroupSimulator.getCells().size());
                    assertTrue(testCellGroupSimulator.isGrowing());
                });
                while (testCellGroupSimulator.isGrowing()) ;
            });
        });
    }

    @Test
    public void errorTest() {
        assertDoesNotThrow(() -> testCellGroupSimulator.isGrowing());
        assertDoesNotThrow(() -> testCellGroupSimulator.stopGrowing());
        assertDoesNotThrow(() -> testCellGroupSimulator.growCells(testDNA1, 1, null));
        assertThrows(IllegalArgumentException.class, () -> testCellGroupSimulator.growCells(testDNA1, 0, () -> {
        }));
        assertThrows(IllegalArgumentException.class, () -> testCellGroupSimulator.growCells(testDNA1, -1, () -> {
        }));
    }

    @Test
    public void stopSimulationTest() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            testCellGroupSimulator.growCells(testDNA2, 10, null);
            try {
                Thread.sleep(200);
                testCellGroupSimulator.stopGrowing();
                while (testCellGroupSimulator.isGrowing()) ;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        assertThrows(AssertionError.class, () -> {
            assertTimeout(Duration.ofSeconds(1), () -> {
                testCellGroupSimulator.growCells(testDNA2, 10, null);
                while (testCellGroupSimulator.isGrowing()) ;
            });
        });
    }

    @Test
    public void toStringTest() {
        assertTimeout(Duration.ofSeconds(3), () -> {
            testCellGroupSimulator.growCells(testDNA2, 2, null);
            while (testCellGroupSimulator.isGrowing()) ;
            assertEquals("4 cells:\n" +
                    "Cell[441669442829]\n" +
                    "Cell[441669442830]\n" +
                    "Cell[441669442831]\n" +
                    "Cell[441669442832]\n", testCellGroupSimulator.toString());
        });
    }

}
