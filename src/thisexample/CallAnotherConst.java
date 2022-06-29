package thisexample;

class Person{
    String name;
    int age;
    Person(){
        this("이름 없음",1);//자신의 생성자를 호출
    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    Person returnItSelf(){ //Person은 자료형(객체)
        return this;        //this (여기서는 객체)를 반환함
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person noName = new Person();
        Person son = new Person("wee",23);
        System.out.println(noName.name);
        System.out.println(son.age);

        Person p = noName.returnItSelf();
        System.out.println(p);
        System.out.println(noName.returnItSelf());
        System.out.println(noName);
    }
}
