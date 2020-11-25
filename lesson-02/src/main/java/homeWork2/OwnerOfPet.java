package homeWork2;

public class OwnerOfPet {
	private int id;
	private String firstName;
	private String lastName;
	private int gender;
	private int age;
	private String adress;
	private int kindOfPet;
	public OwnerOfPet(int id, String firstName, String lastName, int gender, int age, String adress, int kindOfPet) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.adress = adress;
		this.kindOfPet = kindOfPet;
	}
	public OwnerOfPet(String firstName, String lastName, int gender, int age, String adress, int kindOfPet) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.adress = adress;
		this.kindOfPet = kindOfPet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getKindOfPet() {
		return kindOfPet;
	}
	public void setKindOfPet(int kindOfPet) {
		this.kindOfPet = kindOfPet;
	}
	@Override
	public String toString() {
		return "OwnerOfPet [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", age=" + age + ", adress=" + adress + ", kindOfPet=" + kindOfPet + "]";
	}
	
	
	
}
