package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class JournalRegister {

	private List<Journals> listOfJournals = new ArrayList<>();
	
	public JournalRegister() {
		listOfJournals.add(new Journals("Travel","Promin", 2020,3));
		listOfJournals.add(new Journals("Nature","Pravda", 2020,5));
		listOfJournals.add(new Journals("People","Freedom", 2021,3));
	}
	
	public void newJournal(Journals journal) {
		listOfJournals.add(journal);
	}
	
	public List<Journals> getListOfJournals() {

		return this.listOfJournals;
	}
}
