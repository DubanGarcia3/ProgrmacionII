package UI.GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.ControllerGUI;
import persistance.PropertiesTitle;

public class JPanelStateBar extends JPanel{

	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	private static final String DEFAULT = "0";
	private JLabel labelChange;
	private PropertiesTitle propertiesTitle;
	private ControllerGUI controllerGUI;
	
	public JPanelStateBar(PropertiesTitle propertiesTitle, ControllerGUI controllerGUI) {
		this.propertiesTitle = propertiesTitle;
		this.controllerGUI = controllerGUI;
		this.setBackground(Color.decode("#E0F8E6"));
		init();
	}
	
	private void init() {
		Font font = new Font("Arial", Font.PLAIN, 20);
		labelChange = new JLabel(propertiesTitle.getProperty(Constans.PROGRESS) + DEFAULT);
		labelChange.setFont(font);
		this.add(labelChange);
	}
	
	/**
	 * permite tener una variable donde cambie el label, que será agregado a la ventana
	 * @param text
	 */
	public void setTheText(String text){
		this.labelChange.setText(propertiesTitle.getProperty(Constans.PROGRESS) + text);
	}
	
	public void refresh(){
		propertiesTitle = controllerGUI.getPropertiesTitle();
		labelChange.setText(propertiesTitle.getProperty(Constans.PROGRESS));
	}
	
}