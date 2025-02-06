package Ejercicio_3.Main;

import Ejercicio_3.Classes.FileSorter;
import Ejercicio_3.Exceptions.InvalidDirectoryException;
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