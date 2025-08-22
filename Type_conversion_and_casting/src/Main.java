//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TYPE-CONVERSION (widening/implicit)
        // 1.java automatically converts one data type to another.
        // 2.Convert Smaller size of type into larger size type.
        // 3.Also called widening/implicit conversion.
        // 4.No data loss.

        int a=10;
        System.out.println(a);
        double b=a;
        System.out.println(b);


        // TYPE-CASTING :(narrowing/explicit)
        // 1.Manual conversion of one data type to another data type.
        // 2.Possible Data loss
        // 3.Also called narrowing/explicit conversion.


//        double a=10.85;
//        int b= (int) a;
//        System.out.println(b);


        // string to int : explicit
//        String n="78";
//        int num=Integer.parseInt(n);
//        System.out.println(num+20);


        // int to string
//        int num=123;
//        String data=String.valueOf(num);
//        System.out.println(data+"dev");


        int num1,num2,num3;
        num1=25;
        num2=35;
        num3=45;
        int t=(num1+num2+num3)/3;
        System.out.println(t);
        







    }
}