package Stack;

public class LinkedList<T>{

    Node<T> head=null;
    Node<T> top=null;
    public void add(T a){
        Node<T> a1=new Node(a);
        if(head==null){
            head=a1;
            top=head;
        }
        else{
            top.next=a1;
            top=top.next;
        }
    }

    public void add2(T a){
        Node<T> a1=new Node(a);
        if(head==null){
            head=a1;
            top=head;
        }
        else{
            a1.next=top;
            top=a1;
            head=top;
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

    public void topEle() {
        System.out.println(top.data);
    }
}
