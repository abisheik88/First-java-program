import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        //Here we used Scanner to get input from the user
        Scanner input=new Scanner(System.in);

        //Here User gets the first number from the user
        System.out.println("Enter the First number to Add");
        int num1=input.nextInt();

        //Here User gets the second number from user to add
        System.out.println("Enter the Second number to Add");
        int num2=input.nextInt();

        //Here we are summing the two numbers
        int sum=num1+num2;

        //Here we are printing the Sum of two numbers
        System.out.println("Sum of two numbers is "+sum);
    }
}
