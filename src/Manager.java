//"""Class derived from the mother class."""

public class Manager extends Employee implements Authenticable {

	private UsefulAuthentication authenticator;

	public Manager () {
		this.authenticator = new UsefulAuthentication();
	}

	public double getBonus() {
		System.out.println("Calling Manager's bonus method");
		return super.getWage();
		//""Specific bonus method."""
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
