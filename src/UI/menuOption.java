package UI;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The type Menu option.
 */
public class menuOption {

    /**
     * Map selection int.
     *
     * @param sc the sc
     * @return the int
     */
    public static int mapSelection(Scanner sc){

        int selection;

        System.out.println("\n Welcome to the Grocery Online Shop");
        System.out.println("\n What implementation of Java Map you want to use? \n");
        System.out.println("1. HashMap\n2. TreeMap\n3. LinkedHashMap");

        try{
            selection = sc.nextInt();
        }catch(InputMismatchException ex){
            System.out.println("Please enter a valid option.");
            selection = sc.nextInt();
        }

        sc.nextLine();
        return selection;

    }

    /**
     * Shop menu int.
     *
     * @param sc the sc
     * @return the int
     */
    public static int shopMenu(Scanner sc){

        int selection;

        System.out.println("\nPlease, select an option: ");
        System.out.println("1. Add a product to the collection.\n2. Show the product category. \n3. Show data of the product in the collection (Non-Sorted & Sorted). \n" +
                "4. Show the product and category (All inventory). \n5. Show the product and category in the inventory, sorted by type. \n6. Exit.");

        try{
            selection = sc.nextInt();
        }catch(InputMismatchException ex){
            System.out.println("Please enter a valid option.");
            selection = sc.nextInt();
        }

        sc.nextLine();
        return selection;

    }


}
