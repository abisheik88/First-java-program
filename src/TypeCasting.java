public class TypeCasting {
    public static void main(String[] args) {

        int num=(int)(67.56f);
        System.out.println(num);

        byte a =40;
        byte b=50;
        byte c=100;

        int d=(a*b)/c;
//Here for the below it works fine because the range of byte is from -127 to 127. So it checks and it falls in the range and accepts.
// This is for constant Expressions
        byte e=40+50+30;

//Here if do the same like below, it throws error because whenever we do arithmetic with byte,short or char they are automatically promoted to int.
// So we are assigning a int value to byt so it throws the error
//        byte f=a+b+30;

        System.out.println(d);
    }
}


//The order of Promotion in java is
// byte → short → int → long → float → double

//Java Primitives and their ranges

//Data Type	       Size	       Range

//byte	          8 bits	 -128 to 127
//short	          16 bits	 -32,768 to 32,767
//int	          32 bits	 -2,147,483,648 to 2,147,483,647
//long	          64 bits	 -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//float	          32 bits	 ~ ±3.4 × 10^38 (6–7 decimal digits precision)
//double	      64 bits	 ~ ±1.7 × 10^308 (15–16 decimal digits precision)
//char	          16 bits	 0 to 65,535 (Unicode characters)
//boolean	      JVM dep.	 true / false


//Rules For Type Promotion

// 1.All the Byte, Short and Char values are converted into Integer.
// 2.Then If any one of the Operands which we are doing Arithmetic operations which are Long then Whole of it promoted to Long
