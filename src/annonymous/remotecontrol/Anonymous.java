package annonymous.remotecontrol;

public class Anonymous {
    RemoteControl field = new RemoteControl() { //필드에 인터페이스 타입으로 익명 객체 생성
        @Override
        public void turnOn() {
            System.out.println("tv를 켭니다");
        }

        @Override
        public void turnOff() {
            System.out.println("tv를 끕니다");
        }
    };


    void method1(){ //인터페이스 타입의 로컬 참조변수로 익명 객체 생성
        RemoteControl local = new RemoteControl(){
            @Override
            public void turnOn() {
                System.out.println("tv를 켭니다");
            }

            @Override
            public void turnOff() {
                System.out.println("tv를 끕니다");
            }
        };
        local.turnOn();
    }

    void method2(RemoteControl rc){
        rc.turnOff();
    }




}
