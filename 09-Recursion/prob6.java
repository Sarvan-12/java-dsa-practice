// remove dublicates in string 
public class prob6 {
    public static boolean map[]=new boolean[26];

    public static void removeDup(String str,int idx , String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char curChar=str.charAt(idx);
        if(map[curChar-'a']==false){
            newStr+=curChar;
            map[curChar-'a']=true;
        }
        removeDup(str,idx+1,newStr);
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        removeDup(str,0,"");
    }
}
