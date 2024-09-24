import java.util.Stack;
import java.util.Scanner;

/**
 * Class for simulating a driveway and a street, using stacks
 * of cars with license plate numbers as representation.
*/
public class Driveway
{
    private int temp;
    private Stack<Integer> printCars = new Stack<>();
    /**
      * Stack representing the cars in the driveway.
    */
    private Stack<Integer> driveway = new Stack<>();
    
    /**
      * Stack representing the cars in the street.
    */
    private Stack<Integer> street = new Stack<>();

    /**
      * Constructor.
    */
    public Driveway()
    {
       temp = 0;
    }

    /**
      * Add the given license plate to the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void add(int licensePlate)
    {  if (!driveway.contains(licensePlate))
          driveway.push(licensePlate);

       System.out.print("Driveway: ");

       for (int car: driveway){
         System.out.print(car+" ");
      }
      System.out.println();

    }

    /**
      * Remove the given license plate from the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void remove(int licensePlate)
    {
        if (driveway.contains(licensePlate))
          temp = driveway.pop();

        while (temp!=licensePlate && driveway.contains(licensePlate)){
          street.push(temp);
          temp = driveway.pop();
        }
        
        if (temp == licensePlate){
          while(street.size()>0){
            driveway.push(street.pop());
          }
        }

        System.out.print("Driveway: ");
        for (int car: driveway){
           System.out.print(car+" ");
        }
        System.out.println();
    }

    /**
      * Prints the driveway and street details to the screen.
    */
    public void print()
    {
        System.out.println("In Driveway, starting at first in (one license plate per line):");
        for (int i = driveway.size(); i >0; i--){
          printCars.push(driveway.pop());
        }
        for (int i = printCars.size(); i >0; i--){
          System.out.println(printCars.pop());
        }


       System.out.println("In Street, starting at first in (one license plate per line):");
        //Print the cars in the street here'
        for (int i = street.size(); i >0; i--){
          printCars.push(street.pop());
        }
        for (int i = street.size(); i >0; i--){
          System.out.println(street.pop());
        }
       
    }
}
