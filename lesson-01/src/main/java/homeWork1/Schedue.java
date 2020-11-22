package homeWork1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Schedue {
	Set<Seance> seances;
	Scanner scanner = new Scanner(System.in);

	public Set<Seance> addSeance(Set<Seance> setSeances) {
		seances = new TreeSet<>(new ComparatorSchedue());
		seances.clear();
		scanner = new Scanner(System.in);
		String nameOfMovie = null;
		int startHour = 0;
		int startMin = 0;
		int durationHours = 0;
		int durationMinutes = 0;
		boolean flag = true;
		seances = setSeances;
		System.out.println("Input the name of Movie");
		nameOfMovie = scanner.nextLine();
		while (flag) {
			System.out.println("Input the start time : hour");
			startHour = scanner.nextInt();
			if (startHour < 8 || startHour > 24) {
				System.out.println("You have entered the wrong number of hours!!!! Please, enter once again");
			} else {
				flag = false;
			}
		}
		flag = true;

		while (flag) {
			System.out.println("Input the start time : min");
			startMin = scanner.nextInt();
			if (startMin < 0 || startMin > 60) {
				System.out.println("You have entered the wrong number of minutes!!!! Please, enter once again");
			} else {
				flag = false;
			}
		}
		flag = true;

		while (flag) {
			System.out.println("Input the movie duration hours");
			durationHours = scanner.nextInt();
			if (durationHours < 0 || durationHours > 24) {
				System.out.println("You have entered the wrong number of duration hours!!!! Please, enter once again");
			} else {
				flag = false;
			}
		}
		flag = true;
		while (flag) {
			System.out.println("Input the movie duration minutes");
			durationMinutes = scanner.nextInt();
			if (durationMinutes < 0 || durationMinutes > 60) {
				System.out
						.println("You have entered the wrong number of duration minutes!!!! Please, enter once again");
			} else {
				flag = false;
			}
		}
		Time time = new Time(startHour, startMin);
		Movie movie = new Movie(nameOfMovie, new Time(durationHours, durationMinutes));
		Seance ss = new Seance(movie, time);
		int stH = startHour + durationHours;
		int stM = startMin + durationMinutes;
		if (startMin + durationMinutes > 60) {
			stH++;
			stM = startMin + durationMinutes - 60;
		}
		if (stH > 24) {
			stH = stH - 24;
		}
		Time timeEnd = new Time(stH, stM);
		ss.setEndTime(timeEnd);
		ComparatorOver o = new ComparatorOver();
		Seance tempSeance = new Seance();
		boolean flag1 = false;
		boolean flag2 = true;

		for (Seance seance : seances) {

			if (flag1 && o.compare(tempSeance, ss, seance) == 1) {
				seances.add(ss);
				flag2 = false;
				break;

			} else {
				tempSeance = seance;
				flag1 = true;

			}
		}
		if (flag2) {
			System.out.println("This is the wrong seance. Please choose different time and duration!!");
		}
		return seances;
	}

	public void removeSeance() {
		int startHour;
		int startMinutes;
		Iterator<Seance> seanceIterator = seances.iterator();
		System.out.println("Input the start hour of the seance, you want to remove");
		startHour = scanner.nextInt();
		System.out.println("Input the start minutes of the seance, you want to remove");
		startMinutes = scanner.nextInt();
		while (seanceIterator.hasNext()) {
			Seance seance = seanceIterator.next();
			if (seance.getStartTime().getHour() == startHour && seance.getStartTime().getMin() == startMinutes) {
				seanceIterator.remove();
			}
		}
		System.out.println("The seance was successfully removed");
	}

	public void showSeances() {
		for (Seance seance : seances) {
			System.out.println(seance);
		}
	}
}
