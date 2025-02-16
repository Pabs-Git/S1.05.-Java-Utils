package Ejercicio_3.classes;

import Ejercicio_3.exceptions.InvalidDirectoryException;

import java.io.*;
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

        File outputFile = new File("directory_listing.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writeDirectoryTree(files, writer, depth);
        } catch (IOException e) {
            System.out.println("Error while trying to writte the message: " + e.getMessage());
        }

        System.out.println("The directory tree has been saved inside 'Nivel_1': 'directory_listing.txt'");
    }

    private static void writeDirectoryTree(File[] files, BufferedWriter writer, int depth) throws IOException {

        for (File file : files) {

            String type = file.isDirectory() ? "(D)" : "(F)";
            String lastModified = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
                    .format(file.lastModified());

            writer.write("  ".repeat(depth) + file.getName() + " " + type + " [Last modified: " + lastModified + "]");
            writer.newLine();

            if (file.isDirectory()) {
                writeDirectoryTree(file.listFiles(), writer, depth + 1);
            }
        }
    }
}

