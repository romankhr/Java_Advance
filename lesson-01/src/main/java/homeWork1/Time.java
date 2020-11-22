package homeWork1;

public class Time {
	private int min;
	private int hour;

	public Time(int hour, int min) {
		super();
		this.min = min;
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {

		this.min = min;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 24) {
			System.out.println("You have entered wrong number of hours!!!!");
			hour = 0;
		}
		this.hour = hour;
	}

	@Override
	public String toString() {
		return hour + ":" + min;
	}

}
