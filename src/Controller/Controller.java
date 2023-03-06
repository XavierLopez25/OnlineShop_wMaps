package Controller;

import UI.menuOption;
import java.util.*;

public class Controller {

    public void shopMenuAction(Scanner sc, Map<String, String> dataMap, Map<String, String> collectionMap){

        int selection = menuOption.shopMenu(sc);

        while(!(selection == 6)){

            switch (selection){

                case 1:
                    String productName, productCategory, nameCheck, categoryCheck = "";

                    System.out.println("\nPlease, write the name of the product you want to add: \n");
                    productName = sc.nextLine();

                    System.out.println("Please, write the category of the product: \n");
                    productCategory = sc.nextLine();

                    nameCheck = productName.substring(0,1).toUpperCase() + productName.substring(1);
                    categoryCheck = productCategory.substring(0,1).toUpperCase() + productCategory.substring(1);

                    if((!dataMap.containsKey(nameCheck) && dataMap.containsValue(categoryCheck))){
                        if(!(collectionMap.containsKey(nameCheck))) {
                            collectionMap.put(nameCheck, categoryCheck);

                        }else{
                            collectionMap.replace(nameCheck, categoryCheck);

                        }
                        System.out.println("Product added.");
                    }else{
                        System.out.println("This product is not available in the inventory.");
                    }

                    break;

                case 2:
                    String productNameC;

                    System.out.println("\nPlease, write the name of the product you to know the category: \n");
                    productNameC = sc.nextLine();
                    productNameC = productNameC.substring(0,1).toUpperCase() + productNameC.substring(1);

                    if(dataMap.containsKey(productNameC)){
                        System.out.println("The product: " + productNameC + ", it's in the: " + dataMap.get(productNameC) + " category.");
                    }

                case 3:
                    if (collectionMap.isEmpty()){
                        System.out.println("Please add some products.");
                    }

                    Object[] collectionValues = collectionMap.values().toArray();
                    Object[] collectionKeys = collectionMap.keySet().toArray();
                    System.out.println("\n(Non-Sorted)");
                    System.out.printf("%-20s %20s  %n", "Category:", "Product Name:");

                    for (int i = 0; i < collectionValues.length; i++) {

                        String tempString = collectionValues[i].toString();
                        String tempString2 = collectionKeys[i].toString();
                        String[] splittedValues = tempString.split("=");
                        String[] splittedValues2 = tempString2.split("=");

                        System.out.printf("%-20s %20s %n", splittedValues[0], splittedValues2[0]);

                    }

                    System.out.println("\n\n(Sorted)\n");

                    //Sort the map by key
                    Map<String, String> sortedMap = new TreeMap<>(collectionMap);

                    //Sort the entries of the sortedMap by value
                    List<Map.Entry<String, String>> list = new ArrayList<>(sortedMap.entrySet());
                    list.sort(Map.Entry.comparingByValue());
                    Map<String, String> sortedByValueMap = new LinkedHashMap<>();
                    for (Map.Entry<String, String> entry : list) {
                        sortedByValueMap.put(entry.getKey(), entry.getValue());
                    }

                    //Operations with sortedByValueMap
                    System.out.println("Product Name:\t\t\tCategory:");
                    for (Map.Entry<String, String> entry : sortedByValueMap.entrySet()) {
                        System.out.println(entry.getKey() + "\t\t\t" + entry.getValue());
                    }

                    List asList = Arrays.asList(collectionValues);
                    Set<String> mySet = new HashSet<String>(asList);

                    System.out.println("\nQuantity of products of\n");

                    for (String product: mySet){
                        System.out.println("\n " + product + " Quantity: " + Collections.frequency(asList, product));
                    }

                    System.out.println("\n");

                    break;

                case 4:
                    System.out.println("\nInventory: ");
                    System.out.println("Product:    |   Category:");
                    for (String keys: dataMap.keySet()) {
                        String key = keys.toString();
                        String value = dataMap.get(keys).toString();
                        System.out.println(key + " ->  " + value);
                    }
                    System.out.println("\n");

                    break;


                case 5:
                    //Sort the map by key
                    Map<String, String> sortedMapInventory = new TreeMap<>(dataMap);

                    //Sort the entries of the sortedMap by value
                    List<Map.Entry<String, String>> listInventory = new ArrayList<>(sortedMapInventory.entrySet());
                    listInventory.sort(Map.Entry.comparingByValue());
                    Map<String, String> sortedByValueMapInventory = new LinkedHashMap<>();
                    for (Map.Entry<String, String> entry : listInventory) {
                        sortedByValueMapInventory.put(entry.getKey(), entry.getValue());
                    }

                    //Operations with sortedByValueMap
                    System.out.println("Product Name:\t\t\tCategory:");
                    for (Map.Entry<String, String> entry : sortedByValueMapInventory.entrySet()) {
                        System.out.println(entry.getKey() + "\t\t\t" + entry.getValue());
                    }

                    break;

                case 6:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Please enter a valid option.");
            }

            selection = menuOption.shopMenu(sc);

        }

    }

}
