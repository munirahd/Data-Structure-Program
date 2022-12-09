/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

/**
 *
 * @author shahad mohammed
 */
public class SingleyLinkedList {

    public Node head;

    class Node { // class

        String data;
        Node next;

        Node(String s) {//constructor
            data = s;
            next = null;
        }//End constructor
    }//End class Node

    //Insert methode to insert at the begging to the Sll
    public void Insert(String word) {
        Node newest = new Node(word);
        newest.next = head;
        head = newest;
    }

    //Print methode to print the content of the Sll
    public void Print(Node head) {
        if (head != null) {
            Print(head.next);//recursion
            System.out.print(head.data + " ");
        }
    }

    //Reverse methode to reverse the content of the Sll using recursion
    public String Reverse(Node head) {
        if (head == null) {
            return null;
        }
        System.out.print(head.data + " ");
        return Reverse(head.next);//recursion
    }

}
