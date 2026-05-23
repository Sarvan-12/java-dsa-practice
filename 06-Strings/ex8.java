import java.util.*;

public class ex8 {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int n = s.length();
        return pali(s, 0, n-1);
    }
    public static boolean pali(String s, int left, int right){
        if( left >= right ) return true;
        if( s.charAt(left) == s.charAt(right)){
            return pali(s, left + 1, right - 1);
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);
        
    }
}
