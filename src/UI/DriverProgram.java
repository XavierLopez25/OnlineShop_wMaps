package UI;

import Model.FactoryMap;
import Controller.RW_File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class DriverProgram {
    public static void main(String[] args) throws FileNotFoundException {

        FactoryMap factoryMap = new FactoryMap();
        RW_File rwFile = new RW_File();
        Scanner sc = new Scanner(System.in);
        Map dataMap;
        Map collectionMap;

        int mapOption;
        mapOption = mapSelection(sc);

        dataMap = factoryMap.getMapImplementation(mapOption);
        collectionMap = factoryMap.getMapImplementation(mapOption);
        rwFile.addDatafromFile(dataMap, "C:\\Users\\Xavier\\Documents\\IntelliJ-Projects\\OnlineShop_wMaps\\ListadoProducto.txt");

    }

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

}