
class Person {

	// Instance variables (data or "state"
	String name;
	int age;

	// Classes can contain:
	// Data
	// Subroutines (methods)

	void speak() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
		}
	}
	
	void sayHello() {
		System.out.println("Hello there!");
	}

}

public class Application {

	public static void main(String[] args) {

		System.out.println("hello");
		System.out.println(" there");

		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;

		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;

		System.out.println(person1.name);

		person1.speak();
		person2.speak();
		person1.sayHello();

	}

}
