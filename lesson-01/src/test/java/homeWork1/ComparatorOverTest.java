package homeWork1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

import homeWork1.ComparatorOver;
import homeWork1.Movie;
import homeWork1.Seance;
import homeWork1.Time;

public class ComparatorOverTest {
	
	
	private ComparatorOver comparator;
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
		comparator = new ComparatorOver();
	}

	@After
	public void afterTest() {
		comparator = null;
	}
	
	@Test
	public void compare() {
		Seance seance1=new Seance(new Movie("Terminator", new Time(1, 30)),new Time(10, 30));
		Seance seance2=new Seance(new Movie("Terminator", new Time(1, 30)),new Time(15, 30));
		Seance seance3=new Seance(new Movie("Terminator", new Time(1, 30)),new Time(18, 30));
		seance1.setEndTime(new Time(12, 00));
		seance2.setEndTime(new Time(17, 00));
		seance3.setEndTime(new Time(20, 00));
		int realResult=comparator.compare(seance1, seance2, seance3);
		int expectedResult=1;
		Assert.assertEquals(expectedResult, realResult);
	}
	
}
