import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner integerInput=new Scanner(System.in);
        System.out.print("Please Enter your Roll No:");
        int rollNo=integerInput.nextInt();

        System.out.println("Your Roll No is "+ rollNo);

        int a=2_34_000;
        System.out.println(a);

        Scanner stringInput=new Scanner(System.in);
        String name=stringInput.nextLine();

        System.out.println("My name is "+name);

    }
}
