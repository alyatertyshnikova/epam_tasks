package main.java;

public class Pen {
    private String color;
    private String brand;
    public boolean canItWrite;

    public Pen(String color, String brand) {
        this.color = color;
        this.brand = brand;
        canItWrite = true;
    }

    @Override
    public String toString() {
        return canItWrite ? String.format("%s %s can write", color, brand) :
                String.format("%s %s can't write", color, brand);
    }

    @Override
    public boolean equals(Object otherObj) {
        if (this == otherObj) {
            return true;
        }
        if (otherObj == null) {
            return false;
        }
        if (!(otherObj instanceof Pen)){
            return false;
        }

        Pen otherPen=(Pen)otherObj;
        if (canItWrite != otherPen.canItWrite) {
            return false;
        }
        if (!equals(color.toCharArray(), otherPen.color.toCharArray())){
            return false;
        }
        if(!equals(brand.toCharArray(), otherPen.brand.toCharArray())){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        return (((canItWrite)?1:0)+hashCode(color.toCharArray())+hashCode(brand.toCharArray()))%50;
    }

    private int hashCode(char[] string){
        int hash=0;
        for (int i=0; i<string.length; i++){
            hash+=string[i];
        }
        return hash;
    }

    private boolean equals(char[]string1, char[]string2){
        if(string1.length!=string2.length){
            return false;
        }
        for(int i=0; i<string1.length; i++){
            if(string1[i]!=string2[i]){
                return false;
            }
        }
        return true;
    }
}
