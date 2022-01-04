package bonus;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;

public class ShrekTopWordsCalculator {

    // return N most frequently occurring words in Shrek's script (src/main/resources/shrek_script.txt)
    // ignore letter casing (Hey = hey)
    // ignore the following words: "a", "an", "the", "and"
    // ignore punctuation marks (.,?!-(){}'" etc.)


        // TODO implement

        public static void main (String[]args){
            for (String word : new ShrekTopWordsCalculator().countTopWords(10)) {
                System.out.println(word);
            }

        }
        public String[] countTopWords(int topN) {

            HashMap<String, Integer> wordCounts = new HashMap<>();

            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/main/resources/shrek_script.txt")));

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    line = line.replace(".", "");
                    line = line.replace(",", "");
                    line = line.replace("?", "");
                    line = line.replace("-", "");
                    line = line.replace("!", "");
                    line = line.replace("(", "");
                    line = line.replace(")", "");
                    line = line.replace("'", "");
                    line = line.replace("\"", "");
                    line = line.replace("{", "");
                    line = line.replace("}", "");

                    line = line.toLowerCase();

                    for (String word : line.split(" ")) {
                        if (wordCounts.containsKey(word)) {
                            wordCounts.put(word, wordCounts.get(word) + 1);
                        } else wordCounts.put(word, 1);
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return wordCounts.keySet().stream().sorted(Comparator.comparingInt(wordCounts::get)).skip(wordCounts.size() - topN).toArray(String[]::new);
        }
    }


