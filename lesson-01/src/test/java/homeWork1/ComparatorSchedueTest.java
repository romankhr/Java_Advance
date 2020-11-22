package homeWork1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

import ua.lviv.lgs.MyCalculator;

public class ComparatorSchedueTest {

	private ComparatorSchedue comparator;
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
		comparator = new ComparatorSchedue();
	}

	@After
	public void afterTest() {
		comparator = null;
	}
	
	@Test
	public void compare() {
		Seance seance1=new Seance(new Movie("Terminator", new Time(1, 30)),new Time(12, 30));
		Seance seance2=new Seance(new Movie("Terminator", new Time(1, 30)),new Time(15, 30));
		int realResult=comparator.compare(seance1, seance1);
		int expectedResult=0;
		Assert.assertEquals(expectedResult, realResult);
	}
	@Test
	public void compareWrong() {
		Seance seance1=new Seance(new Movie("Terminator", new Time(2, 30)),new Time(17, 30));
		Seance seance2=new Seance(new Movie("Terminator", new Time(1, 30)),new Time(15, 30));
		int realResult=comparator.compare(seance1, seance1);
		int expectedResult=0;
		Assert.assertEquals(expectedResult, realResult);
	}
}
