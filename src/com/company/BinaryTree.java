package com.company;

public class BinaryTree {
    Node root;

    void printKDistant(Node node, int k)
    {
        if (node == null|| k <0 )
            //Base case

            return;
        if (k == 0)
        {
            System.out.print(node.data + " ");
            return;
        }
        //recursively traversing
        //printKDistant(Node.root,1);
        printKDistant(node.left, k - 1);
        printKDistant(node.right, k - 1);

    }

    /* Driver program to test above functions */
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();

        /* Constructed binary tree is
                1
              /   \
             2     3
            /  \   /
           4    5 8
        */
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(8);
        tree.root.right.right = new Node(4);
        tree.root.left.left = new Node(3);
        tree.root.right.right = new Node(6);
        tree.root.left.left.right=new Node(5);

        //System.out.println(tree.root.data);
        tree.printKDistant(tree.root, 0);

        tree.printKDistant(tree.root, 2);
    }
}

