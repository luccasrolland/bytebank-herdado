
public class ReferenceTest {

	public static void main(String[] args) {
		
		Manager g1 = new Manager();
		g1.setName("Marcos");
		g1.setWage(5000.0);
	
		VideoEditor ev = new VideoEditor();
		ev.setWage(2500.0);
		
		Designer d = new Designer();
		d.setWage(2000.0);
		
		BonusControl control = new BonusControl();
		control.register(g1);
		control.register(ev);
		control.register(d);
		
		System.out.println(control.getSoma());
		
	}

}
