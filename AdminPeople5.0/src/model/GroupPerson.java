package model;

import java.util.Arrays;

import exception.GenderException;
import exception.IDException;
import exception.NameException;

public class GroupPerson {
	
	private Person[] listPeople;
	
	public GroupPerson(){
		this.listPeople = new Person[0];
	}
	
	public GroupPerson(Person[] listPeople) {
		this.listPeople = listPeople;
	}

	public GroupPerson(GroupPerson newlistPeople){
		listPeople = newlistPeople.getList();
	}
	
	public void add(Person newPerson){
		Person [] auxList = new Person[this.listPeople.length+1];
		for (int i = 0; i < listPeople.length; i++) {
			auxList[i] = this.listPeople[i]; 
		}
		auxList[auxList.length -1] = newPerson;
		this.listPeople =auxList;
	}

	public void add2(Person[] listperson2) {
		Person[] auxList = listPeople;
		for (int i = listPeople.length; i < listperson2.length; i++) {
			if (!isFull(auxList)) {
				auxList[i] = listPeople[i];				
			}
		}
	}
	
	public void editperson(int id, Person person){
		for (int i = 0; i < listPeople.length; i++) {
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
	
	public void addPersonClass(GroupPerson people){
		Person[] PersonForAddAux = new Person[people.getList().length + listPeople.length];
		System.out.println("tamaño" + PersonForAddAux.length);
		int auxPos = 0;
			for (int j = 0; j < listPeople.length; j++) {
				if (PersonForAddAux[auxPos] == null && listPeople[j] != null) {
					PersonForAddAux[auxPos] = listPeople[j];
					auxPos++;
				}
			}
		for (int i = 0; i < people.getList().length; i++) {
			PersonForAddAux[auxPos] = people.getList()[i];
			auxPos++;
		}
		this.listPeople = PersonForAddAux;
		System.out.println("esta es la lista final");
		System.out.println(Arrays.toString(this.listPeople));
	}
	
	public boolean isFull(Person [] auxlist){
		for(int i=0; i < auxlist.length; i++){
			if(auxlist[i] == null)
				return false;	
		}
		return true;
	}	
	
	public void deletePerson(int id){
		for (int i = 0; i < listPeople.length; i++) {
			if (listPeople[i].getId() == id) {
				listPeople[i] = null;
			}
		}
	}
	
	public Person searchPerson(String name) throws NameException {
		for (int i = 0; i < listPeople.length; i++) {
			if (listPeople[i] != null) {
				if (listPeople[i].getName().equalsIgnoreCase(name)) {
					return listPeople[i];
				}
			}
		}
		throw new NameException();
	}
	
	public Person findPersonId(int id)throws IDException{
		for (int i = 0; i < listPeople.length; i++) {
			if (listPeople[i] != null) {
				if (listPeople[i].getId() == id) {
					return listPeople[i];
				}
			}
		}
		throw new IDException();
	}
	
	public Person[] findPeopleId(int id) throws IDException{
		Person [] auxList = new Person[listPeople.length] ;
		for (int i = 0; i < listPeople.length; i++) {
			if (listPeople[i] != null) {
				if (listPeople[i].getId() == id) {
					auxList[i] = listPeople[i];
					return auxList;
				}
			}
		}
		throw new IDException();
	}
	
	//people
	public Person[] findPerson(Gender gender) throws GenderException{
		Person [] auxList = new Person[listPeople.length] ;
		for (int i = 0; i < listPeople.length; i++) {
			if (listPeople[i] != null) {
				if (listPeople[i].getGender().equals(gender)) {
					auxList[i] = listPeople[i];
					return auxList;
				}
			}
		}
		throw new GenderException();
	}
	
	public Person findPerson(int minAge, int maxAge) throws NameException{
		Person [] auxList = new Person[listPeople.length] ;
		for (int i = 0; i < listPeople.length; i++) {
			if (listPeople[i] != null) {
				if (listPeople[i].calculateAge() >= minAge && listPeople[i].calculateAge() <= maxAge) {
					auxList[i] = listPeople[i];
					return auxList[i];
				}
			}
		}
		throw new NameException();
	}

	public Person[] getList() {
		return listPeople;
	}
	
	public void print(Person[]list){
		for(int i = 0; i < list.length; i++){
			if(	list[i] != null){
				System.out.println(list[i].toString());
			}
		}
	}
}