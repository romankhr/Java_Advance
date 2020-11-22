package homeWork1;

public class ComparatorOver {

	public int compare(Seance o1, Seance o2, Seance o3) {
		System.out.println("Comparator");
		if (o1.getEndTime().getHour() < o2.getStartTime().getHour()
				&& o2.getEndTime().getHour() < o3.getStartTime().getHour()) {
			return 1;
		} else if (o1.getEndTime().getHour() == o2.getStartTime().getHour()
				&& o1.getEndTime().getMin() < o2.getStartTime().getMin()
				&& o2.getEndTime().getHour() < o3.getStartTime().getHour()) {
			return 1;
		} else if (o1.getEndTime().getHour() == o2.getStartTime().getHour()
				&& o1.getEndTime().getMin() < o2.getStartTime().getMin()
				&& o2.getEndTime().getHour() == o3.getStartTime().getHour()
				&& o2.getEndTime().getMin() < o3.getStartTime().getMin()) {
			return 1;
		} else {
			
			return 0;
		}

	}

}
