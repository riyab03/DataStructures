package Queues;

public class Queue <T>{
    LinkedList<T> l1=new LinkedList<>();
    public void enqueue(T a){
        l1.add(a);
    }
    public void front(){
        l1.peek();
    }
    public void dequeue(){
        l1.pop();
    }
}
