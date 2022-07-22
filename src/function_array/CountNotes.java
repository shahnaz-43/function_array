/*2. Input an amount from the user and find out the number of notes from input amount in given array
[1000,500,100,50,20,10,5,2,1]
Input: 1256
Output:
1000 1
100 2
50 1
2 3 */

package function_array;

import java.util.Scanner;

public class CountNotes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] notes = {1000, 500, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("Please Enter total amount");
        int totalAmount = input.nextInt();
        System.out.println("Total amount is : "+totalAmount+"tk");


        findNotes(totalAmount, notes);

    }
    public static void findNotes(int totalAmount, int[] notes) {
        int x = totalAmount;

        for (int i = 0; i < notes.length; i++) {
            System.out.println("Number of " + notes[i] +"tk"+ " notes = " + x / notes[i]);
            x = x % notes[i];
        }

    }
}
