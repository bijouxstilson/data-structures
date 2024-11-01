
import java.lang.classfile.components.ClassPrinter;
import java.util.logging.ErrorManager;

/**
    This class implements a binary search tree whose
    nodes hold objects that implement the Comparable
    interface.
*/
public class BinarySearchTree
{   
    private Node root;

    /**
        Constructs an empty tree.
    */
    public BinarySearchTree()
    {   
        this.root = null;
        
    }
    
    /**
        Inserts a new node into the tree.
        @param obj the object to insert
    */
    public void add(Comparable obj) 
    {   
        Node newNode = new Node();
        newNode.data=obj;
        newNode.left = null; newNode.right = null;

        if (this.root == null){
            root = newNode;
        }
        else{
            this.root.addNode(newNode);
        }



    }

    /**
        Tries to find an object in the tree.
        @param obj the object to find
        @return true if the object is contained in the tree
    */
    public boolean find(Comparable obj)
    {
        Node current = this.root;
        while (current != null){
            int difference = obj.compareTo(current.data);
            if (difference == 0){
                return true;
            }
            else if (difference < 0){
                current = current.left;
            }
            else{
                current = current.right;
            }
        }

        return false;
    }
    
    /**
        Tries to remove an object from the tree. Does nothing
        if the object is not contained in the tree.
        @param obj the object to remove
    */
    public void remove(Comparable obj)
    {
        Node toBeRemoved = this.root;
        Node parent = null;
        boolean found = false;

            while(!found && toBeRemoved!= null){
                int difference = obj.compareTo(toBeRemoved.data);
                if (difference == 0) { found = true; }
                else{
                    parent = toBeRemoved;
                    if (difference < 0){
                        toBeRemoved = toBeRemoved.left;
                    }
                    else{
                        toBeRemoved = toBeRemoved.right;
                    }
                }
            }

            if (!found){
                return;
            }

            //case1 and case2 (at least one (1) child is null)
            if (toBeRemoved.left == null || toBeRemoved.right== null){
                Node newChild;//= new Node();

                if (toBeRemoved.left == null){
                    newChild = toBeRemoved.right;
                }
                else{
                    newChild = toBeRemoved.left;
                }
                //removng the root
                if (parent == null){
                    this.root = newChild;
                }
                else if (parent.left){
                    
                }
            }
    }
    
    /**
        Prints the contents of the tree in sorted order.
    */
    public void print()
    {   
        
    }   

    /**
        Prints a node and all of its descendants in sorted order.
        @param parent the root of the subtree to print
    */
    private static void print(Node parent)
    {   
        
    }

    /**
        A node of a tree stores a data item and references
        to the left and right child nodes.
    */
    static class Node
    {   
    // a bst /MUST/ be made up of Comparable Objects 
        public Comparable data;
        public Node left, right;

        /**
            Inserts a new node as a descendant of this node.
            @param newNode the node to insert
        */
        public void addNode(Node newNode)
        {   
            //if difference < 0, newNode is left of this node
            //if difference > 0, newNode is right of this node
            int difference = newNode.data.compareTo(data);

            if (difference < 0){ 
                if (left==null){
                    left = newNode;
                }
                else {
                    left.addNode(newNode); //recursion! 'tis a joyous day
                }
            } //'else if' rather than 'else' insures that we don't accidentally add a duplicate Node
            else if (difference > 0){ 
                if (right==null){
                    right = newNode;
                }
                else {
                    right.addNode(newNode); //recursion! 'tis a joyous day
                }
            }

        }
    }
}



