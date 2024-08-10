import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WordReplacement {
    public static void main(String[] args) {
        String file1 = "ABC.txt";
        String file2 = "DEF.txt";
        String word1 = "word1";
        String word2 = "word2";

        try {
            // Read the content of file1
            BufferedReader reader = new BufferedReader(new FileReader(file1));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }
            reader.close();

            // Replace all occurrences of word1 with word2
            String replacedContent = content.toString().replaceAll(word1, word2);

            // Write the replaced content to file2
            BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
            writer.write(replacedContent);
            writer.close();

            // Count the number of replacements
            int numReplacements = replacedContent.split(word2, -1).length - 1;

            // Display the number of replacements
            System.out.println("Number of replacements: " + numReplacements);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
