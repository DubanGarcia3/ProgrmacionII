package model;

import java.awt.Image;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;

public class Person {
	
	private static int ID_STATIC = 0;
	protected int id;
	protected String name;
	protected String lastName;
	protected Gender gender;
	protected LocalDate birthDate;
	protected double value;
	protected String phone;
	protected Image photo;
	
	public Person(String name, String lastName, Gender gender, LocalDate birthDate, double value, String phone, Image photo) {
		this.id = ID_STATIC++;
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.value = value;
		this.phone = phone;
		this.photo = photo;
	}
	
	public Person(int id, String name, String lastName, Gender gender, LocalDate birthDate, double value, String phone, Image photo) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.value = value;
		this.phone = phone;
		this.photo = photo;
	}
	
	public Person(){
		
	}

	public int calculateAge() {
		LocalDate now = LocalDate.now();
		Period period = Period.between(getBirthDate(), now);
		return period.getYears();
	}
	
	public boolean validateName(String txt, String nameI) {
		String aux = "";
		for (int i = 0; i < nameI.length(); i++) {
			if (nameI.length() > txt.length()) {
				if (nameI.charAt(i) == txt.charAt(0)) {
					aux = nameI.substring(i, txt.length()+1);
					if (aux.equals(txt)) {
						return true;
					}
				}
			}else {
				System.out.println("la palabra buscada es mas grande que el listado de nombres");
			}
		}
		return false;
	}
	
	public boolean validateName2(String txt, String nameI) {
		if (nameI.length() > txt.length()) {
			int intIndex = txt.indexOf(nameI);
			if (intIndex == -1) {
				return true;
			}
		}
		return false;
	}
	
	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public double getValue() {
		return value;
	}

	public String getPhone() {
		return phone;
	}

	public Image getPhoto() {
		return photo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setPhoto(Image photo) {
		this.photo = photo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String personToString() {
		String formatLine = "%1$-10s %2$-20s %3$-20s %4$-20s %5$-20s %6$-25s %7$-20s %8$-20s";
		String personLine = String.format(formatLine,"ID " + id, "Nombre: " + name,
				"Apellido: " + lastName, "Genero: " + gender.toString(),"Fecha Nacimiento: "+ birthDate,
				"Valor $: " + value, "Telefono: "+ phone, "Foto: " + photo);
		return personLine;
	}	
	
	public void toPerson(String line){
		
	}
}