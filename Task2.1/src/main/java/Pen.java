package main.java;

public class Pen {
    private String color;
    private String brand;
    private boolean canItWrite;

    public Pen(String color, String brand) {
        this.color = color;
        this.brand = brand;
        canItWrite = true;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isCanItWrite() {
        return canItWrite;
    }

    public void setCanItWrite(boolean canItWrite) {
        this.canItWrite = canItWrite;
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

        if(color==null || otherPen.color==null || brand==null || otherPen.brand==null) {
            return false;
        }

        if(!color.equals(otherPen.getColor())|| !brand.equals(otherPen.getBrand())){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        if(color!=null && brand!=null) {
            return (((canItWrite) ? 1 : 0) + color.hashCode() + brand.hashCode()) % 50;
        }
        return -1;
    }
}
