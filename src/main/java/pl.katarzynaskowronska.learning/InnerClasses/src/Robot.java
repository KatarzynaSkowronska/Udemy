
public class Robot {

	private int id;
	
	private /*public*/ class Brain{
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}
	
	public static class Battery {
		public void charge() {
			System.out.println("Battery charging...");
		}
	}

	public Robot(int id) {
		super();
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot " + id);
		
		Brain brain = new Brain();
		brain.think();
		
		final String name = "Robot";
		
		class Temp{
			public void doSth() {
				System.out.println("ID is: " + id);
				System.out.println("My name is " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSth();
	}
}
