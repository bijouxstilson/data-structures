import java.io.*;
import java.util.*;
/**
 * Read all words from a file and add them to a
 * map whose keys are word lengths and whose values
 * are comma-separated strings of words of the same length.
 * Then print out those strings, in increasing order by
 * the length of their entries.
 * Modify Worked Example 15.1.
 */
public class StringLengthMap
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String filename = "Chapter 15 Activities/StringLengthMap/src/test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {

            // Create your map here
            Map<Integer, String> words = new HashMap<>();
            String temp;

            while (in.hasNext())
            {
                String word = clean(in.next());
                Integer len = word.length();

                if (words.containsKey(len)){
                    if (!words.get(len).contains(word+ ", ")){
                    
                        temp = words.get(len);
                        words.put(len, temp+word+", ");
                    }
                }else {
                    words.put(len, word+", ");
                }


            }
            // Print the strings, in increasing order of their length
            // Use this format: 1: i, a, i
           
            for (int i=0, j=0; i < words.size(); j++) {
                
                if (words.containsKey(j)){
                   
                    i++;
                    System.out.println(j + ": " + words.get(j));
                    }
                }
            

        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }
    }

    public static String clean(String s)
    {
        String r = "";
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isLetter(c))
            {
                r = r + c;
            }
        }
        return r.toLowerCase();
    }

}
