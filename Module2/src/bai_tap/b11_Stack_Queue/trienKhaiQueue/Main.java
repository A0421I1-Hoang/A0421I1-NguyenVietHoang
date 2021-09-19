package b11_Stack_Queue.trienKhaiQueue;

import static b11_Stack_Queue.trienKhaiQueue.Solution.*;

public class Main {
    public static void main(String args[] )
    {
        Queue  q = new Queue();
        q .front = q .rear =  null;
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);
        displayQueue(q);
        System.out.printf("\nDeleted value = %d", deQueue(q));
        System.out.printf("\nDeleted value = %d", deQueue(q));
        System.out.println("\n");
        displayQueue(q);
        System.out.println("\n");
        enQueue(q, 9);
        enQueue(q, 20);
        displayQueue(q);

    }
}
