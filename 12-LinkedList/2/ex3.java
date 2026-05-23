// is a linked list a palindrome?
import java.util.*;
public class ex3 {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static boolean isPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }
        // brute force

        // ArrayList<Integer> list = new ArrayList<>();  
        // Node temp = head;
        // while(temp != null){
        //     list.add(temp.data);
        //     temp = temp.next;
        // }
        // ArrayList<Integer> reverseList = new ArrayList<>(list); 
        // Collections.reverse(reverseList);
        // return list.equals(reverseList);

        // optimized
        Node middle = findMiddle(head);
        Node secondHalf = reverse(middle.next);

        while(secondHalf != null){
            if(head.data != secondHalf.data){
                return false;
            }
            head = head.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    public static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node reverse(Node head){
        Node prev = null;
        Node curNode = head;
        while(curNode != null){
            Node nextNode = curNode.next;
            curNode.next = prev;
            prev = curNode;
            curNode = nextNode;
        }
        return prev;
    }
    public static void main(String[] args) {
        int[] values = {1, 2, 3,3, 2, 1};
        Node head = new Node(values[0]);
        Node temp = head;
        for (int i = 1; i < values.length; i++) {
            temp = temp.next = new Node(values[i]);
        }
        System.out.println(isPalindrome(head));
    }
}
