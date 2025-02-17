package Ejercicio_3.main;

import Ejercicio_3.classes.FileSorter;
import Ejercicio_3.exceptions.InvalidDirectoryException;
import java.io.File;

public class Main {

    public static void main(String[] args) {

        String directoryPath = "src" + File.separator + "Ejercicio_3" + File.separator + "resources";

        try {

            FileSorter.listDirectoryTree(directoryPath, 0);
        } catch (InvalidDirectoryException e) {

            System.out.println(e.getMessage());
        }
    }
}