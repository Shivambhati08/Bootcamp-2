class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class CircularLinkedList {
    static Node head;
    void insert(int value){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
            head.next = head;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = head;
    }
    void delete(int pos){
        if(pos == 1){
            head = head.next;
            return;
        }
        
    }
    public static void main(String[] args) {
        
    }
    
}
