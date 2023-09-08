import java.util.Scanner;
public class WordAndLinePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        System.out.print("Enter a line: ");
        String line = scanner.nextLine();
        System.out.println("Word and Line Together in English: " + word + " " + line);
        scanner.close();
    }
}
