package collection.member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberList = new MemberArrayList();

        Member son1 = new Member(100,"son");
        Member son2 = new Member(100,"son");

//        memberList.addMember(new Member(100,"son"));
        memberList.addMember(son1);
        memberList.addMember(new Member(200,"wee"));
        memberList.addMember(new Member(300,"lim"));
        memberList.addMember(new Member(400,"lee"));
        memberList.addMember(son2);

        memberList.removeMember2(200);

        memberList.showAllMember();



    }
}
