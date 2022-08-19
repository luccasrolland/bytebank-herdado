//"""Class that receives the authenticable interface and acess to the internal system."""

public class Client implements Authenticable {

    private UsefulAuthentication authenticator;

    public  Client (){
        this.authenticator = new UsefulAuthentication();
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
}
    //"""Returns concrete method of authentication by the interface."""




