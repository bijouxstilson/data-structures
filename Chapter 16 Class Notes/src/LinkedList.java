import java.lang.classfile.components.ClassPrinter;
import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;


/**
 * A linked list is a sequence of nodes with efficient
 * element insertion and removal. This class
 * contains a subset of the methods of the standard
 * java.util.LinkedList class.
*/
public class LinkedList
{

    private Node first; //refers to the first node in the list, if list is empty, list will be null


    /**
        Constructs an empty linked list.
    */
    public LinkedList(){

        this.first= null;
    }





    /**
        Returns the first element in the linked list.
        @return the first element in the linked list
    */
    public Object getFirst() {
        if (this.first==null){ throw new NoSuchElementException(); }
        return this.first.data; //if not .data, returns the node, not the actual data
    }




    /**
        Removes the first element in the linked list.
        @return the removed element
    */
    public Object removeFirst(){
        if (this.first==null){ throw new NoSuchElementException(); }
        
        Object element = this.first.next;
        this.first = this.first.next;
        return element;
    }
    
          




    /**
        Adds an element to the front of the linked list.
        @param element the element to add
    */
    public void addFirst(Object element){
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = this.first;
        this.first = newNode;
        //this.first = new Node();
        

    }





    /**
        Returns an iterator for iterating through this list.
        @return an iterator for iterating through this list
    */
    public ListIterator listIterator(){
        return new LinkedListIterator();
    }





    //Class Node
    //node is static because it doesn't need access to anything in LinkedList
    static class Node {
        public Node next; 
        public Object data;
        

    }


    public String toString(){
       ListIterator listIterator = listIterator();

       String elements= "";

       while (listIterator.hasNext()){

        elements+= listIterator.next() + ", ";

       }

       return "[" + elements + "]";
    
    }
    


    class LinkedListIterator implements ListIterator
    {
      //private data
        private Node position;
        private Node previous;
        private boolean isAfterNext;


        /**
            Constructs an iterator that points to the front
            of the linked list.
        */

        public LinkedListIterator(){
            position = null;
            previous = null;
            isAfterNext = false;
        }

        public Object next() {
            if (!hasNext()) {throw new NoSuchElementException(); }
            previous = position;
            isAfterNext = true;

            if (position == null){
                position = first;
                }
            else {
                position = position.next;
            }
            return position.data;}

        public boolean hasNext(){
            //check if list is empty
            if (position == null) { //the iterator hasn't moved
                return first != null;
            }
            return position.next != null;
        }



        /**
            Moves the iterator past the next element.
            @return the traversed element
        */





        /**
            Tests if there is an element after the iterator position.
            @return true if there is an element after the iterator position
        */


        /**
            Adds an element before the iterator position
            and moves the iterator past the inserted element.
            @param element the element to add
        */

        public void add(Object element){
            //check if the iterator is at the beginning
            isAfterNext = false;
            if (position==null) {
                addFirst(element);
                position = first;
            }
            else {
                Node newNode = new Node();
                newNode.data = element;
                newNode.next = position.next;
                //Set the next element of the CURRENT position to point to our new node
                position.next = newNode;
                position = newNode;
            }
        }





        /**
            Removes the last traversed element. This method may
            only be called after a call to the next() method.
        */

        public void remove(){
            if (!isAfterNext) {throw new IllegalStateException(); }

            //check is the iterator is at the beginning

            if (position == first){
                removeFirst();
                position = null;
            }

            else {
                previous.next = position.next;
                position = previous;
                
            }
            isAfterNext = false;
        }



 //shift alt delete deletes nearest set of brackets

        /**
            Sets the last traversed element to a different value.
            @param element the element to set
        */

        public void set(Object element){
            if (!isAfterNext) {throw new IllegalStateException(); }
            position.data = element; 
        }



    }//LinkedListIterator
}//LinkedList
