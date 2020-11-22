package homeWork1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class Cinema {
	TreeMap<Days, Set<Seance>> schedules = new TreeMap<>();
	private ArrayList<Movie> moviesLibrary = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	Days[] day = Days.values();
	Schedue shedue = new Schedue();
	Seance seance = new Seance();
	Seance begin = new Seance(new Movie("", new Time(0, 0)), new Time(7, 59));
	Seance end = new Seance(new Movie("", new Time(0, 0)), new Time(24, 00));
	Set<Seance> seanceTree = new TreeSet<>(new ComparatorSchedue());

	Cinema() {
		for (int i = 0; i < day.length; i++) {
			schedules.put(day[i], getBoundaries());
		}
	}

	public void addSeance() {

		System.out.println(day[1]);
		System.out.println("����� ���� �����, �� ������� ������ �������");
		String nameOfDay = scanner.next();
		System.out.println("                 Create schedule for  " + nameOfDay);

		for (int i = 0; i < day.length; i++) {
			if (day[i].toString().equalsIgnoreCase(nameOfDay)) {
				Set<Seance> seanceTree = schedules.get(day[i]);
				seanceTree = shedue.addSeance(seanceTree);
				schedules.put(day[i], seanceTree);

			}
		}

	}

	private Set<Seance> getBoundaries() {
		Set<Seance> seanceTree = new TreeSet<>(new ComparatorSchedue());
		seanceTree.add(begin);
		Time beginEndTime = new Time(7, 59);
		begin.setEndTime(beginEndTime);
		seanceTree.add(end);
		Time endTime = new Time(24, 00);
		end.setEndTime(endTime);
		return seanceTree;
	}

	public void dddMovie(String movie, Time time) {
		moviesLibrary.add(new Movie(movie, time));
	}

	public void showSchedule() {

		System.out.println("����� ���� �����, �� ������� �������� �������");
		String nameOfDay1 = scanner.next();
		System.out.println("                 Schedule for  " + nameOfDay1);
		for (int i = 0; i < day.length; i++) {
			if (day[i].toString().equalsIgnoreCase(nameOfDay1)) {
				Set<Seance> seanceTree = schedules.get(day[i]);

				for (Seance seance : seanceTree) {
					if (seance.getStartTime().getHour() != 7 && seance.getStartTime().getHour() != 24) {
						System.out.println(seance.toString());
					}
				}
			}
		}
	}

	public void showAllSchedule() {

		for (int i = 0; i < day.length; i++) {
			System.out.println("                 Schedule for  " + day[i]);
			Set<Seance> seanceTree = schedules.get(day[i]);

			for (Seance seance : seanceTree) {
				if (seance.getStartTime().getHour() != 7 && seance.getStartTime().getHour() != 24) {
					System.out.println(seance.toString());
				}
			}
		}
	}

	public void removeSchedule() {

		System.out.println("Input the day of seance, you want to remove");
		String removeDay = scanner.next();
		System.out.println("Input the start hour of seance, you want to remove");
		int removeHour = scanner.nextInt();
		System.out.println("Input the start minutes of seance, you want to remove");
		int removeMin = scanner.nextInt();

		for (int i = 0; i < day.length; i++) {
			if (day[i].toString().equalsIgnoreCase(removeDay)) {
				Set<Seance> seanceTree = schedules.get(day[i]);
				Iterator<Seance> iterator = seanceTree.iterator();
				while (iterator.hasNext()) {
					if (iterator.next().getStartTime().getHour() == removeHour
							&& iterator.next().getStartTime().getMin() == removeMin) {
						seanceTree.remove(iterator);
					}
				}
			}
		}
	}
}
