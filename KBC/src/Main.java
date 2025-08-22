//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int attempt1=0;
        int skip=0;
        int score=0;


        System.out.println("Enter Your name : ");
        Scanner input=new Scanner(System.in);
        String user_name=input.nextLine();
        System.out.println("Welcome Mr/Mrs:"+user_name+" To KBC 🙏");

        System.out.println("Do You want to play KBC (yes/no) ? : ");
        String start=input.nextLine();
        if (start.equals("yes")){
            System.out.println("Lets play ✅");
            System.out.println("\n1.What is formula of salt ?");
            System.out.println("\n Do you want to attempt (y/n) ? :");
            String attempt=input.nextLine();
            if (attempt.equals("y")){
                attempt1=attempt1+1;
                System.out.println("a.hcl");
                System.out.println("b.nacl");
                System.out.println("c.c6h2so4");
                System.out.println("d.None of these");

                System.out.println("Choose any one option (a,b,c,d) : ");
                String opt=input.nextLine();
                if (opt.equals("b")){
                    score+=5000;
                    System.out.println("Correct Answer... ✅");
                }
                else {
                    System.out.println("Wrong Answer... ❌");
                }

            } else if (attempt.equals("n")) {
                skip+=1;
            }

        } else if (start.equals("no")){
            System.out.println("Thanku for visiting 🙏");
        }
        else{
            System.out.println("Wrong input.. ❌");
        }

        System.out.println("Attempted :"+attempt1);
        System.out.println("Skipped :"+skip);
        System.out.println("Score :"+score);


    }
}