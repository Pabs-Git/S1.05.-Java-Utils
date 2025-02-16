package Ejercicio_1.main;

import Ejercicio_1.classes.FileSorter;
import Ejercicio_1.exceptions.InvalidDirectoryException;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        String directoryPath = "src" + File.separator + "Ejercicio_1" + File.separator + "Resources" + File.separator + "testDirectory";

        try {

            FileSorter.alphabeticalSorting(directoryPath);
        }

        catch (InvalidDirectoryException e) {

            System.out.println(e.getMessage());
        }
    }
}