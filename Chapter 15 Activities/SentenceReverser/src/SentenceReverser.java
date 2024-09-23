import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
        Scanner scanner = new Scanner(sentence);
        String word =" ", backwards ="";
        
        // Complete this method. Use a Stack.
        Stack<String> reverser = new Stack<>();

        for (int i = 0; i < sentence.length(); i++)
        {
            System.out.println((sentence.substring(i, i + 1)));

            if (sentence.substring(i, i + 1).equals(",") ){
                //word += sentence.substring(i, i + 1);
                System.out.println(",,,,,,");
                word = ", " + word;

                reverser.push(word);
                word = "";


            }
            else if (sentence.substring(i, i + 1).equals(" "))
            {
                System.out.println("-      -");
             //   word += sentence.substring(i, i + 1);
                reverser.push(word);
                word = "";

            }
            else if (sentence.substring(i, i + 1).equals("."))
            {
                System.out.println("......");
                

               System.out.println(reverser.size());
                for (int j = 0; j < 4; j++){

                    backwards += reverser.pop();
                }
                System.out.println("backwards: " +backwards);
                reverser.push(word);
                word = "";

            }
                //System.out.println("++++++");
                word += sentence.substring(i, i + 1);
                System.out.println("addword: "+word);
            
            
            
        }






        return backwards;

    }
}