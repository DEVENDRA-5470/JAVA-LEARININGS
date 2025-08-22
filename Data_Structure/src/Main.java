//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Array creation

//        int[] new_arr = new int[5];
//        new_arr[0]=12;
//        new_arr[1]=120;
//        new_arr[2]=20;
//        new_arr[3]=32;
//        new_arr[4]=42;
//        new_arr[1]=45;
//        System.out.println(new_arr[1]);
//
//        int[] my_arr={10,20,30,40,78};
//        my_arr[0]=50;
//        my_arr[6]=90;
//        System.out.println(my_arr[0]);
//        System.out.println(my_arr[6]);

//        Traversing
//        int[] marks={30,45,78,50,20,60,44};
//        for (int i=0 ; i<marks.length ; i++){
//            System.out.println(marks[i]);
//        }

//        sum of all the elements of the array.
//        Find out only odd element of the array.
//        Sum of all the even elements to the array.
//        Count no of odd and no of even elements.


        int sum=0;
        int[] marks={30,45,78,50,20,60,44};
        for (int i=0 ; i<marks.length ; i++){
            if (marks[i]%2!=0){
                System.out.println(marks[i]+" This is odd ");
            }
        }



    }
}