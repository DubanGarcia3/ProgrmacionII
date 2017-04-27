package persistance;

import model.Person;

public class PersonTextFile extends Person{
	
	public PersonTextFile(){
		super();
	}
	
	public String personToString() {
		//separador por comas, HACERLO
		String formatLine = "%1$-10s %2$-20s %3$-20s %4$-20s %5$-20s %6$-25s %7$-20s %8$-20s";
		String personLine = String.format(formatLine,"ID " + this.id, "Nombre: " + this.name,
				"Apellido: " + this.lastName, "Genero: " + this.gender.toString(),"Fecha Nacimiento: "+ this.birthDate,
				"Valor $: " + this.value, "Telefono: "+ this.phone, "Foto: " + this.photo);
		return personLine;
	}
	
	@Override
	public String toString() {
		return "PersonTextFile [id=" + id + ", name=" + name + ", lastName=" + lastName + ", gender=" + gender
				+ ", birthDate=" + birthDate + ", value=" + value + ", phone=" + phone + ", photo=" + photo + "]";
	}

	public void toPerson(String line){
	}

}
