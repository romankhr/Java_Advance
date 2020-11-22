package homeWork1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

public class TimeTest {

	private Time time;
	private Time timeExpected;

	@Rule
	public TestWatcher testWatcher = new TestWatcher() {
		protected void failed(Throwable e, org.junit.runner.Description description) {
			System.out.println("FAILED --->" + description.getMethodName());
		};

		protected void succeeded(org.junit.runner.Description description) {
			System.out.println("SUCCES --->" + description.getMethodName());
		};
	};

	@Before
	public void beforeTest() {
		time = new Time(10, 30);
	}

	@After
	public void afterTest() {
		time = null;
	}

	@Test
	public void getMin() {
		int realMin = time.getMin();
		int expectedMin = 30;
		Assert.assertEquals(realMin, expectedMin);
	}
	
	@Test
	public void getHour() {
		int realHour = time.getHour();
		int expectedHour = 10;
		Assert.assertEquals(realHour, expectedHour);
	}
	
	@Test
	public void setMin() {
		time.setMin(20);
		Assert.assertEquals(20, time.getMin());
	}
	
	@Test
	public void setHour() {
		time.setHour(20);
		Assert.assertEquals(20, time.getHour());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setHourWrong() {
		time.setHour(30);
		Assert.assertEquals(20, time.getHour());
	}
}
