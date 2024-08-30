import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        ListIterator<String> iterator = strings.listIterator();
        String n ="", m = "";

       
        m = iterator.next();
      
        iterator = strings.listIterator();

        //System.out.println(strings.remove());
       // strings.addLast(strings.removeFirst());
        
       while (!(n.equals(m))) {
            
           //// System.out.println("n: " + n + "   m: " + m);
        //   iterator.next()
          //  System.out.println
            n = iterator.next();
            iterator.remove();
             strings.addFirst(n);
             //iterator = strings.listIterator();
             
             //System.out.println(n);
            // n = iterator.next();
            // n = iterator.next();
            // System.out.println(n);
             
            // System.out.println(n);
             
             
            // n = iterator.next();
            // iterator = strings.listIterator();

             
            

             System.out.println(strings);
             
             


            //strings.addLast(strings.removeFirst());
          ///  System.out.println(strings);
            
        }

    }
}