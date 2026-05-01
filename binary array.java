import java.util.Scanner;
public class binaryarray {
    //part b
    // USER DEFINED FUNCTION
    public static int[] toBinaryArray(int num) {

        if (num == 0) {
            return new int[]{0};
        }

        // Count bits needed
        int count = 0;
        int temp = num;
        while (temp > 0) {
            count++;
            temp = temp / 2;
        }

        // Create array
        int[] bits = new int[count];

        // Fill array RIGHT to LEFT
        int index = count - 1;
        while (num > 0) {
            bits[index] = num % 2;
            index--;
            num = num / 2;
        }

        return bits;
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        int[] result = toBinaryArray(num);

        System.out.print("Binary of " + num + " = ");
        for (int bit : result) {
            System.out.print(bit);
        }
        System.out.println();

        System.out.println("\nArray Contents:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("bits[" + i + "] = " + result[i]);
        }
    }
}