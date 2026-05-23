// circular queue using array;

public class ex2 {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear=-1;
        static int front = -1;
        Queue(int size){
            arr = new int[size];
            this.size = size;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(isEmpty()){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int frontElement = arr[front];
            //single element case
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else{
                front = (front+1)%size;
            }
            return frontElement;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
        public static void printQueue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            int i = front;
            do{
                System.out.print(arr[i] + " ");
                i = (i+1)%size;
            }while(i != (rear+1)%size);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove(); // Queue is empty
        queue.printQueue(); // 2 3 4 5 6

    }
}
