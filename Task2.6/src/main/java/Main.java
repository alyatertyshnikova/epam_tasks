package main.java;

public class Main {
    public static void main(String[] args) {
        NuclearPoweredBoat nuclearPoweredBoat=new NuclearPoweredBoat("GreatBoat");
        nuclearPoweredBoat.goToJourney();
        nuclearPoweredBoat.repairDetails(10);
        nuclearPoweredBoat.goToJourney();
    }
}