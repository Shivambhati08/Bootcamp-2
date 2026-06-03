
class Node {

    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.next = null;
    }
}
public class DoubleLinkedList {
    static Node head = null;
    void insert(int value){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
            return; 
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp;
    }
    void print(){
        if(head == null){
            System.out.println("Dll is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    void printreverse(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.prev;
        }
         System.out.println("null");
    }
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insert(10); 
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);
        dll.insert(50);
        dll.print();
        dll.printreverse();
    }
}
