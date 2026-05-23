// WAP to print all possible letter combinations for a given phone number (digits 2-9) using recursion.

public class prob9 {
    public static String keypad[]= { ".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printComb(String str,int idx ,String combination){
        if(idx==str.length()){
            System.out.println(combination) ;
            return;
        }
        char curChar=str.charAt(idx);
        String mapping=keypad[curChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printComb(str,idx+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="12";
        printComb(str,0,"");
    }
}
