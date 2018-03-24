package main.java;

public class NuclearPoweredBoat {
    private String name;
    public Engine engine;

    public NuclearPoweredBoat(String name) {
        this.name = name;
        engine = new Engine();
    }

    public class Engine {
        public final static int numberOfDetailsNeededForJourney = 10;
        private int foundDetails=0;
        private boolean isOn = false;

        public int getFoundetails() {
            return foundDetails;
        }

        public void setFoundetails(int foundetails) {
            this.foundDetails = foundetails;
        }
    }

    public String getName() {
        return name;
    }

    public boolean goToJourney() {
        if (engine.foundDetails==Engine.numberOfDetailsNeededForJourney) {
            engine.isOn = true;
            System.out.println("Nuclear-Powered boat is ready to go!");
            return true;
        }
        System.out.println("Sorry, you're drown");
        return false;
    }
}
