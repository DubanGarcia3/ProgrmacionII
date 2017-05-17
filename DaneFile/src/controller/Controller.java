package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.GroupPlace;
import model.Place;
import persistence.FileManager;
import view.JFrameMainWindow;
import view.JPanelTableCity;

public class Controller {
	
	private GroupPlace groupPlace;
	private FileManager fileManager;
	private JFrameMainWindow jframeMainWindow;
	private JPanelTableCity jPanelTableCity;
	private ArrayList<Place> arrayPlace;
	
	public Controller() {
		arrayPlace = new  ArrayList<>();
		groupPlace = new GroupPlace();
		fileManager = new FileManager();
		jframeMainWindow = new JFrameMainWindow();
		jPanelTableCity = new JPanelTableCity();
		jframeMainWindow.add(jPanelTableCity);
		jframeMainWindow.setVisible(true);
		initApp();
	}

	private void initApp() {
		try {
			this.manageString(fileManager.readFile());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("No se puede leer el archivo");
		}
	}
	
	public void manageString(List<String> listLines){
		for (int i = 0; i < listLines.size(); i++) {
			String [] vector = listLines.get(i).split(";");
			Place place = createPlace(vector);
			jPanelTableCity.addplace(place);
			//groupPlace.add(place);
			arrayPlace.add(place);
		}
	}
	
	public ArrayList<Place> getArrayPlace() {
		return arrayPlace;
	}

	public void setArrayPlace(ArrayList<Place> arrayPlace) {
		this.arrayPlace = arrayPlace;
	}

	private Place createPlace(String[] vector) {
		return new Place(vector[0], vector[1], (vector[2]), vector[3]);
	}
}