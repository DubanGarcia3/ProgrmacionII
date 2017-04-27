package persistance;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import model.Gender;
import model.GroupPerson;
import model.People;
import model.Person;

public class Persistence {
	/**
	 * @author Brayan
	 */
	
	/**
	 * Este metodo se utiliza para leer un archivo
	 * @return retorna un array de personas
	 * @throws IOException
	 */
	public ArrayList<Person> readTheplane() throws IOException{
		ArrayList<Person> groupPerson = new ArrayList<>();
		File file = new File("src/data/theOther.txt");
		BufferedReader read = new BufferedReader(new FileReader(file));
		String line;
		String[] te;
		while ((line = read.readLine())!= null) {
			te = line.split(",");
			try {
				Person person = new Person(te[0], te[1], Gender.valueOf(te[2]),birth(te[3]), Double.parseDouble(te[4]), te[5], image(te[6]));
				person.setId(Integer.parseInt(te[7]));
				groupPerson.add(person);
			} catch (Exception e) {
				System.out.println("nooo");
			}
		}
		return groupPerson;
	}
	
	/**
	 * Este metodo transforma un array en un vector o arreglo
	 * @return retorna un vector de personas
	 * @throws IOException
	 */
	public Person[] toVector() throws IOException{
		Person[] people = new Person[readTheplane().size()];
		for (int i = 0; i < people.length; i++) {
			if (people[i] == null) {
				people[i] = readTheplane().get(i);
			}
		}
		return people;
	}
	
	/**
	 * Este metodo toma un String para convertirlo a un localDate
	 * @param text el String a tranformar
	 * @return retorna un localDate dependiendo del texto 
	 */
	private LocalDate birth(String text) {
		String[] birthDay = text.split("-");
		return LocalDate.of(Integer.parseInt(birthDay[0]), Integer.parseInt(birthDay[1]), Integer.parseInt(birthDay[2]));
	}

	private Image image(String string) {
		
		return null;
	}

	/**
	 * Este metodo se utiliza para escribir un archivo plano
	 * @param groupPerson un arreglo de personas las cuales seran necesarias para escribir en el archivo
	 * @throws IOException
	 */
	public void writePlane(Person[] groupPerson) throws IOException{
		File file = new File("src/data/theOther.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			for (int i = 0; i < groupPerson.length; i++) {
					bw.write(groupPerson[i].getName()+ "," + groupPerson[i].getLastName()+ ","+ groupPerson[i].getGender()+","+groupPerson[i].getBirthDate()+","+groupPerson[i].getValue()+","+groupPerson[i].getPhone()+","+groupPerson[i].getPhoto()+","+groupPerson[i].getId());
					bw.newLine();
			}
		bw.close();
	}
}