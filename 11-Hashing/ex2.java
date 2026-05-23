import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // insert
        map.put("India", 120);
        map.put("us",30);
        map.put("china",150);
        System.out.println(map);
        map.put("china",180); //updates 
        System.out.println(map);

        // search
        System.out.println(map.containsKey("us"));
        System.out.println(!map.containsKey("china"));

        System.out.println(map.get("china"));

        // iterator
        for(Map.Entry<String, Integer> items : map.entrySet()){
            System.out.println(items.getKey()+" ");
            System.out.println(items.getValue()+" ");
        } 
        
        ArrayList<Integer> values = new ArrayList<>(map.values());
        System.out.println("values: " + values);

        // delete
        map.remove("china");
        System.out.println(map);
        
        // size
        int size = map.size();
        System.out.println("Size of map: " + size);

        // clear
        map.clear();
        System.out.println("Map after clear: " + map);

        // check if empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Is map empty? " + isEmpty);     
    }
}
