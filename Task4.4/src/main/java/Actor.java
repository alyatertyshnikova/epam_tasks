package main.java;

import java.io.Serializable;

public class Actor implements Serializable{
    private String name;
    private String surname;

    public Actor(String name, String surname){
        this.name=name;
        this.surname=surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString(){
        return String.format("%s %s", name, surname);
    }

    @Override
    public boolean equals(Object otherObj) {
        if (this == otherObj) {
            return true;
        }
        if (otherObj == null) {
            return false;
        }
        if (!(otherObj instanceof Actor)) {
            return false;
        }

        Actor otherActor = (Actor) otherObj;
        if (name == null || otherActor.name == null || surname == null || otherActor.surname == null) {
            return false;
        }

        if (!name.equals(otherActor.getName()) || !surname.equals(otherActor.getSurname())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        if (name != null && surname!=null) {
            return (name.hashCode() + surname.hashCode());
        }
        return -1;
    }
}
