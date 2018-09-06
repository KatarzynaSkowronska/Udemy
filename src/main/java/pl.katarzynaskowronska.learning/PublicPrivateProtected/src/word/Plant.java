package word;

public class Plant {

	// Bad practice
	public String name;

	// Acceptable practice as long as it is final
	public final static int ID = 8;
	
	private String type;
	
	protected String size;
	
	int height; //package level visibility

	public Plant() {
		name = "Freddy";
		
		type = "plant";
		size = "medium";
		height = 8;
	}

}
