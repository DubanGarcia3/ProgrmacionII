package test;

import java.time.LocalDate;
import java.time.Month;

import exception.GenderException;
import model.Gender;
import model.GroupPerson;
import model.Person;

public class TestGroupPerson {
	
	public static void main(String[] args) {
		GroupPerson groupPerson1 = new GroupPerson();
		groupPerson1.add(new Person(450, "Luisa", "Gutierrez", Gender.MALE, LocalDate.of(1998, Month.JULY, 23), 1354.56, "57 3134595801", null));
		groupPerson1.add(new Person(56, "Brayan", "Espinosa", Gender.MALE, LocalDate.of(1996, Month.SEPTEMBER, 11), 650.000, "+57 311 303 22 55", null));
		groupPerson1.deletePerson(56);
		try {
			groupPerson1.findPerson(Gender.MALE);
			groupPerson1.print(groupPerson1.findPerson(Gender.MALE));			
		} catch (GenderException e) {
			System.out.println(e);
		}
		for (int i = 0; i < groupPerson1.getList().length ; i++) {
			if (groupPerson1.getList()[i] !=null) {
				System.out.println(groupPerson1.getList()[i].getId() + "	"+ groupPerson1.getList()[i].getName() + "	  "+groupPerson1.getList()[i].getLastName() + "	"+
				groupPerson1.getList()[i].getGender() +"		"+ groupPerson1.getList()[i].getValue()+ "		"+ groupPerson1.getList()[i].getPhone());
			}
		}
		GroupPerson groupPerson2 = new GroupPerson();
		groupPerson2.add(new Person(12, "Armando", "paredes", Gender.MALE, LocalDate.of(1965, Month.FEBRUARY, 2), 13540.235, "744 5772", null));
		for (int i = 0; i < groupPerson2.getList().length ; i++) {
			System.out.println(groupPerson2.getList()[i].getId() + "	"+ groupPerson2.getList()[i].getName() + "	  "+groupPerson2.getList()[i].getLastName() + "	"+
			groupPerson2.getList()[i].getGender() +"		"+ groupPerson2.getList()[i].getValue()+ "		"+ groupPerson2.getList()[i].getPhone());
		}
	}
}