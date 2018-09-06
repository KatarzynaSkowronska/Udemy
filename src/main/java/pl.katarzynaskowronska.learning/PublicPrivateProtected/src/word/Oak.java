package word;

public class Oak extends Plant{
	
	public Oak() {
		
		//Won't work - type is private
		//type = "tree";
		
		//This works - size is protected and Oak is subclass of Plant
		this.size = "large";
		
		//No access specifier, works because Oak and Plant in the same package
		this.height = 10;
	}

}
