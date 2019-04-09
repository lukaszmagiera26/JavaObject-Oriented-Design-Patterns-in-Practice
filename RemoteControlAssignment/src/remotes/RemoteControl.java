package remotes;

import devices.Device;

public class RemoteControl {
    private Device device = null;
    private static RemoteControl INSTANCE = new RemoteControl();

    public static RemoteControl getRemoteControl() {
        return INSTANCE;
    }

   public void setDevice(Device choose) {
        this.device = choose;
       System.out.println("-------------------Conected----with---" + choose  );
    }


  public void turningOnn(){
     this.device.turnOn();
  }

    public void turningOff(){
        this.device.turnOff();
    }

}
