package homeWork2;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OwnerOfPetMapper {
	public static OwnerOfPet map(ResultSet result) throws SQLException {
		int id =result.getInt("id");
		String firstName=result.getString("first_name");
		String lastName=result.getString("last_name");
		int gender=result.getInt("gender_id");
		int age=result.getInt("gender_id");
		String adress=result.getString("adress");
		int kindOfPet=result.getInt("kind_of_pet_id");
		
		return new OwnerOfPet(id, firstName, lastName, gender, age, adress, kindOfPet);
	}
}
