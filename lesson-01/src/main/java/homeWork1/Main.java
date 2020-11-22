package homeWork1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choise;
		boolean flag = true;
		Cinema cinema = new Cinema();


		while (flag) {

			System.out.println(" \nOur cimema is opened 7 days in a week from 8:00 to 24:00");
			
			System.out.println("Enter 1 to ADD seance in a day");
			System.out.println("Enter 2 to show  seances of a day");
			System.out.println("Enter 3 to show all seances of a week");
			System.out.println("Enter 4 to remove seance");
			choise = scanner.nextInt();

			switch (choise) {
			
			case 1:
				cinema.addSeance();
				break;
			case 2:
				cinema.showSchedule();
				break;
			case 3:
				cinema.showAllSchedule();
				break;
			case 4:
				cinema.removeSchedule();
				break;
			default:
				flag = false;
				break;
			}

		}

	}
}