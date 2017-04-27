package UI.TTI;

import java.time.LocalDate;
import java.util.Scanner;
import exception.DateFormatException;
import exception.GenderException;
import exception.MenuInputException;

import java.time.Month;
import model.Gender;

public class InputPerson {

	public InputPerson() {
	}

	public int inputId() {
		System.out.println(Constans.INPUT_ID);
		Scanner scannerKeyboard = new Scanner(System.in);
		return scannerKeyboard.nextInt();
	}

	public String captureText(String text) {
		System.out.println(text);
		Scanner scannerKeyboard = new Scanner(System.in);
		return scannerKeyboard.nextLine();
	}

	public Gender captureGender() {
		Menu menuGender = new Menu(Constans.CAPTURE_GENDER, Gender.getGenderString());
		return Gender.values()[menuGender.getOption() - 1];
	}

	public int getInteger(String label, int min, int max) {
		int value;
		do {
			System.out.println(label);
			Scanner scannerKeyboard1 = new Scanner(System.in);
			value = scannerKeyboard1.nextInt();
			if (value < min || value > max) {
				System.out.println(Constans.OUT_RANK + Constans.DIGIT + min + "-" + max);
			}
		} while (value < min || value > max);
		return value;
	}

	public LocalDate captureBirthDay() {
		return LocalDate.of(getInteger(Constans.YEAR, 0, LocalDate.now().getYear()), getInteger(Constans.MONTH, 1, 12), getInteger(Constans.DAY, 1, 31));
	}

	public double captureValue(String value) {
		double aux = 0;
		if (value.contains(",")) {
			return aux = Double.parseDouble(value.replaceAll(",", "."));
		}else if (value.contains(".")) {
			return aux = Double.parseDouble(value);
		}
		return aux;
//		System.out.println(Constans.VALUE);
//		Scanner scannerKeyboard = new Scanner(System.in);
//		return scannerKeyboard.nextDouble();
	}
}