package example;

class Chatting{
    void startChat(String chatId){
//        String nickName = null;
//        nickName = chatId;
        String nickName = chatId;

    class Chat{//내부클래스 시작

      public void start(){
          while (true){
              String inputData = "안녕하세요";
              String message = "["+nickName+"]"+inputData;
              sendMessage(message);
          }
      }

          void sendMessage(String message){

          }
    }
    //내부클래스 끝
    Chat chat = new Chat();
    chat.start();

    }
}


class CheckBox{
    OnSelectListener listener;

    void setOnSelectListener(OnSelectListener listener){
        this.listener = listener;
    }
    void select(){
        listener.onSelect();
    }

    static interface OnSelectListener{
        void onSelect();
    }

}

class BackGroundChangeListener implements CheckBox.OnSelectListener {
    @Override
    public void onSelect() {
        System.out.println("배경을 변경합니다");
    }
}



public class Test9_2 {
    public static void main(String[] args) {
        CheckBox checkBox = new CheckBox();
        checkBox.setOnSelectListener(new BackGroundChangeListener());
        checkBox.select();
    }


}
