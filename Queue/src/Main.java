//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {

        //Queue<String> queue = new LinkedList<>(); // unbound
        Queue<String> queue = new ArrayBlockingQueue<>(3); // Bounded
        queue.offer("Shubham");
        queue.offer("shivam-1");
        queue.offer("shivam-2");

        boolean add = queue.offer("shivam-3");
        System.out.println(add);
        if (!add){
            System.out.println("Queue was full");
        }

        System.out.println(queue);

    }
}