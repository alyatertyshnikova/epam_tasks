package main.java;

public class Main {
  public static void main(String[] args) {
    Pen p = new Pen("blue", "pilot");
    Pen r = new Pen("red", "pilot");
    Pen p1 = new Pen("blue", "pilot");
    p1.canItWrite=false;
    System.out.println(p.toString());
    System.out.println(r.toString());
    System.out.println(p.equals(3));
    System.out.println(p.equals(p1));
    System.out.println(p.hashCode());
  }
}

