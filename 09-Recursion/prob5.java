// move all x to the end of the string 

public class prob5 {
    public static void moveString(String str,int idx,int count , String newStr){
        if(idx==str.length()){
            for(int i=0;i<count;i++)
            newStr+='x';
            System.out.println(newStr);
            return;
        }
        if(str.charAt(idx)=='x'){
            count++;
        }
        else{
            newStr+=str.charAt(idx);
        }
        moveString(str, idx+1, count, newStr);

    }
    public static void main(String[] args) {
        String str="axbcxxd";
        moveString(str,0,0,"");
        
    }
}
