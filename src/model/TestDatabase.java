package model;

import java.sql.SQLException;

public class TestDatabase {

	public static void main(String[] args) {
		System.out.println("Running database test");

		Database db = new Database();
		try {
			db.connect();
		} catch (Exception e) {
			e.printStackTrace();
		}

		db.addPerson(new Person("Joe", "Lion Tamer", AgeCategory.adult, EmploymentCategory.employed, "777", true,
				Gender.male));
		db.addPerson(new Person("Sue", "Artist", AgeCategory.senior, EmploymentCategory.selfEmployed, null, false,
				Gender.female));

		try {
			db.save();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			db.load();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		db.disconnect();

	}

}
