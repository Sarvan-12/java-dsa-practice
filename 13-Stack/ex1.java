// stack using Linked List

public class ex1 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()){
                head = newNode;
                return ;
            }else{
                newNode.next = head;
                head = newNode;
                return;
            }
        }
        public static int pop(){
            if (isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }else{
                int top = head.data;
                head = head.next;
                return top;
            }
        }
        public static int peek(){
            if (isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }else{
                return head.data;
            }
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop()); // Stack is empty
    }
}
