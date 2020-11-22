package homeWork1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;


public class CinemaTest {
	private Cinema cinema;
	
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
		cinema = new Cinema();
	}

	@After
	public void afterTest() {
		cinema = null;
	}
	
	@Test
	public void addSeance() {
		Days[] day= Days.values();
		String realDay=day[1].toString();
		String expectedDay="Tuesday";
		Assert.assertEquals(expectedDay, realDay);
	}
	
	
	
}
