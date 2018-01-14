import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestProbny {
	int result = 20;

	@Test
	void ShouldBe20HaveElementsInGeneratorRandomList() {
		 ArrayList<Integer> numberList = new ArrayList<Integer>();
		 numberList.addAll(Generator.GenerateRandomNumberList());
		assertEquals(result, numberList.size());

	}
	
	@Test
	void ShouldBe20HaveElementsInGeneratorList() {
		 ArrayList<Integer> numberList = new ArrayList<Integer>();
		 numberList.addAll(Generator.GenerateNumberList());
		assertEquals(result, numberList.size());}

}