package main.java;
public class KeyNotFoundException extends Throwable{
    private String key;

    public KeyNotFoundException(String errorString, String key){
        super(errorString);
        this.key=key;
    }

    @Override
    public String toString() {
        return String.format("KeyNotFoundException: Key %s is not found", key);
    }
}
