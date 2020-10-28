package design.responsibility;

public class InvalidCharCheck extends MiddleWare {
	
	@Override
	public boolean check(String email, String password) {
		if (email == null || email.length() == 0) {
			System.out.println("邮箱不得为空");
			return false;
		}
		if (password == null || password.length() == 0) {
			System.out.println("密码不得为空");
			return false;
		}
		if (email.contains("select") || password.contains("select")) {
			System.out.println("数据存在非法字符");
			return false;
		}
		return checkNext(email, password);
	}
	
}
