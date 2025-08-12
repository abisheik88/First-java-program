import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");
        System.out.println("What is it?");

        Scanner input=new Scanner(System.in);
        System.out.println(input.next());
        System.out.println(input.nextInt());
    }
}