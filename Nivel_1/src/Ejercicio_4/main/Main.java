package Ejercicio_4.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String filePath = "src" + File.separator + "Ejercicio_4" + File.separator + "Resources" + File.separator + "testDirectory" + File.separator + "ExampleUtils.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Error loading file: " + e.getMessage());
        }
    }
}