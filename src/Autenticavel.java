//"""Interface aonde contém metodos abstratos para serem implementados."""

public abstract interface Autenticavel {


    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}