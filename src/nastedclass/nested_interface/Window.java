package nastedclass.nested_interface;

public class Window {
    Button bt1 =  new Button();
    Button bt2 =  new Button();


    Button.OnclickLsitener listener = new Button.OnclickLsitener() {
        @Override
        public void onClick() {
            System.out.println("전화를 겁니다");
        }
    };

    Window(){
        bt1.setListener(listener);
        bt2.setListener(new Button.OnclickLsitener() {
            @Override
            public void onClick() {
                System.out.println("메시지를 보냅니다.");
            }
        });

    }

}

class ButtonTest{
    public static void main(String[] args) {
        Window w = new Window();
        w.bt1.touch();
        w.bt2.touch();
    }
}
