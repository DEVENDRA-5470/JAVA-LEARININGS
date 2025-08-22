//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // step:1
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();

        // step:2
        int[] arr = new int[size];

        // step:3
        System.out.println("Enter "+ size + " Elements :");
        for (int i= 0 ; i<size ; i++){
            arr[i]=sc.nextInt();
        }

        // step:4
        System.out.print("Your Elements :");
        for (int i=0 ; i< size ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}