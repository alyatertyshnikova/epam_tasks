package main.java;

import java.io.*;

public class ChangeEncoding {
    private StringBuilder text;

    public ChangeEncoding() {
        text = new StringBuilder();
    }

    public StringBuilder getText() {
        return text;
    }

    public boolean readFile(String fileName, String charset) {
        if (fileName == null || charset == null) {
            return false;
        }
        String line;
        text.setLength(0);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), charset))) {
            System.out.println(charset);
            while ((line = reader.readLine()) != null) {
                text.insert(text.length(), line);
                text.insert(text.length(), "\n");
            }
            System.out.println(text);
        } catch (IOException exception) {
            System.out.println(exception);
            return false;
        }
        return true;
    }

    private boolean writeFile(String fileName) {
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(fileName), "UTF16")) {
            writer.write(text.toString(), 0, text.length());
        } catch (IOException exception) {
            System.out.println(exception);
            return false;
        }
        return true;
    }

    public boolean changeEncoding(String srcFile, String dstFile) {
        if (dstFile == null) {
            return false;
        }
        if (!readFile(srcFile, "UTF8") || !writeFile(dstFile)) {
            return false;
        }
        return true;
    }
}
