package Collections.LinkedList;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class UsingQueue {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>() {
        };

        //add element to queue
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");
        queue.add("6");
        System.out.println(queue);

        //Remove first element
        String front=queue.remove();
        System.out.println("First element Removed Is :"+front);

        System.out.println("Queue After operation:"+queue);

        //add element to check which element wll get peek
        String peek=queue.peek();
        System.out.println("Peeked element is:"+peek);

        System.out.println(queue);
    }
}
