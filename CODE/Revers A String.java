import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String reversedString = reverse(inputString);
        System.out.println("Reverse of the input string in English: " + reversedString);
        scanner.close();
    }
    public static String reverse(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
