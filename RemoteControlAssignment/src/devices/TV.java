package devices;

import devices.Device;

public class TV implements Device {

    @Override
    public String toString() {
        return "devices.TV{}";
    }

    @Override
    public void turnOn() {
        System.out.println("Tv is turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("devices.TV is turn Off");
        this.info();
    }

    private void info(){
        System.out.println("devices.TV will be shut down in 3 second ");
    }

}
