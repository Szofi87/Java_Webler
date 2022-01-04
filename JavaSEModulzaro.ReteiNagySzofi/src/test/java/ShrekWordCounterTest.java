import bonus.ShrekTopWordsCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ShrekWordCounterTest {

    @Test
    public void testWordCounter() {
        String[] top10words = {"fiona", "i", "to", "a", "donkey", "and", "you", "shrek", "the"};

        ShrekTopWordsCalculator shrekTopWordsCalculator = new ShrekTopWordsCalculator();
        String[] result = shrekTopWordsCalculator.countTopWords(10);

        assertEquals(10, result.length);

        for (String word : top10words) {
            assertContains(result, word);
        }
    }

    private void assertContains(String[] words, String word) {
        for (String w : words) {
            if (w.equals(word)) {
                return;
            }
        }
        fail("%s is not one of the top 10 most common words in the script (\"fiona\", \"i\", \"to\", \"a\", \"donkey\", \"and\", \"you\", \"shrek\", \"the\")".formatted(word));
    }
}
