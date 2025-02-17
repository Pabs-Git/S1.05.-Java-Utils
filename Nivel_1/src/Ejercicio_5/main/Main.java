package Ejercicio_5.main;

import Ejercicio_5.classes.Person;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Paco", 30);

        String filePath = "src" + File.separator + "Ejercicio_5" + File.separator + "Resources" + File.separator + "person.ser";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(person);
            System.out.println("The object has been serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("The object has been deserialized: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
