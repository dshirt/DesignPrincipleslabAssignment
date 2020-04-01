package ie.gmit.dependency;

public class Radio implements Switchable {
    public void turnOn() {
        System.out.println("Radio: Radio turned on...");
    }
    public void turnOff() {
        System.out.println("Radio: Radio turned off...");
    }
}