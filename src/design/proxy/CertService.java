package design.proxy;

public class CertService {

	public String apply(Long userId, String caType) {
		CaProvider provider = null;
		if (caType.equals("sheca")) {
			provider = new ShecaProvider();
		} else if (caType.equals("myca")) {
			provider = new MycaProvider();
		}
		return provider.issueCert(userId.toString());
	}

}
