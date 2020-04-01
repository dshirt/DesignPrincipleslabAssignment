package ie.gmit.dependency;

public class ElectricSocketWithSwitch {
    public Switchable appliance;
    public boolean on;
    public ElectricSocketWithSwitch(Switchable appliance) {
        this.appliance = appliance;
        this.on = false;
    }
    public boolean isOn() {
        return this.on;
    }
    public void press(){
        boolean checkOn = isOn();
        if (checkOn) {
            appliance.turnOff();
            this.on = false;
        } else {
            appliance.turnOn();
            this.on = true;
        }
    }
}
