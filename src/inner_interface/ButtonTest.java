package inner_interface;

public class ButtonTest {
    public static void main(String[] args) {
    Button bt = new Button();
    CallListener call = new CallListener();
//    MessageListener message = new MessageListener();

    bt.setListener(call);
    bt.touch();
    bt.setListener(new MessageListener());
    bt.touch();


                    // Button 안의 OnClickListener 인터페이스의 익명 객체를 생성하여 (인터페이스 타입)
                    // onClick 메서드 오버라이딩
    bt.setListener(new Button.OnClickListener() {
        @Override
        public void onClick() {
            System.out.println("사진을 찍습니다");
        }
    });

    bt.touch();


    }

}
