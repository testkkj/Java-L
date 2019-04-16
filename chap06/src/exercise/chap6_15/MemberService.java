package exercise.chap6_15;

public class MemberService {
	String name;
	final String id = "hong";
	final String password = "12345";
	int age;
	
	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}
	
	boolean login(String id, String password) {
		if(this.id == id && this.password == password) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
