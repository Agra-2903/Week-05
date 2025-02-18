package org.ioprogramming.basiclevel.writecsvfile;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVFile {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/ioprogramming/basiclevel/writecsvfile/output.csv";
        try(CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            String[] header = {"ID", "Name", "Department", "Salary"};
            String[] emp1 = {"104", "Alice Williams", "Finance", "62000"};
            String[] emp2 = {"105", "Bob Johnson", "Sales", "58000"};
            writer.writeNext(header);
            writer.writeNext(emp1);
            writer.writeNext(emp2);
            System.out.println("CSV file written successfully using OpenCSV!");


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
