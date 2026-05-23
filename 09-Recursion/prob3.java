// find the 1st and last occurence of the ele in the string 
public class prob3 {
    public static int first=-1;
    public static int last=-1;

    public static void Occurence(String str,int idx,char ele){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;

        }
        if(str.charAt(idx)==ele){
            if(first==-1)
            first=idx;
            else
            last=idx;
        }
        Occurence(str,idx+1,ele);
    }
    public static void main(String[] args) {
        String str="sarvan";
        Occurence(str,0,'a');
    }
}
