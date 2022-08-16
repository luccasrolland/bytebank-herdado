//"""Class derived from the mother class."""

public class Gerente extends Funcionario {
	
	private int senha;

//"""Specific attribute."""

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do GERENTE");
		return super.getSalario();
		//""Specific bonus method."""
	}

	public void setSenha(int senha) {
		this.senha = senha;

//"""Specific method where only Manager has a password."""
	}

	public boolean autentica(int senha) {
		if(this.senha == senha){
			return true;
		} else {
			return false;
		}

//"""Method that checks password authenticity."""
	}

}
