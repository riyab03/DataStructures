public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer>l1=new LinkedList<>();
        System.out.println("Linked list in normal order");
        l1.add(56);
        l1.add(30);
        l1.add(70);
        l1.display();
        System.out.println("Linked list in reverse order");
        l1.add2(70);
        l1.add2(30);
        l1.add2(56);
        l1.display();
    }
}
