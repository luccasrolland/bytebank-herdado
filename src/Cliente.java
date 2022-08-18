//"""Classe que recebe a interface autenticavel e acesso ao sistema interno."""

public class Cliente implements Autenticavel {

    private int senha;

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



