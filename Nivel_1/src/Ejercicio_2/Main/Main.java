package Ejercicio_2.Main;

import Ejercicio_2.Classes.FileSorter;
import Ejercicio_2.Exceptions.InvalidDirectoryException;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        String directoryPath = "src" + File.separator + "Ejercicio_2" + File.separator + "Resources" + File.separator + "testDirectory";

        try {

            FileSorter.listDirectoryTree(directoryPath, 0);
        }

        catch (InvalidDirectoryException e) {

            System.out.println(e.getMessage());
        }
    }
}