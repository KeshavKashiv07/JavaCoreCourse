package Course2_Sprint1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class ReverseDigitTest {

	ReverseDigit obj;

    @Before
    public void setUp() {
     obj = new ReverseDigit();
    }

@Test
public void getInputPositivNumberReversTheDigit(){
	//arrange the data
	int number =123;
	int exceptedResult = 321;

	//act
    int actualResult = obj.getReverse(number);

   //assertion
   assertEquals(exceptedResult,actualResult);
}

@Test
public void getInputNegativeNumberReversTheDigit(){
	//arrange the data
	int number =-123;
	int exceptedResult = -321;

	//act
    int actualResult = obj.getReverse(number);

   //assertion
   assertEquals(exceptedResult,actualResult);
}



    @After
    public void tearDown() {
		obj=null;

    }


}
