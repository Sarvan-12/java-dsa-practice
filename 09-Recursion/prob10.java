// print permutaions of the string 
public class prob10 {
    public static void printPerm(String str,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPerm(newStr, perm+curChar);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        printPerm(str, "");
        // System.out.println(str.substring(2));
    }
}

