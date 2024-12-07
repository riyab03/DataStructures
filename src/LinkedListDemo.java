public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer>l1=new LinkedList<>();
        System.out.println("Linked list in normal order");
        l1.add(56);
        l1.add(30);
        l1.add(70);
        l1.add(6);
        l1.add(3);
        l1.add(7);
        l1.display();

//        System.out.println("Linked list in reverse order");
//        l1.add2(70);
//        l1.add2(30);
//        l1.add2(56);
//        l1.add2(6);
//        l1.add2(3);
//        l1.add2(7);
//        l1.display();

        System.out.println("Linked list after deleting first number");
        l1.pop();
        l1.display();
    }
}
