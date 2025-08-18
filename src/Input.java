import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter your Roll No:");
        int rollNo=input.nextInt();

        System.out.println("Your Roll No is "+ rollNo);
    }
}
