import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * This program checks which words in a file are not present in a dictionary.
*/

public class WordAnalysis
{
    public static void main(String[] args)
        throws FileNotFoundException
    {
        // Read the dictionary file and the novel file
        Set<String> dictionaryWords = readWords(/* "Software Engineering/data-structures/Projects/*/"Chapter 15 Class Notes/src/words");
        Set<String> novelWords = readWords(/* "Software Engineering/data-structures/Projects/*/"Chapter 15 Class Notes/src/war-and-peace.txt");

        //print all the words that are in the novel but not in the dictionary
        for (String word: novelWords){
            if (!dictionaryWords.contains(novelWords)){
                System.out.println(word);
            }
     } 
     System.out.println("There are " + novelWords.size() + " unique words in the novel.");
    }

    /**
     * Reads all words from a file.
     *
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a
     * word is a sequence of upper- and lowercase letters.
    */
    public static Set<String> readWords(String filename)
        throws FileNotFoundException
    {
        // we use a HashSet instead of a TreeSet because the order doesn't matter
        Set<String> words = new HashSet<>();

        System.out.println("!!!" + System.getProperty("user.dir"));
        Scanner in = new Scanner(new File(filename), "UTF-8");

        //use any character that's not a letter as a delimeter
        in.useDelimiter("[^a-zA-Z]+"); //wth
        
        while (in.hasNext()){
            words.add(in.next().toLowerCase()); 
            //add words to the set (duplicates are automatically ignored)
        }
        return words;
    }
}