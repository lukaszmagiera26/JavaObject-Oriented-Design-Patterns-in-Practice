package devices;

import devices.Device;

public class Projector implements Device {

    @Override
    public String toString() {
        return "devices.Projector{}";
    }

    @Override
    public void turnOn() {
        System.out.println("devices.Projector is turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("devices.Projector is turn Off");
    }


}
