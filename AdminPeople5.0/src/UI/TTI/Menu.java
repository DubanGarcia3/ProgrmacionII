package UI.TTI;
import java.util.Scanner;

import exception.MenuInputException;


public class Menu {
	public static final String MESSAGE_SELECT_OPTION = "Dijite el numero de la opcion deseada";
	public static final String ERROR_OPTION = "El valor digitado no se encuentra dentro de las opciones, debe estar entre 1 y " ;
	private String[] option;
	private String title;
	public Menu(String title, String ... option){
		this.option = option;
		this.title = title;
	}
	
	/**
	 * muestra las opciones del menu
	 */
	public void showOption(){
		System.out.println(" ======   " + title + "=====");
		for (int i = 0; i < option.length; i++) {
			System.out.println((i+1) + " 	" + option[i]);
		}
		System.out.print(MESSAGE_SELECT_OPTION + " [1-"+option.length+"]: ");
	}
	
	/**
	 * 
	 * @return retorna la opcion seleccionada
	 */
	public byte getOption(){
		Scanner scannerKeyboard = new Scanner(System.in);
		int optionSelected;
		do{
			showOption();
			optionSelected = scannerKeyboard.nextInt();
			if (optionSelected < 1 || optionSelected > option.length) {
				System.out.println(ERROR_OPTION + option.length);
			}
		}while(optionSelected < 1 || optionSelected > option.length);
		return (byte) optionSelected;
	}
}