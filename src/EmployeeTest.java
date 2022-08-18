
//"""Feature test class."""

public class EmployeeTest {

	public static void main(String[] args) {

		Manager lucas = new Manager();
		lucas.setName("Lucas Roland");
		lucas.setCpf("223355646-9");
		lucas.setWage(2600.00);

		System.out.println(lucas.getName());
		System.out.println(lucas.getBonus());
		
		//lucas.salario = 300.0;
		
	}

}
