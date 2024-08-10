import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;

        while (true) {
            System.out.print("Enter a sentence (or 'quit' to exit): ");
            String sentence = scanner.nextLine();

            if (sentence.equalsIgnoreCase("quit")) {
                break;
            }

            int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

            for (char ch : sentence.toCharArray()) {
                switch (Character.toLowerCase(ch)) {
                    case 'a':
                        countA++;
                        break;
                    case 'e':
                        countE++;
                        break;
                    case 'i':
                        countI++;
                        break;
                    case 'o':
                        countO++;
                        break;
                    case 'u':
                        countU++;
                        break;
                }
            }

            totalA += countA;
            totalE += countE;
            totalI += countI;
            totalO += countO;
            totalU += countU;

            System.out.println("Count for sentence: ");
            System.out.println("A: " + countA);
            System.out.println("E: " + countE);
            System.out.println("I: " + countI);
            System.out.println("O: " + countO);
            System.out.println("U: " + countU);
            System.out.println();
        }

        System.out.println("Total count for all sentences: ");
        System.out.println("A: " + totalA);
        System.out.println("E: " + totalE);
        System.out.println("I: " + totalI);
        System.out.println("O: " + totalO);
        System.out.println("U: " + totalU);

        scanner.close();
    }
}
