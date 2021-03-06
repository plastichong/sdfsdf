package classexample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {
    public static void main(String[] args) throws ClassNotFoundException{

        Person p = new Person();

        Class<?> pClass1 = p.getClass();
        System.out.println(pClass1.getName());

        Class<?> pClass2 = Class.forName("classexample.Person");
        System.out.println(pClass2.getName());

        System.out.println("생성자 정보 가져오기");
        Constructor<?>[] cons = pClass1.getConstructors();


        for (Constructor c:cons) { System.out.println(c);}


        System.out.println();
        System.out.println("필드 정보 가져오기");
        Field[] fields = pClass1.getDeclaredFields();

        for (Field f:fields) { System.out.println(f);}



        System.out.println("메소드 정보 가져오기");
        Method[] methods = pClass1.getMethods();
        for (Method m:methods) { System.out.println(m);}

    }
}
