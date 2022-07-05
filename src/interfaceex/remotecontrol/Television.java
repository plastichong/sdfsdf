package interfaceex.remotecontrol;

public class Television implements RemoteControl{

    int volume;

    @Override
    public void turnOn() {
        System.out.println("turnOnTV");
    }

    @Override
    public void turnOff() {
        System.out.println("turnOffTV");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
      System.out.println("현재 볼륨 : "+this.volume);
    }

    public static void main(String[] args) {
        Television tv = new Television();
        tv.turnOn();
        tv.setVolume(11);
        tv.turnOff();
        tv.setMute(true);
        RemoteControl.changeBattery();

        RemoteControl audio = new Audio();
        audio.turnOn();
    }

}
