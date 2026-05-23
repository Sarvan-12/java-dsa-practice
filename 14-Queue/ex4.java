// queue implementation using linked list

public class ex4 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null;
        }
        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            head = head.next;
            if(head == null){
                tail = null;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
        public static void display(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            Node current = head;
            while(current != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display(); // 1 -> 2 -> 3 -> null
        System.out.println("Removed: " + q.remove()); // Removed: 1
        System.out.println("Peek: " + q.peek()); // Peek: 2
        q.display(); // 2 -> 3 -> null
    }
}
