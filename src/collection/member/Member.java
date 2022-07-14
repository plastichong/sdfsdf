package collection.member;

import java.util.Objects;

//VO
public class Member {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }


    @Override
    public String toString() {
        return "Member {" +
                "memberId = " + this.memberId +
                ", memberName = '" + this.memberName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return memberId == member.memberId && Objects.equals(memberName, member.memberName);
    }

//    public boolean equals(Object o){
//       if (o instanceof Member){
//           Member member = (Member) o;
//           if (member.memberId == this.memberId){
//               return true;
//           }else {return false;}
//       }
//        return false;
//    }


    @Override
    public int hashCode() {
        return memberId;
    }
}
