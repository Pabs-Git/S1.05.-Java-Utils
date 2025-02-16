package Ejercicio_2.main;

import Ejercicio_2.classes.FileSorter;
import Ejercicio_2.exceptions.InvalidDirectoryException;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        String directoryPath = "src" + File.separator + "Ejercicio_2" + File.separator + "resources";

        try {

            FileSorter.listDirectoryTree(directoryPath, 0);
        } catch (InvalidDirectoryException e) {

            System.out.println(e.getMessage());
        }
    }
}