package test;

import java.time.LocalDate;
import java.time.Month;

import model.Gender;
import model.Person;

public class TestPerson {
	
	public static void main(String[] args) {
		Person person = new Person(450, "Luisa", "Gutierrez", Gender.MALE, LocalDate.of(1998, Month.JULY, 23), 1354.56, "57 3134595801", null);
			person.calculateAge();
			System.out.println("Caso 1: " + (person.calculateAge()==18?"OK":"ERROR"));
			person.setBirthDate(LocalDate.of(1998, Month.FEBRUARY, 23));
			System.out.println("Caso 2: " + (person.calculateAge()==19?"OK":"ERROR"));
			person.setBirthDate(LocalDate.of(2018, Month.FEBRUARY, 20));
			System.out.println("Caso 3: " + (person.calculateAge()==0?"OK":"ERROR"));
			person.setBirthDate(LocalDate.of(2017, Month.FEBRUARY, 20));
			System.out.println("Caso 4: " + (person.calculateAge()==0?"OK":"ERROR"));
			person.setName("alvaro");
			System.out.println("Caso palabra 1: " + (person.validateName2("lv","alvaro") == true?"OK":"ERROR"));
			person.setName("juan");
			System.out.println("Caso palabra 2: " + (person.validateName2("juan","juan") == true?"OK":"ERROR"));
			System.out.println(LocalDate.now().getYear());
			System.out.println(LocalDate.now().getMonthValue());
			System.out.println(LocalDate.now().getDayOfMonth());
			System.out.println(Gender.values());
	}
}