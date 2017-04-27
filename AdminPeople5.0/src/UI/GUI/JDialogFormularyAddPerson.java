package UI.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JDialog;

import controller.ControllerGUI;
import model.Person;
import persistance.PropertiesTitle;

public class JDialogFormularyAddPerson extends JDialog{

	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 700;
	private int id =99;

	private JpanelFormulary jpanelFormulary;
	private PropertiesTitle propertiesTitle;
	private ControllerGUI controllerGUI;
	
	public JDialogFormularyAddPerson(PropertiesTitle propertiesTitle, ControllerGUI controllerGUI) {
		this.propertiesTitle = propertiesTitle;
		this.controllerGUI = controllerGUI;
		this.jpanelFormulary = new JpanelFormulary(propertiesTitle, controllerGUI);
		this.setTitle(propertiesTitle.getProperty(Constans.TITLE));
		this.setSize(WIDTH, HEIGHT);
		this.setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);
		init();
	}

	/**
	 * inicializa el panel, donde están los componentes
	 */
	private void init() {
		this.add(jpanelFormulary,BorderLayout.CENTER);
		jpanelFormulary.setPreferredSize(new Dimension(WIDTH-50, HEIGHT));
		this.setIconImage(new ImageIcon(getClass().getResource("/img/iconoadmin.jpg")).getImage());
		this.setBackground(Color.decode("#E0F8E6"));
	}
	
	/**
	 * actualiza los enunciados de los componentes internos del Dialogo
	 */
	public void refresh(){
		jpanelFormulary.refresh();
		propertiesTitle = controllerGUI.getPropertiesTitle();
		this.setTitle(propertiesTitle.getProperty(Constans.TITLE));
	}
	
	
	public Person getPerson(){
		return jpanelFormulary.getPerson();
	}

	public JpanelFormulary getPanelFormulary(){
		return jpanelFormulary;
	}
	
	/**
	 * Limpia los campos del dialogo
	 */
	public void clean() {
		jpanelFormulary.clean();	
	}
}