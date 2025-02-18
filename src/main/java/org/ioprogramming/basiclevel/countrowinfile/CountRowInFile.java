package org.ioprogramming.basiclevel.countrowinfile;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class CountRowInFile {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/ioprogramming/basiclevel/countrowinfile/students.csv";
        try(CSVReader reader = new CSVReader(new FileReader(filePath))) {
//            String[] nextLine;
            int count = -1;

            while (reader.readNext() != null) {
                count++;
            }

            System.out.println("Count: " + count);
        } catch (IOException | CsvValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
