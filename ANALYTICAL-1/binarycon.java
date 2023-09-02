import java.util.Scanner;

public class binarycon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();

        int decimalNumber = binaryToDecimal(binaryNumber);
        System.out.println("Decimal: " + decimalNumber);

        String octalNumber = decimalToOctal(decimalNumber);
        System.out.println("Octal: " + octalNumber);

        String hexadecimalNumber = decimalToHexadecimal(decimalNumber);
        System.out.println("Hexadecimal: " + hexadecimalNumber);
    }

    public static int binaryToDecimal(String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2);
    }

    public static String decimalToOctal(int decimalNumber) {
        return Integer.toOctalString(decimalNumber);
    }

    public static String decimalToHexadecimal(int decimalNumber) {
        return Integer.toHexString(decimalNumber).toUpperCase();
    }
}
