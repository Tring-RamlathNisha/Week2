class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Stack{
    Node top=null;
    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
        System.out.println(data+" pushed into the stack.");
    }

    public int  pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow..");
            return -1;
        }
        int poppeddata=top.data;
        top=top.next;
        return poppeddata;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return top.data;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.println("Stack elements:");
            Node current=top;
            while(current!=null){
                System.out.print(current.data+"->");
                current=current.next;
            }
            System.out.println("null");

        }
    }

    public boolean isEmpty(){
        return top==null;
    }

    public static void main(String args[]){
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);

        st.display();

        System.out.println("Top element is:"+st.peek());
        System.out.println("Popped Element:"+st.pop());
        st.display();

        st.pop();
        st.pop();
        st.pop();
    }
}
