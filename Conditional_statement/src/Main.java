
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //   Conditional Statement : In programming Conditional Statement is process used to check
        // a condition is true or false on this system will generate a specific output.

       /*1.Multiple if
        2.if else
        3.if elif/else if else
        4.Nesting chaining ladder if else.*/


        // syntax :
        // if (condition){
                // statements
        // }
        //else{
            // statements
        //}
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name ✅: ");
        String user_name=input.nextLine();

        System.out.println("Enter your num-1 :");
        int num1=input.nextInt();*/



        // Multiple if
        /*if (num1>10){
            System.out.println("Ha hai-1");
        }

        if (num1>7){
            System.out.println("Ha hai-2");
        }

        if (num1>12){
            System.out.println("Ha hai-3");
        }

        if (num1>8){
            System.out.println("Ha hai-4");
        }*/

        // if - else

//        if (num1>=18){
//            System.out.println("Hi 😁"+user_name+ "You are eligible for voting");
//        }
//
//        else{
//            System.out.println("Hi 😁"+user_name+ "You are not eligible for voting");
//        }

// if - else if - else
       /* int a = 200;

        if (a>500){
            System.out.println("yes 1");

        } else if (a>100) {
            System.out.println("yes 2");

        }
        else if (a>150) {
                System.out.println("yes 3");

        }

        else if (a>=100) {
            System.out.println("yes 4");

        }
        else{
            System.out.println("I dont know");
        }
*/


        // Nested if else.

        int a=20;
        if (a>10){
            System.out.println("Yes-1");

            if (a>20){
                System.out.println("Yes-2");
            }
            else {
                System.out.println("Nhi ayega ");
            }
        }


    }
}