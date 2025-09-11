public class TypeCasting {
    public static void main(String[] args) {

        int num=(int)(67.56f);
        System.out.println(num);

        byte a =40;
        byte b=50;
        byte c=100;

        int d=(a*b)/c;
//Here for the below it works fine because the range of byte is from -127 to 127. So it checks and it falls in the range and accepts. Thi is constant Expressions
        byte e=40+50+30;
//Here if do the same like below, it throws error because whenever we do arithmetic with byte,short or char they are automatically promoted to int. So we are assigning a int value to byt so it throws the error
//        byte f=a+b+30;

        System.out.println(d);
    }
}
