package word;

public class Field {

	private Plant plant = new Plant();
	
	
	//this work - size is protected, Field is in the same package as Plant
	public Field() {
		System.out.println(plant.size);
	}
}
