import java.util.HashSet;
import java.util.Set;

public class ex6 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Shrink window until no duplicates
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            set.add(s.charAt(i));
            maxLen = Math.max(maxLen, i - left + 1);
        }
        
        return maxLen;
    }
    public static void main(String[] args) {
        ex6 solution = new ex6();
        String testString = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(testString);
        System.out.println("The length of the longest substring without repeating characters in \"" + testString + "\" is: " + result);
        
        testString = "bbbbb";
        result = solution.lengthOfLongestSubstring(testString);
        System.out.println("The length of the longest substring without repeating characters in \"" + testString + "\" is: " + result);
        
        testString = "pwwkewp";
        result = solution.lengthOfLongestSubstring(testString);
        System.out.println("The length of the longest substring without repeating characters in \"" + testString + "\" is: " + result);
    }
    // Time: O(n), Space: O(min(m,n)) where m is charset size
} 
