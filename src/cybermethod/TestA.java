package cybermethod;

public class TestA {
        int num;

        void aaa(){
            System.out.println("aaa() 출력");
    }

    public static void main(String[] args) {
        TestA a = new TestA();

        a.num = 10;
        a.aaa();

        TestA a2 = new TestA();
        a2.num = 20;
        a2.aaa();

        //a,a2  heap 의 객체주소를 참조 (스택)
        //a,a2의 num (heap)
        //aaa() (데이터영역)
    }
}
