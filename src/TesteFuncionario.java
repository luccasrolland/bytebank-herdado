
//"""Feature test class."""

public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente lucas = new Gerente();
		lucas.setNome("Nico Steppat");
		lucas.setCpf("223355646-9");
		lucas.setSalario(2600.00);

		System.out.println(lucas.getNome());
		System.out.println(lucas.getBonificacao());
		
		//lucas.salario = 300.0;
		
	}

}
