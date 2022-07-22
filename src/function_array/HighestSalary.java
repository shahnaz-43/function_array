//03. Find out the 3rd highest salary

package function_array;
import java.util.Arrays;

public class HighestSalary {

    public static void main(String[] args) {

        int salary[] = {35000, 25000, 28000, 32500, 44000, 32800};
        Arrays.sort(salary);

        System.out.println("3rd Highest Salary is : " + salary[salary.length - 3]);



    }

}