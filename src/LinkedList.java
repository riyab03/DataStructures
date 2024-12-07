public class LinkedList<T>{

    Node<T> head=null;
    Node<T> current=null;

    public void add(T a){
        Node<T>a1=new Node(a);
        if(head==null){
            head=a1;
            current=head;
        }
        else{
            current.next=a1;
            current=current.next;
        }
    }

    public void add2(T a){
        Node<T>a1=new Node(a);
        if(head==null){
            head=a1;
            current=head;
        }
        else{
            a1.next=current;
            current=a1;
            head=current;
        }
    }
//   56

    public void display(){
        Node<T>temp=head;
        if(head==null){
            System.out.println("Linked List is Empty");
            return;

        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
