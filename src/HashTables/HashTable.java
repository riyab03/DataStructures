package HashTables;

public class HashTable {
    public static void main(String[] args) {
        HashTableLL<String,Integer>hashtable=new HashTableLL<>();
        String sentence="To be or not to be";
        String[] words=sentence.split(" ");
        for(String word:words){
            Integer count=hashtable.getValue(word);
            if(count==null){
                hashtable.putValue(word,1);
            }
            else{
                hashtable.putValue(word,count+1);
            }
        }
        System.out.println("Frequency of words:");
        for(String word:words){
            System.out.println(word+": "+hashtable.getValue(word));
        }
    }
}
