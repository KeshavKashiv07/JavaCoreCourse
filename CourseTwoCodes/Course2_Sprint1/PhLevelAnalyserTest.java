package Course2_Sprint1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class PhLevelAnalyserTest {

	PhLevelAnalyser obj;
    @Before
    public void setUp()  {
		obj=new PhLevelAnalyser();
    }

@Test
public void getPhValueOfWaterForInputPhSeven(){
	//arrange the data
	int phLevel =7;
	String exceptedResult = "pH value is fine";

	//act
    String actualResult = obj.getPhValueOfWater(phLevel);

   //assertion
   assertEquals(exceptedResult,actualResult);
}

@Test
public void getPhValueOfWaterForInputPhEight(){
	//arrange the data
	int phLevel =8;
	String exceptedResult2 = "pH value is fine";

	//act
    String actualResult2 = obj.getPhValueOfWater(phLevel);

   //assertion
   assertEquals(exceptedResult2,actualResult2);

}
@Test
public void getPhValueOfWaterForInputPhTen(){
	//arrange the data
	int phLevel =10;
	String exceptedResult3 = "pH value is high, partial water change required";

	//act
    String actualResult3 = obj.getPhValueOfWater(phLevel);

   //assertion
   assertEquals(exceptedResult3,actualResult3);

}
    @After
    public void tearDown()  {
		obj=null;
    }

}
