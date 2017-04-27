package test;

import java.time.LocalDate;

import javax.swing.ImageIcon;

import model.Gender;
import model.Person;

public class TestIDontKnow {

	public static void main(String[] args) {
		Person p = new Person("H", "H", Gender.MALE, LocalDate.of(1998, 8, 23), 10, "SSAD", new ImageIcon("C:/Users/ASUS/Downloads/AdminPeople5.0/src/img/add-user.png").getImage());
		System.out.println(p.personToString());
	}
}