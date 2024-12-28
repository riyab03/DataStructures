package HashTables;

import java.util.ArrayList;
import java.util.Map;

public class HashTableLL<K,V>{
    int n;
    ArrayList<MyMapNode<K,V>>arr;

    HashTableLL(){
        this.n=10;
        this.arr=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            arr.add(null);
        }
    }

    public int getIndex(K key){
        return (Math.abs(key.hashCode()))%n;
    }

    public V getValue(K key){
        int index=getIndex(key);
        MyMapNode<K,V>head=arr.get(index);
        while(head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }

    public void putValue(K key,V value){
        int index=getIndex(key);
        MyMapNode<K,V>head=arr.get(index);
        while(head!=null){
            if(head.key.equals(key)){
                head.value=value;
                return;
            }
            head=head.next;
        }
        head=arr.get(index);
        MyMapNode<K,V>newNode=new MyMapNode<>(key,value);
        newNode.next=head;
        arr.set(index,newNode);
    }
}
