package homeWork1;

import java.util.Set;
import java.util.TreeSet;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

public class ShedueTest {
	
	private Schedue schedule;
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
		Set<Seance> seances=new TreeSet<>();
		
	}

	@After
	public void afterTest() {
		schedule = null;
	}
	
	@Test
	public void addSeance(){
		Set<Seance> seances=new TreeSet<>(new ComparatorSchedue());
		Movie movie = new Movie("Terminator", new Time(1, 20));
		Seance seance=new Seance(movie, new Time(12, 30));
		seances.add(seance);
		String expectedName="Terminator";
		Assert.assertEquals(expectedName, seance.getMovie().getTitle());
	}
	
	@Test
	public void removeSeance(){
		Set<Seance> seances=new TreeSet<>(new ComparatorSchedue());
		Movie movie = new Movie("Terminator", new Time(1, 20));
		Seance seance=new Seance(movie, new Time(12, 30));
		seances.add(seance);
		seances.remove(seance);
		boolean real=seances.contains(seance);
		boolean expected=false;
		Assert.assertEquals(expected, real);
	}
	
	
}
