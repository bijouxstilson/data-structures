import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        //Create a print queue of strings (using a linked list)
        Queue<String> jobs = new LinkedList<>();

        //add some print jobs

        jobs.add("Joe: Quarter 2 Expense Report");
        jobs.add("Kathy: Top Secret Document");

        System.out.println("Printing: " + jobs.remove());

        //add some more jobs

        jobs.add("Kathy: Really Top Secret Document");
        jobs.add("Joe: Grocery List");
        jobs.add("Kathy: Can I Get Fired For This?");

        System.out.println("Printing: " + jobs.remove());

        jobs.add("Boss: Kathy Termination Letter");

        //print the rest of the jobs in the queue

        while (jobs.size() > 0){
            System.out.println("Printing: " + jobs.remove());
        }



    }
}
