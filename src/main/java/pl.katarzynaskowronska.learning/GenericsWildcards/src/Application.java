import java.util.ArrayList;

class Machine {
	
	@Override
	public String toString() {
		return "I am a Machine";
	}
	
	public void start() {
		System.out.println("Machine starting.");
	}
}

class Camera extends Machine {
	@Override
	public String toString() {
		return "I am a Machine";
	}
	
	public void snap() {
		
	}
}



public class Application {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();

		list.add("one");
		list.add("two");
		
		ArrayList<Machine> list1 = new ArrayList<Machine>();

		list1.add(new Machine());
		list1.add(new Machine());
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();

		list2.add(new Camera());
		list2.add(new Camera());
		
		
		showList(list2);
	}
	
	
	//public static void showList(ArrayList<String> list){
		//Wildcard
	public static void showList(ArrayList<? > list){
	//+for this what extends class
	//public static void showList(ArrayList<? extends Machine> list){	
		//for(String value: list) {
		for(Object value: list) {
			System.out.println(value);
			//Not working because Java don't know which object it is
			//values.start();
		}
	}
		
		public static void showList2(ArrayList<? super Camera> list){
			for(Object value: list) {
				System.out.println(value);
			}
			}
		
	}


