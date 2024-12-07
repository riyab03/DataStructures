package Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stacks<Integer>s=new Stacks<>();
        s.push(70);
        s.push(56);
        s.push(30);
        s.push(7);
        s.push(5);
        s.push(3);
        s.topElement();
    }
}
