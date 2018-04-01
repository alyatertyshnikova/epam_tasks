package main.java;

import java.io.*;

public class ToSerialize {

    public static boolean toSerialize(MovieCollection object, String fileName) {
        if (fileName == null) {
            return false;
        }
        try (ObjectOutputStream outputObject = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputObject.writeObject(object);
        } catch (IOException exception) {
            System.out.println(exception);
            return false;
        }
        return true;
    }

    public static MovieCollection toDeserialize(String fileName) {
        MovieCollection object = null;
        if (fileName == null) {
            return null;
        }
        try (ObjectInputStream inputObject = new ObjectInputStream(new FileInputStream(fileName))) {
            object = (MovieCollection) inputObject.readObject();
        } catch (IOException exception) {
            System.out.println(exception);
            return null;
        } catch (ClassNotFoundException exception) {
            System.out.println(exception);
            return null;
        }
        return object;
    }
}
