package test;

import UI.TTI.Menu;
import exception.MenuInputException;

public class TestMenu {
	
	public static void main(String[] args) {
		
		Menu menu = new Menu("Administrador de personas","Agregar persona","Eliminar persona","Buscar persona","Editar" ,"Listar personas","Salir");
		System.out.println("La elecci�n fue: " + menu.getOption());
	}
}
