//clr the 3rd bit(pos 2) of number 0101(5)
//bitMAsk:1<<i  ,  i means pos
// operation and not(BM) 
// eg,    1<<2 --> 0100 -->1011  -->1011 & 0101 --> 0001 , its sets the 4rd bit to 0

import java.util.*;
public class ex3 {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask=1<<pos;

        int newNo=~(bitMask) & n;
        System.out.println(newNo);
    }
}


// similer update , for 0 use clear and for 1 use set
