package ie.gmit.dependency;

public class Tv implements Switchable {
    public void turnOn() {
        System.out.println("Tv: TV turned on...");
    }
    public void turnOff() {
        System.out.println("Tv: TV turned off...");
    }
}