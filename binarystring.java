import java.util.Scanner;

public class binarystring {

    //partc
    // ============================================
    //        USER DEFINED FUNCTION
    // ============================================
    public static String toBinaryString(int num) {

        // Special case
        if (num == 0) {
            return "0";
        }

        String binary = "";  // Empty string to store bits

        while (num > 0) {
            int remainder = num % 2;       // Get remainder
            binary = remainder + binary;   // Add to FRONT of string
            num = num / 2;                 // Divide by 2
        }

        return binary;   // Return the string
    }

    // ============================================
    //              MAIN FUNCTION
    // ============================================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        // Call the function — store result in string
        String result = toBinaryString(num);

        // Print result
        System.out.println("Binary of " + num + " = " + result);

        // Print length
        System.out.println("Total Bits = " + result.length());

        // Print each character
        System.out.println("\nString Contents:");
        for (int i = 0; i < result.length(); i++) {
            System.out.println("result[" + i + "] = " + result.charAt(i));
        }
    }
}