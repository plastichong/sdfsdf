package collection.member;

public class MemberHashMapTest {
    public static void main(String[] args) {

        MemberHashMap hashMap = new MemberHashMap();

        hashMap.addMember(new Member(100,"wee"));
        hashMap.addMember(new Member(200,"wee"));
        hashMap.addMember(new Member(300,"wee"));
        hashMap.addMember(new Member(400,"wee"));
        hashMap.addMember(new Member(500,"wee"));

        hashMap.removeMember(400);

        hashMap.showAllMember();

    }
}
