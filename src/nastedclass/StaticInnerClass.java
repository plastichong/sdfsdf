package nastedclass;
class OutClass{
    int num = 10;
    static int sNum = 20;
    
    static class InClass extends NestedClass{
        int inNum = 100;
        static int sInNum = 200;
        
        void inTest(){
            sNum = 30;
            System.out.println(sNum+" : 외부 클래스의 정적 변수");
            System.out.println(inNum+" : 내부 클래스의 인스턴스 변수");
            System.out.println(sInNum+" : 내부 클래스의 정적 변수");
        }

        static void sInTest(){
            System.out.println(sInNum+" : 내부 클래스의 정적 변수");
            System.out.println(sNum+" : 외부 클래스의 정적 변수");

//            System.out.println(InNum);  인스턴스 변수 사용 불가
        }

        
    }
    
    
    
}

public class StaticInnerClass {
    public static void main(String[] args) {
        OutClass oc = new OutClass();


        OutClass.InClass.sInNum = 40;
        OutClass.InClass ic = new OutClass.InClass();
        ic.inTest();

        //정적 클래스의 정적 메서드
        System.out.println("\n정적 클래스의 정적 메서드 :\n");
        OutClass.InClass.sInTest();
    }
}
