package Queues;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer>q=new Queue<>();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        q.enqueue(5);
        q.enqueue(3);
        q.front();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.front();
    }
}
