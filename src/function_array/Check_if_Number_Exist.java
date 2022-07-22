/*Take input from a user and check if the number exists in the array
        let the array is [1,3,5,7,2,4,6,8]
        Input: 7
        Output: Found in the position 3
       Input: 9
        Output: Found no element */

package function_array;

import java.util.Scanner;

public class Check_if_Number_Exist {
    public static void main(String[] args) {

        int[] array = {1, 3, 5, 7, 2, 4, 6, 8};

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int inputNum = input.nextInt();

        checkExist(array, inputNum);

    }

    public static void checkExist(int[] arr, int number) {

        int position = 0;
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {

            if (number == arr[i]) {

                position = i;
                flag = 1;
            }

        }

        if (flag == 1) {

            System.out.println("Number exists in the position " + position);

        } else {

            System.out.println("Number not found");
        }
    }

}
