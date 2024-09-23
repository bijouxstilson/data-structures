import java.io.*;
import java.util.*;
/**
 * Read all words from a file and add them to a map
 * whose keys are the first letters of the words and
 * whose values are sets of words that start with
 * that same letter. Then print out the word sets in
 * alphabetical order. Update the map by modifying
 * Worked Example 15.1.
*/
public class FirstLetterMap
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities\\FirstLetterMap\\FirstLetterMap2\\src\\test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {

            Map<Character, String> words = new HashMap<>();
            String temp;

            while (in.hasNext())
            {
                String word = clean(in.next());
                Character c = word.charAt(0);

                if (words.containsKey(c)){
                    temp = words.get(c);
                    words.put(c, temp+word+",");
                }else {
                    words.put(c, word+",");
                }


            }

            // Print the map here in this form
            // a: [a, able, aardvark]
            char j = 'a';
            for (int i=0; i < words.size(); j++) {
                
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
