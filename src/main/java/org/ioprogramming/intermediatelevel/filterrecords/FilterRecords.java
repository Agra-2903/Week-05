package org.ioprogramming.intermediatelevel.filterrecords;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class FilterRecords {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/ioprogramming/intermediatelevel/filterrecords/students.csv";
        try(CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine = reader.readNext();

            while ((nextLine = reader.readNext()) != null) {
                if(Integer.valueOf(nextLine[3]) > 80) {
                    System.out.printf("%-5s%-15s%-5s%-5s%n", nextLine[0], nextLine[1], nextLine[2], nextLine[3]);
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
