package design.proxy;

public class MycaProvider implements CaProvider {

	@Override
	public String issueCert(String p10) {
		return p10 + "myca";
	}

}
