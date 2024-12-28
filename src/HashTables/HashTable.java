package HashTables;

public class HashTable {
    public static void main(String[] args) {
        HashTableLL<String,Integer>hashtable=new HashTableLL<>();
        String phrase="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words=phrase.split(" ");
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

        hashtable.remove("avoidable");
        System.out.println("After removing 'avoidable'");
        for(String word:words){
            if(hashtable.getValue(word)!=null){
                System.out.println(word+":"+hashtable.getValue(word));
            }
        }
    }
}
