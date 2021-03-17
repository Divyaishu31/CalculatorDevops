package calculator;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {

		private App calculator;

	    @Before
	    public void setUp() {
	        calculator = new App();
	    }

		@Test
	    public void testSqeroot() {
	        double a = 16.0;

	        double expectedResult = 4.0;
	        double result = calculator.Sqeroot(a);
	        Assert.assertEquals(expectedResult, result, 0);
	    }

		@Test
		public void testFact() {
			long a = 5;

	        long expectedResult = 120;
	        double result = calculator.Fact(a);
	        Assert.assertEquals(expectedResult, result, 0);
		}

		@Test
	public void testfac3(){
		long a = -3.0;
		long expectedResult = NaN;
		long result = calculator.fac(a);
		Assert.assertEquals(expectedResult, result,0);
	}

	@Test
	public void testLoge() {
		double a = 1;

		double expectedResult = 0.0;
		double result = calculator.Loge(a);
		Assert.assertEquals(expectedResult, result, 0.0001);
	}


		@Test
	public void testloge2(){
		double a = 0.0;
		double expectedResult = Double.NEGATIVE_INFINITY;
		double result = calculator.log(a);
		Assert.assertEquals(expectedResult, result,0);


	}

		@Test
		public void testPowe() {
			double a = 7;
	        double b = 3;
	        double expectedResult = 343;
	        double result = calculator.Powe(a, b);
	        Assert.assertEquals(expectedResult, result, 0);
		}
}
