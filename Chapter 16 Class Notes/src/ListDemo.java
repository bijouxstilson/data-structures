//import java.util.LinkedList;
//import java.util.ListIterator;
/**
 *   A program that demonstrates the LinkedList class
 */
public class ListDemo
{
    public static void main(String[] args)
    {   LinkedList students = new LinkedList();

        students.addFirst ("Arthur");
        students.addFirst("Bijoux");
        students.addFirst("Jinan");
        students.addFirst("Andy");

        System.out.println(students);
        
        /* 
        //addLast method can be used to populate a list
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("Gamora");

        System.out.println(staff);

        //The list is currently TNPG

        /*
         * the listIterator method creates a new list iterator that is positined at the head of the list
         * the | is used to represent iterator position
        
        ListIterator<String> iterator = staff.listIterator(); //  |TNPG
        
        //the next method advances the iterator over the next element in the list

        iterator.next(); // T|NPG

        //the next method also returns the element that the iterator passes over
        String avenger = iterator.next(); //  TN|PG

        System.out.println(avenger); // should be natasha

        //add method inserts an element at the iterator position
        //iterator is then positioned after the element that was added

        iterator.add("Steve"); //TNS|PG
        iterator.add("Clint"); //TNSC|PG
        System.out.println(staff);

        //remove method removes the element returned by the last call to next or previous

        iterator.next();
        iterator.remove(); //Peter is removed
        System.out.println(staff);

        //the remove method can only be called after calling next or previous
        //the remove method cannot be called after calling add

        //the set method updates the element returned by the last call to next or previous

        iterator.previous(); //TNS|CG
        iterator.set("T'Challa"); //TNS|TG
        System.out.println(staff);

        //hasNext is used to determine whether there is a next node after the iterator. 
        //often used in the condition of a while loop
        iterator=staff.listIterator(); //|TNSTG

        while (iterator.hasNext()) {
            String n = iterator.next();
            if (n.equals("Natasha")){ // TN|STG
                iterator.remove(); // T|STG
            }
           // TSTG|
        }

      
        //enhanced for loops work with linked lists

        for (String n: staff){
            System.out.println(n + " ");
        }
        //CurrentModificationException 
        //cannot modify a linked list while using an iterator unless you use the iterator to do the modification

        iterator = staff.listIterator(); // |TSTG

        while (iterator.hasNext()) {
            String n = iterator.next();
            if (n.equals("Tony")){
              //  staff.remove("Tony");
            }

        }

        //the enhanced for loop automatically creates an iterator

        //cannot add or remove when using an enhanced for loop
        for (String n: staff){
            if (n.equals("Tony")){
                staff.add("Bruce");
            }
        }

        System.out.println(staff);*/
    }
}
