
package com.kanji.data_structs.LinkedList;

/**
 *
 * @author Kanji Antony
 */

public class LinkedList {
    
    //initialise the head node
    Node head;
    
    //create a Node class to handle the different nodes
    public static class Node
    {
       
        //declare the data and next variables 

        int data;
        Node next;

        // constructor to initialise the above variables
        public Node(int d) 
        {

            this.data = d;
            this.next = null;

        }

       
        
    }
    
    public void traverse()
    {

        Node n = head;

        while(n != null) {
            System.out.print(n.data+"->");
            n = n.next;
        }

        
    }
    
    public static void main(String[] args) {
        
        LinkedList llist = new LinkedList();

        //declare the second and third node
        Node second, third;

        //initialise the nodes 
        llist.head = new Node(1);
        second = new Node(2);
        third = new Node(3);

        //link the nodes to each other using the next pointer
        llist.head.next = second;
        second.next = third;
        third.next = null;

        //traverse the list
        llist.traverse();
        
        
    }
    
}
