//"""Class derived from the mother class."""

public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do GERENTE");
		return super.getSalario();
		//""Specific bonus method."""
	}


	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	//"""Retorna metodo concreto de senha pela interface.""""

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	//"""Retorna metodo concreto de autenticacao pela interface."""
}
