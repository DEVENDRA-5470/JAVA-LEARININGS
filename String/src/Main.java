//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //-------------------------- String

        // Definition of string
        // accessing of String
        // Methods of String
        // Traversing of String
        // Assignments of String

        // String in java is an object that holds sequences of characters.
        // like :"hello","1234","user@123$#"

//        String str1="programming python programming";
//        System.out.println(str1);

        // Accessing
//        int size=str1.length();
//        System.out.println(size);

        // charAt() : Return the character of given index.
//        int pos=5;
//        System.out.println(str1.charAt(pos-2));

        // indexOf() : Return index of first occur character.
//        System.out.println(str1.indexOf("g",11));

        // lastIndexOf() : Return index of last occur character.
//        System.out.println(str1.lastIndexOf("g"));

        // contains() : Sequence check return True/false.
//        boolean res=str1.contains("t");
//        System.out.println(res);

        // Startswith() : Check String starts with specfic string.
//            System.out.println(str1.startsWith("por"));
//            System.out.println(str1.endsWith("ing"));

//        String s1="java";
//        String s2="java";
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));

        String s1= new String( "java");
        String s2= new String("java");
        System.out.println(s1==s2); // reference compare
        System.out.println(s1.equals(s2)); // values compare
        System.out.println(s1.isEmpty());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());


    }
}