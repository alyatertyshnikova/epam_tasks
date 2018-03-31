package main.java;

public class NuclearPoweredBoat {
    private String name;
    public Engine engine;
    public final static int numberOfDetailsNeededForJourney = 10;

    public NuclearPoweredBoat(String name) {
        this.name = name;
        engine = new Engine();
    }

    private class Engine {
        private int foundDetails=0;
        private boolean isOn = false;

        public void setFoundetails(int foundetails) {
            this.foundDetails = foundetails;
        }
    }

    public int getFoundDetails() {
        return engine.foundDetails;
    }

    public void repairDetails(int foundetails) {
        System.out.println("Check all details in process");
        engine.setFoundetails(foundetails);
    }

    public String getName() {
        return name;
    }

    public boolean goToJourney() {
        if (engine.foundDetails==numberOfDetailsNeededForJourney) {
            engine.isOn = true;
            System.out.println("Nuclear-Powered boat is ready to go!");
            return true;
        }
        System.out.println("Sorry, you're drown");
        return false;
    }
}
