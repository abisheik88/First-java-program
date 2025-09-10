import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        //Here this scanner takes input from user we need to declare the scanner to some variable
        Scanner integerInput=new Scanner(System.in);

        //this system.out.print means it prints the arguments and takes next line also in same line
        System.out.print("Please Enter your Roll No:");

        //Here we are storing the integer input to rollNo variable with nextInt() method this nextInt is used to get integer input from the user
        int rollNo=integerInput.nextInt();

        //Now we are printing the input which we got from user and prints in console using system.out.println method which makes the next line into separate line
        System.out.println("Your Roll No is "+ rollNo);

        //Here we are storing the int as static one and prints it
        int a=2_34_000;
        System.out.println(a);

        System.out.print("Please Enter your Name:");
        String name=integerInput.nextLine();

        System.out.println("My name is "+name);

    }
}
