//"""Class that derives from employee and implements methods of the interface."""


public class Administrator extends Employee implements Authenticable {

    private UsefulAuthentication authenticator;

    public Administrator () {
        this.authenticator = new UsefulAuthentication();
    }

    @Override
    public double getBonus() {
        return 50;
    }

    @Override
    public void setPassword(int password) {
        this.authenticator.setPassword(password);
    }
    //"""Returns concrete password method via interface.""""

    @Override
    public boolean authenticate(int password) {
        return this.authenticator.authenticate(password);
    }
    //"""Returns concrete method of authentication by the interface."""
}