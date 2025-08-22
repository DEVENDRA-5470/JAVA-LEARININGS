//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter 1  for addition");
        System.out.println("Enter 2 for substraction");
        System.out.println("Enter 3 for Multiply");
        System.out.println("Enter 4 for Divide");

        System.out.println("Enter Your Choice :");
        int choice=input.nextInt();

        if (choice == 1){
            System.out.println("Enter your first num :");
            double num1=input.nextDouble();

            System.out.println("Enter your second num :");
            double num2=input.nextDouble();

            double res = num1+num2;
            System.out.println("Sum of "+num1+" and "+num2+" = "+res);
        }


    }
}