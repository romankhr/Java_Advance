package homeWork2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class OwnerOfPetDAO {
	private static String READ_ALL = "select * from owner_of_pet";
	private static String CREATE = "insert into owner_of_pet(first_name, last_name, gender_id, age, adress, kind_of_pet_id) values (?,?,?,?,?,?)";
	private static String READ_BY_ID = "select * from owner_of_pet where id=?";
	private static String UPDATE_BY_ID = "update owner_of_pet set first_name=?,last_name=? where id = ?";
	private static String DELETE_BY_ID = "delete from owner_of_pet where id=?";
	
	private Connection connection;
	private PreparedStatement preparedStatement;

	public  OwnerOfPetDAO(Connection connection) {
		this.connection = connection;
	}

	public void insert(OwnerOfPet ownerOfPet) throws SQLException {
		preparedStatement = connection.prepareStatement(CREATE);
		preparedStatement.setString(1, ownerOfPet.getFirstName());
		preparedStatement.setString(2, ownerOfPet.getLastName());
		preparedStatement.setInt(3, ownerOfPet.getGender());
		preparedStatement.setInt(4, ownerOfPet.getAge());
		preparedStatement.setString(5, ownerOfPet.getAdress());
		preparedStatement.setInt(6,ownerOfPet.getKindOfPet());
		preparedStatement.executeUpdate();

	}

	public OwnerOfPet read(int id) throws SQLException {
		preparedStatement = connection.prepareStatement(READ_BY_ID);
		preparedStatement.setInt(1, id);
		ResultSet result = preparedStatement.executeQuery();
		result.next();
		return OwnerOfPetMapper.map(result);

	}

	public void update(OwnerOfPet ownerOfPet) throws SQLException {
		preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
		preparedStatement.setString(1, ownerOfPet.getFirstName());
		preparedStatement.setString(2, ownerOfPet.getLastName());
		preparedStatement.setInt(3, ownerOfPet.getId());
		preparedStatement.executeUpdate();
	}

	public void delete(int id) throws SQLException {
		preparedStatement = connection.prepareStatement(DELETE_BY_ID);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
	}

	public List<OwnerOfPet> readAll() throws SQLException {
		List<OwnerOfPet> listOfOwner = new ArrayList<>();
		preparedStatement = connection.prepareStatement(READ_ALL);
		ResultSet result = preparedStatement.executeQuery();
		while (result.next()) {
			listOfOwner.add(OwnerOfPetMapper.map(result));
		}
		return listOfOwner;
	

	}


}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

