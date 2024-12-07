package Queues;

import java.sql.SQLOutput;

public class LinkedList<T>{

    Node<T> head=null;
    Node<T> current=null;
    Node<T> top=head;

    public void add(T a){
        Node<T> a1=new Node(a);
        if(head==null){
            head=a1;
            current=head;
            top=head;
        }
        else{
            current.next=a1;
            current=current.next;
        }
    }

    public void add2(T a){
        Node<T> a1=new Node(a);
        if(head==null){
            head=a1;
            current=head;
            top=head;
        }
        else{
            a1.next=current;
            current=a1;
            head=current;
        }
    }
//   7 3 6

    public void display(){
        Node<T> temp=head;
        if(head==null){
            System.out.println("Linked List is Empty");
            return;

        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void pop(){
        Node<T> temp=head;
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        if(head.next==null){
            head=null;
            System.out.println("Linked List is Empty.");
        }
        head=head.next;
        top=head;
    }

    public void popLast(){
        Node<T> temp=head;
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;

    }

    public void peek() {
        System.out.println("Front element :"+top.data);
    }
}
