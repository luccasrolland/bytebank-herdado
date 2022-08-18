//"""Interface where it contains abstract methods to be implemented."""

public abstract interface Authenticable {


    public abstract void setPassword(int password);

    public abstract boolean authenticate(int password);
}