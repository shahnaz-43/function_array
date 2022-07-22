/*6. Suppose a software system excepts valid credentials from user to logged in to the system.
if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked".
Let the username: admin, password: adm1n*/

package function_array;

import java.util.Scanner;

public class Temp_Account_Lock {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName = "admin";
        String password = "adm1n";

        System.out.println("Enter username");
        String inputUsername = input.next();

        System.out.println("Enter password");
        String inputPassword = input.next();

        int count = 0;

        while (count <= 2) {

            if ((!inputUsername.equals(userName)) || (!inputPassword.equals(password))) {
                System.out.println("Wrong entry. try again: Enter username");
                inputUsername = input.next();

                System.out.println("Enter password");
                inputPassword = input.next();

            } else {
                System.out.println("You are now logged in");
                break;
            }
            count++;
        }
        if (count > 2)
            System.out.println("Your user has been temporary locked");

    }
}