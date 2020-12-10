package ua.lviv.lgs;

public class Journals {
	private String name;
	private String publication;
	private int year;
	private int month;
	public Journals(String name, String publication, int year, int month) {
		super();
		this.name = name;
		this.publication = publication;
		this.year = year;
		this.month = month;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	@Override
	public String toString() {
		return "Journals [name=" + name + ", publication=" + publication + ", year=" + year + ", month=" + month + "]";
	}
	

}
