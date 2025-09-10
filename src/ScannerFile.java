import java.util.Scanner;
//Using Single Scanner file got multiple User Inputs
public class ScannerFile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please Enter your Name:");
        String name=input.nextLine();

        System.out.println("Please Enter Your Age:");
        int age=input.nextInt();

        System.out.println("Please Enter your Phone No:");
        long phone=input.nextLong();

        System.out.println("Please Enter your CGPA:");
        float cgp=input.nextFloat();

        System.out.println("Are you Male?");
        boolean gender=input.nextBoolean();

        System.out.println("Please Enter your Net worth:");
        double networth=input.nextDouble();

        System.out.println("Thank You");

        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Phone no : "+ phone);
        System.out.println("CGPA : "+ cgp);
        if(!gender){
            System.out.println("Gender : Female");
        }else {
            System.out.println("Gender : Male");
        }
        System.out.println("Net Worth : "+networth);

        input.close();
    }
}
