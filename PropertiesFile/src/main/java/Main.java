package main.java;

public class Main {
    public static void main(String[] args){
        String fileName="/Users/macintosh/IdeaProjects/PropertiesFile/src/file.properties";
        String wrongName="d.properties";
        PropertiesFile file=null;
        try {
            file = PropertiesFile.getInstance(fileName);
            file.showPropertiesData();
        }catch (PropertiesFileNotFoundException exception){
            exception.printStackTrace();
            return;
        }
        try {
            String value = file.getValue("X");
            int a=5;
        }catch (KeyNotFoundException exception){
           exception.printStackTrace();
           return;
        }
    }
}
