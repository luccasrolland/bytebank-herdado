//"""Class derived from the mother class."""

public class Manager extends Employee implements Authenticable {

	private int password;

	public double getBonus() {
		System.out.println("Calling Manager's bonus method");
		return super.getWage();
		//""Specific bonus method."""
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
