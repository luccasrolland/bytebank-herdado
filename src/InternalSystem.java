public class InternalSystem {

    private int password = 2222;

    public void authenticate(Authenticable fa) {
        boolean authenticated = fa.authenticate(this.password);
        if(authenticated) {
            System.out.println("Can enter the system!");
        } else {
            System.out.println("Cannot enter the system!");
        }
    }
}