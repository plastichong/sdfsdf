package interfaceex.remotecontrol;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    public void turnOn();
    public  void turnOff();
    public void setVolume(int volume);

    default void setMute(boolean mute){
        if(mute){
            System.out.println("mute");
        }else {
            System.out.println("unMute");
        }
    }

    static void changeBattery(){
        System.out.println("배터리를 교체합니다.");
    }
}
