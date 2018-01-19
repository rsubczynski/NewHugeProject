import org.junit.Test;

import java.util.ArrayList;


import static org.junit.Assert.assertEquals;

public class TestProbny {

    int result = 20;

    @Test
    public void ShouldBe20HaveElementsInGeneratorRandomList() {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.addAll(Generator.GenerateRandomNumberList());
        assertEquals(result, numberList.size());

    }

    @Test
    public void ShouldBe20HaveElementsInGeneratorList() {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.addAll(Generator.GenerateNumberList());
        assertEquals(result, numberList.size());}

}
