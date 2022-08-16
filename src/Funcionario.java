
//"""Abstract parent class and its attributes."""
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	public abstract double getBonificacao();

//"""Abstract method without a body."""
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;

	//"""Access methods for private attributes."""
	}
	
	
	

}
