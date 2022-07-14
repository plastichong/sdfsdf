package collection.member;

import java.util.*;

public class MemberHashMap {
    Map<Integer,Member> memberMap;



    public MemberHashMap() {
        this.memberMap = new HashMap<>();
    }

    public void addMember(Member member){
        memberMap.put(member.getMemberId(), member);
    }


    public void showAllMember(){
        Iterator<Integer> iterator = memberMap.keySet().iterator();
        while (iterator.hasNext()){
            int key = iterator.next();
            Member member = memberMap.get(key);
            System.out.println(member);
        }
    }


    public boolean removeMember(int memberId){
        if(memberMap.containsKey(memberId)){
            memberMap.remove(memberId);
            return true;
        }
        System.out.println(memberId+"가 존재하지 않습니다.");
        return false;
    }

}
