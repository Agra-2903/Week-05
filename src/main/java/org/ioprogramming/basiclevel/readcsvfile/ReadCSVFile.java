package org.ioprogramming.basiclevel.readcsvfile;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;


public class ReadCSVFile {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/ioprogramming/basiclevel/readcsvfile/students.csv";
        try(CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                System.out.println("ID: " + nextLine[0] + " Name: " + nextLine[1]);
            }
        } catch (IOException | CsvValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
