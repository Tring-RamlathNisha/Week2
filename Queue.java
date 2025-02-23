class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Queue{
    Node front=null;
    Node rear=null;

    public void enqueue(int data){
        Node newNode=new Node(data);

        if(rear==null){
            front=rear=newNode;
        }
        else{
            rear.next=newNode;
            rear=newNode;
        }
        System.out.println(data +" enqueuued");
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow..");
            return -1;
        }
        int dequeueddata=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        return dequeueddata;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue Underflow...");
            return -1;
        }
        return front.data;
    }
    public void display(){
        if (isEmpty()){
            System.out.println("Queue is Empty...");
        }
        else{
            System.out.println("Queue Elements:");
            Node current=front;
            while(current!=null){
                System.out.print(current.data+" -> ");
                current=current.next;
            }
            System.out.println("null");
        }
    }
    public boolean isEmpty(){
        return front==null;
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);

        q.display();

        System.out.println("Dequeued Element: "+ q.dequeue());

        q.display();
        
        System.out.println("Front Element: "+ q.peek());

        

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        
    }
}