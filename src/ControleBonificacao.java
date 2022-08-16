//"""Bonus controller class."""
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	//"""implementing bonus controller method."""
	}
	
	public double getSoma() {
		return soma;
	}

}
