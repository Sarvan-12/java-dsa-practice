//print all subseq of the string
public class prob7 {
    public static void subseq(String str,int idx,String newStr){

        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        

        char curChar=str.charAt(idx);

        subseq(str,idx+1,newStr+curChar);
        subseq(str,idx+1,newStr);

    }
    public static void main(String[] args) {
        String str="abc";
        subseq(str,0,"");
    }
}
