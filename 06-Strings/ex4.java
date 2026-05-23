class ex4 {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            // Compare characters (case insensitive)
            // if (Character.toLowerCase(s.charAt(left)) != 
            //     Character.toLowerCase(s.charAt(right))) {
            //     return false;
            // }
            
            if((s.charAt(left) != (s.charAt(right)))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        ex4 solution = new ex4();
        String testString = "kotok";
        boolean result = solution.isPalindrome(testString);
        System.out.println("Is the string \"" + testString + "\" a palindrome? " + result);
    }
    // Time: O(n), Space: O(1)
}