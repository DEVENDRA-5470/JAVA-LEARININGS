//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {

        LinkedList<String> stu_name_list= new LinkedList<>();

        stu_name_list.add("AMAN");
        stu_name_list.add("AJAY");
        stu_name_list.addLast("shubham");
        stu_name_list.add("ROHIT");
        stu_name_list.add("ABHISHEK");

//        for (int i=0 ; i<stu_name_list.size() ; i++) {
//            String val = stu_name_list.get(i);
//            System.out.println(System.identityHashCode(val)+" "+val);
//        }

//        System.out.println(stu_name_list);

        // update
//        stu_name_list.set(1,"RAHUL");
//        System.out.println(stu_name_list);

        // remove
//        stu_name_list.remove("ABHISHEK");
//        System.out.println(stu_name_list);

        // Access
//        String res=stu_name_list.getFirst();
        //String res=stu_name_list.getLast();
//        System.out.println(res);

        // traversing.
        for (int i=0 ; i<stu_name_list.size() ; i++) {
            System.out.println(stu_name_list.get(i));
        }


    }
}

