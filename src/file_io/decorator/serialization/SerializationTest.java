package file_io.decorator.serialization;

import java.io.*;

public class SerializationTest {

    public static void main(String[] args) {

        Person p = new Person("손정의","대표의사");
        Person p2 = new Person("장그래","부장");


        try(
            FileOutputStream fos = new FileOutputStream("serial.out")         ;
            ObjectOutputStream oos = new ObjectOutputStream(fos);
                ){

            oos.writeObject(p);
            oos.writeObject(p2);

        }catch (IOException e){
            e.printStackTrace();
        }


        try(FileInputStream fis = new FileInputStream("serial.out");
            ObjectInputStream ois = new ObjectInputStream(fis)
        ){
            Person person = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();
            System.out.println(person);
            System.out.println(person2);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
