package homeWork1;

	import org.junit.After;
	import org.junit.Assert;
	import org.junit.Before;
	import org.junit.Rule;
	import org.junit.Test;
	import org.junit.rules.TestWatcher;

	public class MovieTest {
		private Movie movie;
		private String title;

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
			movie = new Movie("Terminator", new Time(10, 30));
		}

		@After
		public void afterTest() {
			movie = null;
		}
		
		@Test
		public void getTitle() {
			String titleReal=movie.getTitle();
			String titleExpected="Terminator";
			Assert.assertEquals(titleExpected, titleReal);
		}
		
		@Test
		public void setTitle() {
			movie.setTitle("Summer");
			String titleExpected="Summer";
			Assert.assertEquals(titleExpected, movie.getTitle());
		}
		
		@Test
		public void getDurationHour() {
			int getDurationHour=movie.getDuration().getHour();
			int expectedDurationHour=10;
			Assert.assertEquals(expectedDurationHour, getDurationHour);
		}
	
		@Test
		public void getDurationMin() {
			int getDurationMin=movie.getDuration().getMin();
			int expectedDurationMin=30;
			Assert.assertEquals(expectedDurationMin, getDurationMin);
		}
	
}
