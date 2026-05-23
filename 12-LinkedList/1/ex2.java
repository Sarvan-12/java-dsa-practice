import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("This");
        list.add("null");  // add null to the end of the list
        System.out.println(list);
        System.out.println(list.size());

        // list.removeFirst();
        // list.removeLast();
        list.remove(4);  // remove the element at index 4

        System.out.println(list);
        System.out.println(list.size());

        for( String s : list) {
            System.out.print(s+"->");
        }
        System.out.print("null");
    }
}
