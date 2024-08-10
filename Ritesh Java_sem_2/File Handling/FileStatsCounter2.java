import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileStatsCounter2 {
    public static void main(String[] args) {
        String filename = "ABC.txt"; // Replace with the actual file name

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            int characterCount = 0;
            int wordCount = 0;
            int spaceCount = 0;
            int lineCount = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                characterCount += line.length();
                spaceCount += countSpaces(line);
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
                lineCount++;
            }

            System.out.println("Character count: " + characterCount);
            System.out.println("Word count: " + wordCount);
            System.out.println("Space count: " + spaceCount);
            System.out.println("Line count: " + lineCount);

            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static int countSpaces(String line) {
        int count = 0;
        for (char c : line.toCharArray()) {
            if (Character.isWhitespace(c)) {
                count++;
            }
        }
        return count;
    }
}
