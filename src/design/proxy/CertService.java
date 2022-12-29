package design.proxy;

public class CertService {

	private final CacheCaProviderProxy proxy = new CacheCaProviderProxy();

	public String apply(Long userId, String caType) {
		CaProvider provider = null;
		if (caType.equals("sheca")) {
			provider = new ShecaProvider();
		} else if (caType.equals("myca")) {
			provider = new MycaProvider();
		} else {
			throw new RuntimeException("error");
		}
		CaProvider instance = (CaProvider)proxy.getInstance(provider);
		return instance.issueCert(userId.toString());
	}

}
