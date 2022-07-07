package example;

public class Dog implements Soundable{
    String dogName;
    @Override
    public String sound() {
        return "멍멍";
    }

    public boolean equals(Object obj){
        if (obj instanceof Dog){
            Dog dog = (Dog)obj;
            if(dog.dogName.equals(dog.dogName)){
                return true;
            }
        }
        return false;
    }

}
