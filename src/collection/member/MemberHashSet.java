package collection.member;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberHashSet {
    private Set<Member> memberSet;

    public MemberHashSet() {
        this.memberSet = new HashSet<>();
    }

    public void addMember(Member member) {
        memberSet.add(member);
    }

    public void showAllMember() {
        Iterator<Member> iterator = memberSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> iterator = memberSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            int dbMemberId = member.getMemberId();
            if (dbMemberId == memberId) {
                memberSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId+"번 회원이 존재하지 않습니다.");
        return false;
    }

    public void showAllMember2() {
        for (Member member: memberSet) {
            System.out.println(member);
        }
    }

}
