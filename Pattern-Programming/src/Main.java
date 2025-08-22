//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // Wap to create pattern of filled square 5x5.

//        int size=5;
//        for (int i=0 ; i<= size ; i++){
//            for (int j=i ; j<= size ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Hollow Square.

        int size=5;
        for (int i=1; i<=size ; i++){
            for (int j=1 ; j<=size ; j++){
                if(i==1 || i==size || j==1 || j==size){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



        }
    }
