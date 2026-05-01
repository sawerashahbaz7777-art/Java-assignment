import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Binary of 0 = 0");
        } else {
            int n = num;
            String binary = "";

            while (n > 0) {
                int remainder = n % 2;      // Step 1: Get remainder
                binary = remainder + binary; // Step 2: Add to FRONT
                n = n / 2;                  // Step 3: Divide by 2
            }
            System.out.println("Binary of " + num + " = " + binary);
        }
    }
}