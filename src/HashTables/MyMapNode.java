package HashTables;

public class MyMapNode<K,V>{
    K key;
    V value;
    MyMapNode<K,V>next;

    MyMapNode(K key, V value){
        this.key=key;
        this.value=value;
        this.next=null;
    }

//    public void setKey(K key) {
//        this.key = key;
//    }
//    public void setValue(K key) {
//        this.key = key;
//    }
//    public K getKey() {
//        return key;
//    }
//    public V getValue() {
//        return value;
//    }

}
