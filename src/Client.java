//"""Class that receives the authenticable interface and acess to the internal system."""

public class Client implements Authenticable {

    private int password;

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



