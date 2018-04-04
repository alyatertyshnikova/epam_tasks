package main.java;

import java.io.*;
import java.util.*;

public class PropertiesFile {
    private static PropertiesFile instance;
    private String fileName;
    private Properties properties;
    private Map<String, String> values;
    /*Если добавить в Map элемент с ключом, который уже присутствует, то она перезапишет значение,
      соответсвующее ключу на значение добавляемого элемента*/

    private PropertiesFile(String fileName) throws PropertiesFileNotFoundException {
        this.fileName = fileName;
        properties = new Properties();
        values = new HashMap<>();
        try (FileInputStream input = new FileInputStream(fileName)) {
            properties.load(input);
            getValues();
        } catch (FileNotFoundException exception) {
            if (fileName.contains(".properties")) {
                throw new PropertiesFileNotFoundException(".properties not found", fileName);
            }
            System.out.println(exception);
        } catch (IOException exception) {
            System.out.println(exception);
        }
    }

    public static PropertiesFile getInstance(String fileName) throws PropertiesFileNotFoundException {
        if (instance == null) {
            instance = new PropertiesFile(fileName);
        }
        return instance;
    }

    private void getValues() {
        String key;
        Set<String> keys = properties.stringPropertyNames();
        Iterator<String> iterator = keys.iterator();
        do {
            key = iterator.next();
            values.put(key, properties.getProperty(key));
        } while (iterator.hasNext());
    }

    public String getValue(String key) throws KeyNotFoundException {
        String value;
        if ((value = values.get(key)) == null) {
            throw new KeyNotFoundException("Key is not found", key);
        }
        return value;
    }

    public String getFileName() {
        return fileName;
    }
}
