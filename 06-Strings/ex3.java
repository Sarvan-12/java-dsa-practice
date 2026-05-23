public class ex3 {
    public static void main(String[] args) {
        String a = "abc"; 
        String b = "def";
        int result = a.compareTo(b);         // negative (a < b)
        boolean equal = a.equals(b);         // false
        boolean equalIgnoreCase = a.equalsIgnoreCase("ABC"); // false for "abc"
        System.out.println(result);
        System.out.println(equal);
        System.out.println(equalIgnoreCase);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10; i++) {
            sb.append(i+" ");
        }
        // String res = sb.toString();
        System.out.println(sb);
        String strs[] = {"dog","racecar","car"};
        System.out.println(strs[0].charAt(0));
    }
}
