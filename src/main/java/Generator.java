import java.util.ArrayList;
import java.util.Random;

public class Generator  {
	
	public static ArrayList<Integer> GenerateRandomNumberList() {
	Random randomGenerator = new Random();
	ArrayList<Integer> numberList = new ArrayList();
	for(int i = 0 ;i<20 ;i++) 
	{
		numberList.add(randomGenerator.nextInt(100));
	}
	return numberList;
	}
	
	public static ArrayList<Integer> GenerateNumberList() {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for(int i =0 ; i<20 ; i++) {
			numberList.add(i);
		}
		return numberList;
	}
	
}
