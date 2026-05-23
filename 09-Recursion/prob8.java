//print all unique subseq of the string
import java.util.HashSet;
public class prob8 {
    public static void subseq(String str,int idx,String newStr,HashSet<String> set){

        if(idx==str.length()){
            if(set.contains(newStr)){
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }           
        }   
        char curChar=str.charAt(idx);

        subseq(str,idx+1,newStr+curChar,set);
        subseq(str,idx+1,newStr,set);

    }
    public static void main(String[] args) {
        String str="abc";
        HashSet<String> set= new HashSet<>();
        subseq(str,0,"",set);
    }
}
