package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("사용자1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("사용자2", 16, 80);
//        MemberConstruct member3 = new MemberConstruct();

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 성적: " +  member.grade);
        }
    }
}
