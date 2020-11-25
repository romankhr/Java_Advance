package homeWork2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class ApplicationPetsOwner {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		OwnerOfPetDAO ownerDAO = new OwnerOfPetDAO(ConnectionDB.openConnection());
		ownerDAO.readAll().forEach(System.out::println);

		System.out.println("*******************************************************************\n ");

		List<OwnerOfPet> owner = new ArrayList<>();
		owner.add(new OwnerOfPet("Roman", "Lesiv", 1, 25, "Dbnvn lkkjl jkjh jgh jg ljli", 1));
		owner.add(new OwnerOfPet("Olga", "Ologa", 2, 20, "Ohghg jjhj jkjh jgh jg ljli", 1));

//	owner.forEach(ownerOfPets -> {
//		try {
//			ownerDAO.insert(ownerOfPets);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	});
	// READ_ALL
	ownerDAO.readAll().forEach(System.out::println);

		System.out.println("*******************************************************************\n ");

		// READ-by-ID
		OwnerOfPet ownerFromBD = ownerDAO.read(3);
		System.out.println(ownerFromBD);

		// UPDATE_BY_ID

		ownerFromBD.setLastName("Dodic");
		ownerDAO.update(ownerFromBD);
		ownerFromBD = ownerDAO.read(3);
		System.out.println(ownerFromBD);
		System.out.println("*******************************************************************\n ");
		// DELETE
		ownerDAO.delete(1);
		ownerDAO = new OwnerOfPetDAO(ConnectionDB.openConnection());
		ownerDAO.readAll().forEach(System.out::println);

	}
}
