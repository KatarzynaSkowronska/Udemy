import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		//String fileName = "C:\\Users\\czajk\\Desktop\\example.txt";
		String fileName = "example.txt";

		File textFile = new File(fileName);

//		try {
//			Scanner in = new Scanner(textFile);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Scanner in = new Scanner(textFile);
		
		//int value = int.nextInt();
		//System.out.println("Read value: " + value);

		in.nextLine();
		
		int count = 2;
		while (in.hasNextLine()) {
			String line = in.nextLine();

			
			//System.out.println(line);
			System.out.println(count + ": " + line);
			count++;
		}

		in.close();
	}

}
