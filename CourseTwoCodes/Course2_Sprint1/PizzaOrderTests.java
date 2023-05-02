package Course2_Sprint1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*; 



public class PizzaOrderTests {
    PizzaOrder obj;
    @Before
    public void setUp(){
        //Initialize the object of class PizzaOrder
        obj = new PizzaOrder();
    }

    // Write th logic inside the test case methods

@Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceSuccess(){

	//arrange the data
	int noOfPizza =1;
	float priceOfPizza = 9.99f;
	float exceptedResult = 9.99f;

	//act
    float actualResult = obj.calculatePriceOfPizza(noOfPizza , priceOfPizza);

   //assertion
   assertEquals(exceptedResult,actualResult,0.00);
   }


@Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceSuccess(){
	//arrange the data
	int noOfGarlicBread =1;
	float priceOfGarlicBread = 5.99f;
	float exceptedResult = 5.99f;

	//act
    float actualResult = obj.calculatePriceOfGarlicBread(noOfGarlicBread , priceOfGarlicBread);

   //assertion
   assertEquals(exceptedResult,actualResult ,0.00);
   }


@Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceSuccess(){
	//arrange the data
    int noOfBeverages =1;
	float priceOfBeverages = 1.99f;
	float exceptedResult = 1.99f;

	//act
    float actualResult = obj.calculatePriceOfBeverage(noOfBeverages , priceOfBeverages);

    //assertion
    assertEquals(exceptedResult,actualResult ,0.00);
    }



@Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceFailure(){
    //arrange the data
	int noOfPizza =1;
	float priceOfPizza = 9.99f;
	float unexceptedResult = 34.99f;

	//act
    float actualResult = obj.calculatePriceOfPizza(noOfPizza , priceOfPizza);

   //assertion
   assertNotEquals(unexceptedResult,actualResult,0.00);
    }


@Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceFailure(){
    //arrange the data
	int noOfGarlicBread =1;
	float priceOfGarlicBread = 5.99f;
	float unexceptedResult = 56.99f;

	//act
    float actualResult = obj.calculatePriceOfGarlicBread(noOfGarlicBread , priceOfGarlicBread);

    //assertion
    assertNotEquals(unexceptedResult,actualResult ,0.00);
    }



@Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceFailure(){
    //arrange the data
    int noOfBeverages =1;
	float priceOfBeverages = 1.99f;
	float unexceptedResult = 12.99f;

	//act
    float actualResult = obj.calculatePriceOfBeverage(noOfBeverages , priceOfBeverages);

    //assertion
    assertNotEquals(unexceptedResult,actualResult ,0.00);
    }


@Test
    public void givenSizeofPizzaReturnPrice(){
    //arrange the data
	int size =1;
	float exceptedPriceOfPizza = 9.99f;

	//act
	float actualResult = obj.getPriceOfPizzaBasedOnSize(size);

	//assertion
	assertEquals(exceptedPriceOfPizza,actualResult,0.00);
	}



@Test
    public void givenPriceOfItemsCalculateTotalBillAmount(){
    //arrange the data
	float totalPizzaPrice = 56.00f;
	float totalGarlicBreadPrice = 45.00f;
	float totalBeveragePrice = 30.00f;
	float exceptedResult = 131.00f;

	//act 
	float actualResult = obj.calculateTotalBill(totalPizzaPrice , totalGarlicBreadPrice , totalBeveragePrice);

	//assertios
	assertEquals(exceptedResult,actualResult,0.00);
    }



@Test
    public void givenTotalBillAmountGreaterThan50CalculateDiscount(){
    //arrange the data
	float totalBillAmount = 50.00f;
	float exceptedResult = 45.00f;

	//act 
	float actualResult = obj.calculateDiscountAndReturnBillAmount(totalBillAmount);

	//assertios
	assertEquals(exceptedResult,actualResult,0.00);
    }


@Test
    public void givenTotalBillLessThan50AmountCalculateDiscount(){
    //arrange the data
	float totalBillAmount = 48.00f;
	float exceptedResult = 48.00f;

	//act 
	float actualResult = obj.calculateDiscountAndReturnBillAmount(totalBillAmount);

	//assertios
	assertEquals(exceptedResult,actualResult,0.00);
    }


  @After
    public void tearDown(){
        // Assign object of PizzaOrder to null
        obj = null;
    }

}
