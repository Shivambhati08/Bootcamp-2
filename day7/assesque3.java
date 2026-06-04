// Perform enqueue, dequeue and display operations in a queue

/*
Problem 3
Pseudocode:
Move front and rear circularly
while true: 
    read choice
    if choice == 1:
        enqueue
    if choice == 2:
        dequeue
    if choice == 3:
        print or display
    if choice == 4:
        exit
    default :
        invalid input
 */
import java.util.Scanner;
public class assesque3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            n = sc.nextInt();
            switch(n){
                case 1: enqueue(sc.nextInt());
                break;
                case 2: dequeue();
                break;
                case 3: print(); 
                break;
                case 4: 
            }
        }
    }
    
}
