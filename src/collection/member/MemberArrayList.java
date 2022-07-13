package collection.member;

import java.util.ArrayList;


//DAO
public class MemberArrayList {
    private ArrayList<Member> arrayList;


    public MemberArrayList() {
        this.arrayList = new ArrayList<>();
    }

    public void addMember(Member member) {
        this.arrayList.add(member);
    }

    public void showAllMember() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public boolean removeMember(int memberId) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getMemberId() == memberId) {
                arrayList.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean removeMember2(int memberId){
        for (int i = 0; i < arrayList.size() ; i++) {
            Member member = arrayList.get(i);
            int dbMemberId = member.getMemberId();
            if (dbMemberId == memberId){
                arrayList.remove(i);
                return true;
            }
        }
        return false;
    }

}
