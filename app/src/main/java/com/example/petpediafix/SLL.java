package com.example.petpediafix;

public class SLL
{
    //Variables
    private Node head;
    //Constructor
    public SLL()
    {
        head = null;
    }

    //To populate the list
    public void addNodeToStart(int addData)
    {
        head = new Node(addData, head);
    }

    public void deleteNodeFromStart()
    {
        if(head != null)
        {
            head = head.getLink();
        }
    }
    public boolean hasNext()
    {
        Node position = head;
        if(position.getLink() != null)
        {
            return true;
        }
        return false;
    }

    public int length()
    {
        int count = 0;
        Node position = head;
        while(position != null)
        {
            count++;
            position = position.getLink();
        }
        return count;
    }

    //Output method
    public void showList()
    {
        Node position = head;
        while (position != null)
        {
            System.out.println(position.getData());
            position = position.getLink();
        }
    }

    private class Node
    {
        //Look into generic data?
        //Instance variables
        private int data;
        private Node link;//instance of a self-referencing class
        //Constructor
        public Node (int data, Node link)
        {
            this.data = data;
            this.link = link;
        }

        //Getters and setters

        public int getData()
        {
            return data;
        }

        public Node getLink()
        {
            return link;
        }

        //toString
        @Override
        public String toString()
        {
            return "Data: " + data + " links to " + link;
        }
    }//end private Node class
}
