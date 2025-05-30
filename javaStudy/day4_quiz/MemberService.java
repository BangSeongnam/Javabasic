package javaStudy.day4_quiz;

public class MemberService {

	public boolean login(String id, String password) {

		if (id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
	}

	// member 객체를 파라미터로 받아서 처리하는 메서드 오버로딩
	public boolean login(Member member) {
		if (member.getId().equals("jason") && member.getPassword().equals("1111")) {
			return true;
		}
		return false;
	}

	public void logout(Member member) {
		System.out.println(member.getId() + " 님이 로그아웃 함");
	}
}
