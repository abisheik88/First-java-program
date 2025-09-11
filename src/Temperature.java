import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please Enter Temperature in Celsius");
        float tempC=input.nextFloat();

        //When you use this Formula inside 9/5 it converts the float into integer based on Type Conversion
        // it makes that into 1 so the Calculation must be Wrong
//        float tempF=(tempC*(9/5))+32;

        //To Calculate the Proper way use 9/5 as just without brackets otherwise make them as float like 9.0f and 5.0f otherwise 9/5=1.8. Use that
//        float tempF=(tempC*(9.0f/5.0f))+32;
        float tempF=(tempC * 1.8f) + 32;
        System.out.println("Temperature in Fahrenheit is "+tempF);

    }
}
