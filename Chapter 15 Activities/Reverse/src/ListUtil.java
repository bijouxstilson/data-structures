import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        ListIterator<String> iterator = strings.listIterator();
        String temp = ""; int count=1;
        iterator.next();

        while(iterator.hasNext()){
          count++;
         
          temp = iterator.next();
         
          iterator.remove();

          strings.addFirst(temp);
          
          iterator = strings.listIterator();

          for (int i = 0; i < count; i++)
            temp = iterator.next();
      
         }
        }
    }
