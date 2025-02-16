package Ejercicio_2.classes;

import Ejercicio_2.exceptions.InvalidDirectoryException;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class FileSorter {

    public static void alphabeticalSorting(String directoryPath) throws InvalidDirectoryException {

        File directory = new File(directoryPath);

        if (!directory.exists()) {

            throw new InvalidDirectoryException("The specified directory doesn't exist");
        }

        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            throw new InvalidDirectoryException("The specified directory is empty.");
        }

        Arrays.sort(files);
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    public static void listDirectoryTree(String directoryPath, int depth) throws InvalidDirectoryException {

        File directory = new File(directoryPath);

        if (!directory.exists()) {

            throw new InvalidDirectoryException("The specified directory doesn't exist");
        }

        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            throw new InvalidDirectoryException("The specified directory is empty.");
        }

        Arrays.sort(files);

        for (File file : files) {
            String type = file.isDirectory() ? "(D)" : "(F)";
            String lastModified = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
                    .format(file.lastModified());

            System.out.println("  ".repeat(depth) + file.getName() + " " + type + " [Last modified: " + lastModified + "]");

            if (file.isDirectory()) {
                listDirectoryTree(file.getAbsolutePath(), depth + 1);
            }
        }
    }
}
