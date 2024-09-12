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
        LinkedList<String> strings2 = strings;
        ListIterator<String> iterator1 = strings2.listIterator();
        ListIterator<String> iterator2 = strings.listIterator();
        String temp = "", first;
        int count=0;
        
         while(iterator1.hasNext()/*(!temp.equals(first))*/ ){
          count++;
         
          temp = iterator2.next();
         
          iterator2.remove();

          strings.addFirst(temp);
          
          iterator2 = strings.listIterator();

          System.out.println(strings);
          for (int i = 0; i < count; i++)
            iterator2.next();
          if (count > 50)
            break;
         }

            
        }

    }
