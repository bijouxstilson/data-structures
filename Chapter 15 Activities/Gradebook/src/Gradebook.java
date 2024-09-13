
import java.util.*;
//. . .
/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Map<String, String> students = new HashMap<>();
        Set<String> keys;


        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();
            if (input.equals("Q"))
            {
                done = true;
            } else if (input.equals("A"))
            {
                System.out.println("Who would you like to add? ");
                String name = in.next().toUpperCase();
             
                System.out.println("What is their grade? ");
                
                String grade = in.next().toUpperCase();

                students.put(name,grade);


            } else if (input.equals("R"))
            {
                System.out.println("Who would you like to remove? ");
                String name = in.next().toUpperCase();
                students.remove(name);

            } else if (input.equals("M"))
            {
                System.out.println("Who would you like to modify? ");
                String name = in.next().toUpperCase();

                System.out.println("What do you want to change the grade to? ");
                
                String grade = in.next().toUpperCase();
                students.put(name, grade);
            } else if (input.equalsIgnoreCase("P"))
            {
                ArrayList<String> keyList = new ArrayList<>();
                keys = students.keySet();
                for(String key: keys){
                    keyList.add(key);
                }
                Collections.sort(keyList);
                for(String key: keyList){
                    System.out.println(key+": "+students.get(key));
                }

                }
             else
            {
                done = true;
            }
        }
    }
}
