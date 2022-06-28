package array;
class Person{

    private String name;
    private int girlFriendAge;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setGirlFriendAge(int age){
        if(age>48){
            this.girlFriendAge = age;
        }else {
            System.out.print("48보다 작을 수 없습니다.");
        }
    }

    public int getAge(){
        return this.girlFriendAge;
    }
}
public class wee {
    public static void main(String[] args) {
    Person p = new Person();
    p.setName("위수영");
    p.setGirlFriendAge(28);

    System.out.println(p.getName());
    System.out.println(p.getAge());
    }
}
