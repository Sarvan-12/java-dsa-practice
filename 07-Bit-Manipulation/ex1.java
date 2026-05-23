//get the 3rd bit(pos 2) of number 0101
//bitMAsk:1<<i  ,  i means pos
// operation and 
// eg,    1<<2 --> 0100 & 0101  --> 0100  , if all r zero bit was zero else 1

import java.util.*;
public class ex1 {

    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask=1<<pos;

        if((bitMask & n ) == 0){
            System.out.println("bit was zero");
        }
        else
        System.out.println("bit was 1");

    }
}