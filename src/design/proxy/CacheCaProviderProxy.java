package design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class CacheCaProviderProxy implements InvocationHandler {

	private Object target;

	private Map<String, Object> cache = new HashMap<>();

	public Object getInstance(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String p10 = (String)args[0];
		Object cacheVal = cache.get(p10);
		if (cacheVal != null) {
			System.out.println("使用了缓存");
			return cacheVal;
		}
		Object invoke = method.invoke(target, args);
		cache.put(p10, invoke);
		return invoke;
	}

}
