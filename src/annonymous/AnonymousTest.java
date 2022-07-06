package annonymous;

public class AnonymousTest {
    public static void main(String[] args) {
        Anonymous annony = new Anonymous();
        annony.field.wake();

        annony.method1();

        annony.method2(new Person(){
            void study(){
                System.out.println("공부합니다");
            }
            @Override
            void wake() {
                super.wake();
                study();
            }


        });




    }
}
