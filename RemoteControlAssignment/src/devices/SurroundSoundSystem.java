package devices;

import devices.Device;

public class SurroundSoundSystem implements Device {

    @Override
    public String toString() {
        return "devices.SurroundSoundSystem{}";
    }

    @Override
    public void turnOn() {
        System.out.println("devices.SurroundSoundSystem is turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("devices.SurroundSoundSystem is turn Off");
    }
}
