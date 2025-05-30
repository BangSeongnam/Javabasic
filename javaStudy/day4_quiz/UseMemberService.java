package javaStudy.day4_quiz;

public class UseMemberService {

	public static void main(String[] args) {
		//여러분을 Member 객체로 생성합니다.
		Member me = new Member();
		me.setName("재현");
		me.setAge(31);
		me.setId("jason");
		me.setPassword("1111");
		
		MemberService memService = new MemberService();
		boolean res = memService.login(me);
		if(res) {
			System.out.println(me.getName() + " 님이 로그인 되었음");
		}else {
			System.out.println("id 나 password가 틀림");
		}
	}

}
