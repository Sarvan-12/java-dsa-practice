class ex5 {
    public int firstUniqChar(String s) {
        // Count frequency of each character
        int[] count = new int[26];
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if( !Character.isLetterOrDigit(c)){
                continue;
            }
            count[c - 'a']++;
        }
        
        // Find first character with count 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1; // No unique character found
    }
    public static void main(String[] args) {
        ex5 solution = new ex5();
        String testString = "leetcode@";
        int result = solution.firstUniqChar(testString);
        System.out.println("The first unique character in \"" + testString + "\" is at index: " + result);
        
        testString = "Loveleetcode";
        result = solution.firstUniqChar(testString);
        System.out.println("The first unique character in \"" + testString + "\" is at index: " + result);
        
        testString = "aabb";
        result = solution.firstUniqChar(testString);
        System.out.println("The first unique character in \"" + testString + "\" is at index: " + result);
    }
    // Time: O(n), Space: O(1) - fixed size array
}