public class UsefulAuthentication {

    private int password;

    public void setPassword(int password) {
        this.password = password;
    }
    //"""Returns concrete password method via interface.""""

    public boolean authenticate(int password) {
        if(this.password == password) {
            return true;
        } else {
            return false;
        }
    }
    //"""Returns concrete method of authentication by the interface."""

}
