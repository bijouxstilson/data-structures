import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {

        /*
         * The Map interface is generic.
         * The first type given is the type of the key.
         * The second type given is the type of the value.
         * 
         */
        // Map<String, Color> favColors = new HashMap<>();

        Map<String/*key is a string */, Color /*value is a color */> favColors = new HashMap<>();

        //add elements with .put();
        favColors.put("Henry", Color.BLUE);
        favColors.put("Jack", Color.RED);
        favColors.put("Priya", Color.GREEN);

        //two different elements with the same value is possible
        favColors.put("Dr.Miller", Color.GREEN); 
        
        //same key CANNOT have two different values
        //using put on a key that exists changes the value
        favColors.put("Jack", Color.MAGENTA);

        //create a set of the keys in a map
        Set<String> keys = favColors.keySet();

        for (String key: keys) {
            System.out.println(key + " (" + key.hashCode() + "): " + favColors.get(key)); //prints everything in the map: key, key's hash code, value you get from key

        }


    }
}
