package example;

import java.lang.reflect.Method;
import java.util.Objects;

public class Member {
    private String id;
    private String name;

    Member(String id,String name){
        this.id=id;
        this.name= name;
    }

    @Override
    public String toString() {
        return  id +":"+ name ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id) && Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Member member = new Member("blue","이파란");

        System.out.println(member);
    }
}
