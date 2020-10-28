package design.responsibility;

public class RepeatEmail extends MiddleWare {

	private Server server;

	public RepeatEmail(Server server) {
		this.server = server;
	}

	@Override
	public boolean check(String email, String password) {
		if (server.hasEmail(email)) {
			System.out.println("存在重复邮箱");
			return false;
		}
		return checkNext(email, password);
	}
}
