
public class Application {

	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();

		Plant plant3 = plant1;
		Plant plant2 = tree;
		
		plant2.grow();
		
		tree.shedLeaves();
		
		doGrow(tree);
		//plant2.shedLeaves();
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}

}
