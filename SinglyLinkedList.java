class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyLinkedList{
    
        Node head;

        public void insertEnd(int data){
            Node newNode= new Node(data);
            if (head==null){
                head=newNode;
            }
            else{
                Node current = head;
                while(current.next!=null){
                    current=current.next;
                }

                current.next=newNode;
            }
        }

        public void insertFront(int data){
            Node newNode=new Node(data);
             if (head==null){
                head=newNode;
            }
            newNode.next=head;
            head=newNode;
        }
        /**
         * Insert a node after the give given node
         */
        public void insertAfterNode(int data,int key){
            Node newNode = new Node(data);
            Node current=head;
            while (current!=null){
                if (current.data == key){
                    break;
                }
                current=current.next;
            }
            newNode.next=current.next;
            current.next=newNode;
        }
        /**
         * Display the elements of SLL
         */
        public void display(){
            Node current=head;
            while(current!=null){
                System.out.print(current.data + " -> ");
                current=current.next;
            }
            System.err.println("null");
        }
        /**
         * Delete the node which is available after the given value
         */
        public void deleteAfterNode(int key){
            Node current=head;
            while (current!=null){
                if (current.data == key){
                    break;
                }
                current=current.next;
            }
            current.next=current.next.next;
        }

        public void deleteNode(int key){

            if (head!=null && head.data==key){
                head=head.next;
            }
            Node current=head;
            while (current!=null && current.next!=null){
                if (current.next.data == key){
                    current.next=current.next.next;
                    break;
                }
                current=current.next;

            }
        }

        public void deleteFirst(){
            if (head!=null){
                head=head.next;
            }
        }
        public void deleteEnd(){
            if (head==null){
                System.out.println("Linked List is empty");
            }
            else if (head.next==null){
                head=null;
            }
            Node current=head;
            while (current.next.next!=null){
                current=current.next;
            }
            current.next=null;
         }
    
        public static void main(String[] args) {
            SinglyLinkedList list=new SinglyLinkedList();
            list.insertEnd(12);
            list.insertEnd(14);
            list.insertEnd(16);
            list.insertFront(10);
            list.insertAfterNode(25, 14);
            System.out.println("Linked List");
            list.display();


            list.deleteAfterNode(25);
            System.out.println("Linked List after deletion after a given node:");
            list.display();

             list.deleteNode(25);
            System.out.println("Linked List after deletion node:");
            list.display();

            list.deleteFirst();
            System.out.println("Linked List after deletion at first:");
            list.display();

            list.deleteEnd();
            System.out.println("Linked List after deletion at end:");
            list.display();
       }
}