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

    public void display(){
        current=head;
        if(head==null){
            System.out.println("Linked List is Empty");
            return;

        }
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}
