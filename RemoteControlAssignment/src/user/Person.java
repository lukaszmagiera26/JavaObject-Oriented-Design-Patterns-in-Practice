package user;

import devices.Projector;
import devices.SurroundSoundSystem;
import devices.TV;
import remotes.RemoteControl;

public class Person {

    public static void main(String[] args) {
       RemoteControl ra = RemoteControl.getRemoteControl();
        TV t = new TV();
        Projector p = new Projector();
        SurroundSoundSystem s = new SurroundSoundSystem();

        ra.setDevice(t);
        ra.turningOnn();
        ra.turningOff();

        ra.setDevice(p);
        ra.turningOff();

        ra.setDevice(s);
        ra.turningOnn();




    }




}
