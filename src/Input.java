import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter your Roll No:");
        int rollNo=input.nextInt();

        System.out.println("Your Roll No is "+ rollNo);

        int a=2_34_000;
        System.out.println(a);

        Scanner newInput=new Scanner(System.in);
        String name=newInput.nextLine();

        System.out.println("My name is "+name);

    }
}
