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
        String n = iterator.next(); String m = iterator.previous();
        strings.addLast(strings.removeFirst());
        while (!(n.equals(m))) {
            System.out.println("n" + n + "  m" + m);
            
            n = iterator.next();
            strings.addLast(strings.removeFirst());
            
        }

    }
}