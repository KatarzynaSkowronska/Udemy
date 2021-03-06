
class Robot {
	public void speak() {
		System.out.println("Hello");
	}
	
	public void speak(String text) {
		// System.out.println("Hello");
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " meters in direction " + direction);
	}
}

public class Application {

	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak();
		sam.speak("Hi I'm Sam");
		sam.jump(7);
		sam.move("West", 12.2);
		
		String greeting = "Hello there";
		sam.speak(greeting);
		
		int value = 14;
		sam.jump(value);
	}

}
