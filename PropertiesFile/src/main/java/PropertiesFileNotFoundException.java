package main.java;

import java.io.FileNotFoundException;

public class PropertiesFileNotFoundException extends FileNotFoundException {
    private String propertiesFileName;

    public PropertiesFileNotFoundException(String errorString, String propertiesFileName) {
        super(errorString);
        this.propertiesFileName = propertiesFileName;
    }

    @Override
    public String toString() {
        return String.format("PropertiesFileNotFoundException: %s is not found", propertiesFileName);
    }
}
