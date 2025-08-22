import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class Employee {
            int id;
            String name;
            String dept;
            double salary;

            Employee(int id, String name, String dept, double salary) {
                this.id = id;
                this.name = name;
                this.dept = dept;
                this.salary = salary;
            }
        }

        ArrayList<Employee> employees = new ArrayList<>();

      // Create Employee

        employees.add(new Employee(123, "Aman", "IT", 10000));
        employees.add(new Employee(200, "Shivam", "HR", 40000));

        // Read Employee
        System.out.println("All Employees :");
        for (Employee emp:employees){
            System.out.println("------------------------");
            System.out.println("ID: "+emp.id);
            System.out.println("Name: "+emp.name);
            System.out.println("Dept: "+emp.dept);
            System.out.println("Salary: "+emp.salary);
            System.out.println("------------------------");
        }

    }

}