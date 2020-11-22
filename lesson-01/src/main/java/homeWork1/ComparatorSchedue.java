package homeWork1;

import java.util.Comparator;

public class ComparatorSchedue implements Comparator<Seance> {

	@Override
	public int compare(Seance o1, Seance o2) {
		if (o1.getStartTime().getHour() > o2.getStartTime().getHour()) {
			return 1;
		} else if (o1.getStartTime().getHour() < o2.getStartTime().getHour()) {
			return -1;
		} else if (o1.getStartTime().getMin() > o2.getStartTime().getMin()) {
			return 1;
		} else if (o1.getStartTime().getMin() < o2.getStartTime().getMin()) {
			return -1;
		}
		return 0;
	}

}
