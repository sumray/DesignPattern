package design.responsibility;

public class PasswordCheck extends MiddleWare {

	private Server server;

	public PasswordCheck(Server server) {
		this.server = server;
	}

	@Override
	public boolean check(String email, String password) {
		if (!server.getPassword(email).equals(password)) {
			System.out.println("密码错误！");
			return false;
		}
		return checkNext(email, password);
	}
	
}
