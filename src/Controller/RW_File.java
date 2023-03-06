package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class RW_File {

    public void addDatafromFile(Map<String, String> dataMap, String path) throws FileNotFoundException {

        File file = new File(path);
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){

            String dataLine= scanner.nextLine();
            String[] fileTempData = dataLine.split("\\|\t");
            dataMap.put(fileTempData[1].trim(), fileTempData[0].trim());

        }

        scanner.close();

    }
}
