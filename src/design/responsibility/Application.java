package design.responsibility;

public class Application {
	
	public static void main(String[] args) {
		Server server = new Server();
		boolean r1 = server.registry("543576868", "123123");
		boolean r2 = server.registry("", "123");
		boolean r3 = server.registry("select", "123123");
		boolean r4 = server.registry("543576868", "1111111");
		boolean r5 = server.registry("973162637", "123123");

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);

		boolean rr1 = server.login("", "123");
		boolean rr2 = server.login("4564", "123");
		boolean rr3 = server.login("543576868", "123");
		boolean rr4 = server.login("543576868", "123123");

		System.out.println(rr1);
		System.out.println(rr2);
		System.out.println(rr3);
		System.out.println(rr4);
	}
	
}
