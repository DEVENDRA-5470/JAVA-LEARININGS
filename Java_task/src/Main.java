
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your Marks : ");
        int marks=input.nextInt();

        if (marks >90 && marks<=100){
            System.out.println("Grade A+");

        } else if (marks>80) {
            System.out.println("Grade B+");
        }

        else if (marks>70) {
            System.out.println("Grade C+");
        }

        else if (marks>60) {
            System.out.println("Grade D+");
        }

        else {
            System.out.println("Failed");
        }
    }
}