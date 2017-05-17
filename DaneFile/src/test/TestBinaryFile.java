package test;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import controller.Controller;
import model.GroupPlace;
import persistence.BinaryFileManager;
import view.JPanelTableCity;

public class TestBinaryFile {
	
	public static void main(String[] args) {
		GroupPlace groupPlace = new GroupPlace();
		BinaryFileManager binaryFileManager = new BinaryFileManager("src/files/prueba.bin");
		Controller controller = new Controller();
		JFrame jFrame = new JFrame("ventana pruebas");
		JPanelTableCity jPanelTableCity = new JPanelTableCity();
		binaryFileManager.open("rw");
		binaryFileManager.save(controller.getArrayPlace());
		for (int i = 0; i < controller.getArrayPlace().size(); i++) {
			System.out.println(controller.getArrayPlace().get(i).getCityName());
			
		}
		jPanelTableCity.add2(controller.getArrayPlace());
		jFrame.add(jPanelTableCity);
		jFrame.setSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		jFrame.setVisible(true);
		binaryFileManager.close();
	}
}

			// cuando es lo que usted dijo del bar ?
//tener los sitios estructurados 
