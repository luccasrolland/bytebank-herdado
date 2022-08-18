//"""Classe que deriva de funcionario e implementa metodos da interface."""


public class Administrador extends Funcionario implements Autenticavel {

    private int senha;

    @Override
    public double getBonificacao() {
        return 50;
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