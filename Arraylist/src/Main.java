import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<String> stu_names= new ArrayList<>();

        // Adding Elements to the arraylist
        stu_names.add("THIS");
        stu_names.add("is");
        stu_names.add("Arraylist");
        stu_names.add(2,"aman");
        stu_names.add("INDIA");
        stu_names.add("AMERICA");
        stu_names.add("Oranges");

        System.out.println(stu_names);

        // Accessing Elements.
        System.out.println(stu_names.get(3));
        System.out.println(stu_names.getFirst());
        System.out.println(stu_names.getLast());

        // Update Elements
//        stu_names.set(0,"IQ-INDIA");
//        stu_names.set(0,"Google");

        // Remove Elements
//        System.out.println(stu_names);
//        stu_names.remove("Google");
//        String del= stu_names.remove(3);
//        System.out.println("Deleted Item -: "+del);

//          ArrayList<String> remove_this=new ArrayList<>();
//          remove_this.add("INDIA");
//          remove_this.add("Oranges");
//          stu_names.removeAll(remove_this);

//          stu_names.removeIf( n -> n=="THIS" || n=="INDIA");

          //stu_names.clear();

          System.out.println(stu_names);









    }
}