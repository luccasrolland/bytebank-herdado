//"""Bonus controller class."""
public class BonusControl {
	
	private double sum;
	
	public void register(Employee f) {
		double bonus = f.getBonus();
		this.sum = this.sum + bonus;
	//"""implementing bonus controller method."""
	}
	
	public double getSoma() {
		return sum;
	}

}
