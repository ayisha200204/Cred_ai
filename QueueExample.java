
import java.util.*;

public class QueueExample {

    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("50");
        pq.add("20");
        pq.add("30");

        System.out.println(pq);
        pq.remove("20");

        System.out.println("After Remove: " + pq);
    }
}