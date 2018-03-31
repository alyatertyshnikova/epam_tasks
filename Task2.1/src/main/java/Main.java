package main.java;

public class Main {
  public static void main(String[] args) {
    Pen p = new Pen(null, "pilot");
    Pen r = new Pen("red", "pilot");
    Pen p1 = new Pen(null, "pilot");
    System.out.println(p.toString());
    System.out.println(r.toString());
    System.out.println(p.equals(3));
    System.out.println(p.equals(p1));
    System.out.println(p.hashCode());
  }
}

