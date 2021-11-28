package com.company;

import java.util.*;
class GFG
{

    // Node of binary tree
    static class Node
    {
        int data;
        Node left, right;
    }

    // Function to add a new node
    static Node newNode(int data)
    {
        Node newnode = new Node();
        newnode.data = data;
        newnode.left = newnode.right = null;
        return newnode;
    }

    // Function to print nodes of given level
    static boolean printKDistant(Node root, int klevel)
    {
        Queue<Node> q = new LinkedList<>();
        int level = 1;
        boolean flag = false;
        q.add(root);

        // extra null is added to keep track
        // of all the nodes to be added before
        // level is incremented by 1
        q.add(null);
        while (q.size() > 0)
        {
            Node temp = q.peek();

            // print when level is equal to k
            if (level == klevel && temp != null)
            {
                flag = true;
                System.out.print( temp.data + " ");
            }
            q.remove();
            if (temp == null)
            {
                if (q.peek() != null)
                    q.add(null);
                level += 1;

                // break the loop if level exceeds
                // the given level number
                if (level > klevel)
                    break;
            }
            else
            {
                if (temp.left != null)
                    q.add(temp.left);

                if (temp.right != null)
                    q.add(temp.right);
            }
        }
        System.out.println();
        return flag;
    }

    // Driver code
    public static void main(String srga[])
    {
        // create a binary tree
        Node root = newNode(20);
        root.left = newNode(10);
        root.right = newNode(30);
        root.left.left = newNode(5);
        root.left.right = newNode(15);
        root.left.right.left = newNode(12);
        root.right.left = newNode(25);
        root.right.right = newNode(40);

        System.out.print( "data at level 1 : ");

        boolean ret = printKDistant(root, 1);
                ret = printKDistant(root, 3);
        //if (ret == false)
           // System.out.print( "Number exceeds total " +"number of levels\n");

        //System.out.print("data at level 2 : ");
        //ret = printKDistant(root, 2);
        //if (ret == false)
           // System.out.print("Number exceeds total " +
                 //   "number of levels\n");

      //  System.out.print( "data at level 3 : ");
        //ret = printKDistant(root, 3);
      //  if (ret == false)
      //      System.out.print("Number exceeds total " +
       //             "number of levels\n");

      //  System.out.print( "data at level 6 : ");
       // ret = printKDistant(root, 6);
        //if (ret == false)
           // System.out.print( "Number exceeds total" +
           //         "number of levels\n");

    }
}