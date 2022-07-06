package nastedclass;


class A {
    int field_A;
    A() {System.out.println("A 객체 생성");}

    class B {       //인스턴스 클래스
        int field_B;
        void method_B(){A.this.field_A=1;}
        B() {System.out.println("B 객체 생성");}
    }

    static class C{     // 정적 클래스
        int field_C;
        void method_C(){}

        static int field_C2;
        static void method_C2(){System.out.println("call static method_C2!");}
        C(){System.out.println("C 객체 생성");}
    }

    void method(){
        class D{
            int field_D;
            D(){System.out.println("D 객체 생성");}
            void method_D(){System.out.println("call method D");}
        }

        D d = new D();
        d.method_D();
    }



}
public class NestedClass {
    public static void main(String[] args) {
        A a = new A();  //Create Instance A


        A.B b = a.new B();  //Create Instance B
        b.field_B = 4;
        b.method_B();


        A.C.method_C2();     //static method
        A.C.field_C2 = 1;    //Instance field

        A.C c = new A.C();  //Crate Instance C

        c.field_C = 1;      //Instance field
        c.method_C();       //Instance method

        a.method();

    }


}
