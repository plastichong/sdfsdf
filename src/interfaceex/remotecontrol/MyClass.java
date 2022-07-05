package interfaceex.remotecontrol;

public class MyClass {
    RemoteControl rc = new Television();

    MyClass(){}
    MyClass(RemoteControl remoteControl){
        rc = remoteControl;
    }
}
