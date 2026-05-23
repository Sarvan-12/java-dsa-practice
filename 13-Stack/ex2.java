// stack using ArrayList
import java.util.*;

public class ex2 {
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();
        public  boolean isEmpty(){
            return list.size() == 0;
        }
        public  void push(int data){
            list.add(data);
        }
        public  int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return list.remove(list.size()-1);
        }
        public  int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek()); // 30       
        System.out.println("Popped element is: " + stack.pop()); // 30
        System.out.println("Top element is: " + stack.peek()); // 20
        System.out.println("Popped element is: " + stack.pop()); // 20


    }
}
