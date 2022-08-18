//"""Class that derives from employee and implements methods of the interface."""


public class Administrator extends Employee implements Authenticable {

    private int password;

    @Override
    public double getBonus() {
        return 50;
    }

    @Override
    public void setPassword(int password) {
        this.password = password;
    }
    //"""Returns concrete password method via interface.""""

    @Override
    public boolean authenticate(int password) {
        if(this.password == password) {
            return true;
        } else {
            return false;
        }
    }
    //"""Returns concrete method of authentication by the interface."""
}