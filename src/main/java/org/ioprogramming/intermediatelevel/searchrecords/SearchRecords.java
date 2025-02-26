package org.ioprogramming.intermediatelevel.searchrecords;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class SearchRecords {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/ioprogramming/intermediatelevel/searchrecords/employees.csv";

        try(CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine = reader.readNext();

            while ((nextLine = reader.readNext()) != null) {
                if(nextLine[1].equals("John Doe")) {
                    System.out.println(nextLine[0] + ", " + nextLine[1] + ", " + nextLine[2] + ", " + nextLine[3]);
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
