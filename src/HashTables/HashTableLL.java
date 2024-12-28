package HashTables;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

public class HashTableLL<K,V>{
    int n;
    LinkedList<MyMapNode<K,V>>list[];

    HashTableLL(){
        this.n=10;
        this.list= new LinkedList[n];
        for(int i=0;i<n;i++){
            list[i]=new LinkedList<>();
        }
    }

    public int getIndex(K key){
        return (Math.abs(key.hashCode()))%n;
    }

    public V getValue(K key){
        int index=getIndex(key);
        LinkedList<MyMapNode<K,V>>head=list[index];
        for (MyMapNode<K, V>node:head){
            if(node.key.equals(key)){
                return node.value;
            }
        }
        return null;
    }

    public void putValue(K key,V value){
        int index=getIndex(key);
        LinkedList<MyMapNode<K,V>>head=list[index];
        for(MyMapNode<K,V>node:head){
            if(node.key.equals(key)){
                node.value=value;
                return;
            }
        }

        head.add(new MyMapNode<>(key,value));
    }

    public void remove(K key) {
        int index=getIndex(key);
        LinkedList<MyMapNode<K, V>> head= list[index];
        for(MyMapNode<K,V>node:head){
            if(node.key.equals(key)){
                head.remove(node);
                return;
            }
        }
    }
}
