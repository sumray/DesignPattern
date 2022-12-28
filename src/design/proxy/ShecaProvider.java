package design.proxy;

public class ShecaProvider implements CaProvider {

	@Override
	public String issueCert(String p10) {
		return p10 + "sheca";
	}

}
