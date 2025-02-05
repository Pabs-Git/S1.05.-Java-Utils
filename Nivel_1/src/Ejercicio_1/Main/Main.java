package Ejercicio_1.Main;

import Ejercicio_1.Classes.FileSorter;
import Ejercicio_1.Exceptions.InvalidDirectoryException;

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