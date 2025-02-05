package Ejercicio_1.Classes;

import Ejercicio_1.Exceptions.InvalidDirectoryException;
import java.io.File;
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
}
