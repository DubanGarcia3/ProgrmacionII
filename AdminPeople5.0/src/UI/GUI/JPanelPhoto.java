package UI.GUI;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.ControllerGUI;
import persistance.PropertiesTitle;

public class JPanelPhoto extends JPanel{

	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	private JPanel jPanel1, jPanel2;
	private JButton jButtonAdd;
	private PropertiesTitle propertiesTitle;
	private ControllerGUI controllerGUI;

	public JPanelPhoto(PropertiesTitle propertiesTitle, ControllerGUI controllerGUI) {
		this.propertiesTitle = propertiesTitle;
		this.controllerGUI = controllerGUI;
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		jButtonAdd = new JButton(propertiesTitle.getProperty(Constans.EXAM));
		this.setLayout(new GridLayout(1, 2));
		init();
	}

	private void init() {
		this.add(jPanel1);
		jPanel1.setBackground(Color.GRAY);
		this.add(jPanel2);
		jPanel2.add(jButtonAdd);
	}
	
	public void refresh(){
		propertiesTitle = controllerGUI.getPropertiesTitle();
		jButtonAdd.setText(propertiesTitle.getProperty(Constans.EXAM));
	}
}
