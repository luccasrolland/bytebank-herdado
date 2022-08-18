public class ManagerTest {
	public static void main(String[] args) {

		Authenticable referencia = new Client();

		Manager g1 = new Manager();
		g1.setName("Marco");
		g1.setCpf("235568413");
		g1.setWage(5000.0);

		System.out.println(g1.getName());
		System.out.println(g1.getCpf());
		System.out.println(g1.getWage());

		g1.setPassword(2222);
		boolean authenticated = g1.authenticate(2222);

		System.out.println(authenticated);

		System.out.println(g1.getBonus());

	}

}

