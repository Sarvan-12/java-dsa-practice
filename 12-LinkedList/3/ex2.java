// reverse a dll

public class ex2 {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    static Node reverse(Node head){
        Node prevNode = null;
        Node currNode = head;
        Node nextNode = null;
        while(currNode != null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            currNode.prev = nextNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }

    public static void main(String[] args) {
        
    }
}
