//set the 2nd bit(pos 1) of number 0101(5)
//bitMAsk:1<<i  ,  i means pos
// operation or 
// eg,    1<<1 --> 0010 | 0101  --> 0111(7)  , it sets the 2nd bit to 1

import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitMask=1<<pos;

        int newNo=bitMask | n;
        System.out.println(newNo);
    }
}
