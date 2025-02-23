import java.util.HashMap;

public class Hashmap{
    public static void main(String[] args) {
        HashMap <Integer, String> hp=new HashMap<>();

        hp.put(32,"Sha");
        hp.put(33,"Ramlath");
        hp.put(35,"Sid");

        System.out.println("Items of hashmap: "+hp.entrySet());

        System.out.println("Size of the hashmap :"+hp.size());

        System.out.println("Keys of hashmap: "+hp.keySet());

        System.out.println("Values of hashmap: "+hp.values());

        System.out.println("Value for key 35:"+hp.get(35));

        System.out.println("Contains key 69:"+hp.containsKey(65));

        hp.remove(33);

        for(Integer key:hp.keySet()){
            System.out.println("Key:"+key+" , Value: "+hp.get(key));
        }


    }
}