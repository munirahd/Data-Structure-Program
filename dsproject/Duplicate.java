/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

//create class of node 
class Node {

    String data;
    Node next;

    //constructor

    Node(String data) {
        this.data = data;
    }
}

public class Duplicate {

    public Node head;
    public  Node tail;

    // Adding a node at the front of the list 
    public void push(String word) {
        // Allocate the Node &  Put in the data
        Node newest = new Node(word);
        if (head == null) {
            head = newest;
            tail = newest;
            newest.next = null;
        } else {
            Node temp = head;
            newest.next = temp;
            head = newest;
            tail.next = head;
        }
    }

    public  boolean checkDuplicate(Node head) {
        boolean flag = false;
        if (head == null) {
            System.out.println("The circular linked list is empty");
        } else {
            String word;
            outerLoop:
            for (Node a = head; a != tail; a = a.next) {
                word = a.data;
                for (Node b = a.next; b != a; b = b.next) {
                    //check if data at this node is duplicate
                    if (word.equals(b.data)) {
                        flag = true;
                        break outerLoop;
                    }
                }
            }
        }
        return flag;
    }
}
