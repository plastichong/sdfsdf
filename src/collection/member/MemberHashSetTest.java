package collection.member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberSet = new MemberHashSet();

        memberSet.addMember(new Member(100,"wee"));
        memberSet.addMember(new Member(100,"wee"));
        memberSet.addMember(new Member(200,"weee"));
        memberSet.addMember(new Member(300,"weeee"));
        memberSet.addMember(new Member(300,"weeee"));


        memberSet.showAllMember2();

    }
}
