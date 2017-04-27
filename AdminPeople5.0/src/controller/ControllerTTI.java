package controller;

import java.util.InputMismatchException;

import UI.TTI.Constans;
import UI.TTI.InputPerson;
import UI.TTI.Menu;
import exception.DateFormatException;
import exception.GenderException;
import exception.IDException;
import exception.MenuInputException;
import exception.NameException;
import model.GroupPerson;
import model.Person;

public class ControllerTTI { 
	
	private GroupPerson	groupPerson;
	private InputPerson inputPerson;
	private Menu menu;
	
	public ControllerTTI() {
		//cargar es leer el archivo y pasarlo a memoria
		// dump ---> vaciado ---> descarga
		// load --> restore ---> 
		groupPerson = new GroupPerson();
		inputPerson = new InputPerson();
		menu = new Menu("Administrador de personas","Agregar persona","Eliminar persona","Buscar persona","Editar" ,"Listar personas", "Salvar", "Cargar","Salir");
		try {
			manageOption();
		} catch (MenuInputException e) {
			System.out.println();
		}
	}
	
	public void manageOption(){
		int option =0;
		do {
			option = menu.getOption();
			switch (option) {
			case 1:
				manageAdd();
				break;
			case 2:
				managedelete();
				break;
			case 3:
				manageSearch();
				//menu.showOption();
				break;
			case 4:
				manageEdit();
				break;
			case 5:
				manageShowList();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				break;
			}
		} while (option!= 6);
	}

	private void manageShowList() {
		groupPerson.print(groupPerson.getList());
	}

	private void manageEdit() {
		try {
			groupPerson.editperson(groupPerson.findPersonId(inputPerson.inputId()).getId() , new Person(inputPerson.inputId(), 
					inputPerson.captureText(Constans.NAME_IN), inputPerson.captureText(Constans.LASTNAME_IN), inputPerson.captureGender(),
					inputPerson.captureBirthDay(), inputPerson.captureValue(inputPerson.captureText(Constans.VALUE)), inputPerson.captureText(Constans.PHONE_IN), null));
		} catch (IDException e) {
			System.out.println(e);
		}
	}

	private void managedelete() {
		try {
			groupPerson.deletePerson(groupPerson.findPersonId(inputPerson.inputId()).getId());
		} catch (IDException e) {
			System.out.println(e);
		}
	}

	private void manageSearch() {
		try {
			groupPerson.print(groupPerson.findPeopleId(inputPerson.inputId()));
		} catch (IDException e) {
			System.out.println(e);
		}
	}

	private void manageAdd() {
		groupPerson.add(new Person(inputPerson.inputId(), inputPerson.captureText(Constans.NAME_IN), inputPerson.captureText(Constans.LASTNAME_IN),
				inputPerson.captureGender(), inputPerson.captureBirthDay(), inputPerson.captureValue(inputPerson.captureText(Constans.VALUE)), inputPerson.captureText(Constans.PHONE_IN), null));
		System.out.println("Persona agregada satisfactoriamente!!");
	}
}