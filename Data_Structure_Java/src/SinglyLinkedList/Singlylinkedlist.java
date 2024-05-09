package SinglyLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Singlylinkedlist {
    private Node head;
    private int size;

    public Singlylinkedlist()           //constructor
    {
        head = null;
    }

    public static void main(String[] args) {
        Singlylinkedlist singlylinkedlist = new Singlylinkedlist();
        singlylinkedlist.prepend(100);
        singlylinkedlist.traverse();

        singlylinkedlist.prepend(200);
        singlylinkedlist.prepend(300);
        singlylinkedlist.traverse();
    }

    //method to get the size of particular linked list
    public int size()
    {
        return this.size;
    }

    //Inserting node in the beginning of a linked list

    public void prepend(Object data)
    {
        //Create a new head node with data and null pointer
        Node header = new Node(data, (Node)null);
        //set the pointer of new head of new head to be the node that was old head
        header.setNext(this.head);
        //set the node to be new head
        this.head = header;
        //increase size counter
        this.size++;
    }

    //Traversing in a singly-linked list
    public void traverse()
    {
        Node current = head;
        while(current != null)
        {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public void insertAt(Object data, int index)
    {
        //check if index is within current size of the list
        if(index >= 0 && index<this.size){
            //create a new header node with null data and a pointer to the current head
            Node header = new Node((Object) null, this.head);
            //copy header into a new Node before
            //before will be the node infront of inserted node
            Node before = header;
            //loop to specified index
            for(int i=0; i<index; i++)
            {
                //set before to the next node in List
                before = before.getNext();
            }
            //Set the node after before to a new Node with the data and a pointer to the node
            //after before
            before.setNext(new Node(data, before.getNext()));
            //set the head of the list to be the node after header
            this.head = header.getNext();
            //increase the size counter
            this.size++;
        }
        else {
            System.out.println("INDEX OUT OF BOUNDS");
        }
    }



}
