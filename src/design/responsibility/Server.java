package design.responsibility;

import java.util.HashMap;
import java.util.Map;

public class Server {

	private Map<String, String> accounts;

	public Server() {
		accounts = new HashMap<>();
	}

	public boolean registry(String email, String password) {
		MiddleWare checkChain = new InvalidCharCheck();
		checkChain.linkWith(new RepeatEmail(this));
		boolean result = checkChain.check(email, password);
		if (result) {
			accounts.put(email, password);
		}
		return result;
	}

	public boolean login(String email, String password) {
		MiddleWare checkChain = new InvalidCharCheck();
		checkChain.linkWith(new EmailCheck(this)).linkWith(new PasswordCheck(this));
		return checkChain.check(email, password);
	}

	boolean hasEmail(String email) {
		return accounts.containsKey(email);
	}
	
	String getPassword(String email) {
		return accounts.get(email);
	}
	
}
