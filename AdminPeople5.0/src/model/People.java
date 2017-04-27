package model;

import java.awt.Image;
import java.time.LocalDate;
import java.util.ArrayList;

public class People {
	
	private int i;
	
	private Person[] listPeople;
	public static final int LENGTH =1;

	public People() {
		i=0;
		listPeople = new Person[LENGTH];
	}
	
	public boolean isFull(){
		for(int i=0; i < LENGTH; i++){
			if(listPeople[i] == null)
				return false;	
		}
		return true;
	}	
	
	public void addPerson(Person person){
		if (!isFull()) {
			 listPeople[i] = person;
			 i++;
		}
	}
	
	public Person searchPerson(int id){
		if (listPeople[i].getId()== id) {
			return listPeople[i];
		}
		return null;
	}
	
	public void deletePerson(Person person){
		if (listPeople[i].equals(person)) {
			listPeople[i] =null;
		}
	}
	
	public void editperson(int id, Person person){
		if (listPeople[i].getId() == id) {
			listPeople[i].setName(person.getName());
			listPeople[i].setLastName(person.getLastName());
			listPeople[i].setGender(person.getGender());
			listPeople[i].setBirthDate(person.getBirthDate());
			listPeople[i].setPhone(person.getPhone());
			listPeople[i].setPhoto(person.getPhoto());
			listPeople[i].setValue(person.getValue());
		}
	}
}