package UI;

import Controller.Controller;
import Model.FactoryMap;
import Controller.RW_File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class DriverProgram {
    public static void main(String[] args) throws FileNotFoundException {

        FactoryMap factoryMap = new FactoryMap();
        Controller controller = new Controller();
        RW_File rwFile = new RW_File();
        Scanner sc = new Scanner(System.in);
        Map dataMap;
        Map collectionMap;

        int mapOption;
        mapOption = menuOption.mapSelection(sc);

        dataMap = factoryMap.getMapImplementation(mapOption);
        collectionMap = factoryMap.getMapImplementation(mapOption);
        rwFile.addDatafromFile(dataMap, "C:\\Users\\Xavier\\Documents\\IntelliJ-Projects\\OnlineShop_wMaps\\ListadoProducto.txt");

        controller.shopMenuAction(sc, dataMap, collectionMap);

    }
}