import java.util.Scanner;
public class SpyNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isSpyNumber(number)) {
            System.out.println(number + " is a spy number ");
        } else {
            System.out.println(number + " is not a spy number ");
        }
        scanner.close();
    }
    public static boolean isSpyNumber(int number) {
        int originalNumber = number;
        int sumOfDigits = 0;
        int productOfDigits = 1;
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }
        return sumOfDigits == productOfDigits;
    }
}
