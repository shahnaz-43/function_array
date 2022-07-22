/*5. Take 5 numbers from users in an array. Then find out the average number, how many even and
how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers()*/


package function_array;

import java.util.Scanner;

public class AverageEvenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] number = new int[5];
        double sum = 0;
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Please Enter 5 numbers : ");
        for (int i = 0; i < number.length; i++) {

            number[i] = input.nextInt();
        }

        double average = 0;
        for (int i = 0; i < number.length; i++) {
            double v = number[i];
            sum = sum + v;
            average = sum / number.length;
        }

        for (int i = 0; i < number.length; i++) {
            double v = number[i];
            if (v % 2 == 0) {
                evenCount = evenCount + 1;
            }
            if (v % 2 != 0) {
                oddCount = oddCount + 1;
            }
        }

        System.out.println("Five numbers average is " + average);
        System.out.println("Total even number is : "+ evenCount);
        System.out.println("Total odd number is : "+ oddCount);

    }
}


