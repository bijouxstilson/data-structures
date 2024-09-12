import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Set<Integer> nums = new HashSet<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();

        for (int i = 2; i < n; i++){
            nums.add(i);
        }

        for (int j = 2; j < n; j++){
            for (int k = 2; j*k < n; k++){
                nums.remove(k*j);
            }
        }

        for (int num: nums){
            System.out.print(num + " ");
        }







    }
}
