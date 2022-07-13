package collection.member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberList = new MemberArrayList();

        Member son = new Member(100,"son");

//        memberList.addMember(new Member(100,"son"));
        memberList.addMember(son);
        memberList.addMember(new Member(200,"wee"));
        memberList.addMember(new Member(300,"lim"));
        memberList.addMember(new Member(400,"lee"));

        memberList.removeMember2(200);

        memberList.showAllMember();



    }
}
