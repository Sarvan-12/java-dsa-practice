import java.util.*;

public class ex7 {
    public static void main(String[] args) {
        // Input array
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Map to group anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Sort characters of the word to form the key
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String sorted = new String(letters);

            if (map.containsKey(sorted)) {
                map.get(sorted).add(word);  
            }else{
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(sorted, list);
            }
        }
        
        List<List<String>> result = new ArrayList<>(map.values());

        // Print the result
        System.out.println(result);
    }
}
