package design.responsibility;

public class EmailCheck extends MiddleWare {
	
	private Server server;

	public EmailCheck(Server server) {
		this.server = server;
	}

	@Override
	public boolean check(String email, String password) {
		if (!server.hasEmail(email)) {
			System.out.println("不存在该邮箱");
			return false;
		}
		return checkNext(email, password);
	}
	
}
