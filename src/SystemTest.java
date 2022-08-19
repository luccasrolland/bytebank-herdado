public class SystemTest {

    public static void main(String[] args) {
        Manager g = new Manager();
        g.setPassword(2222);

        Administrator adm = new Administrator();
        adm.setPassword(3333);

        Client client = new Client();
        client.setPassword(2222);

        InternalSystem si = new InternalSystem();
        si.authenticate(g);
        si.authenticate(adm);
        si.authenticate(client);

    }
}