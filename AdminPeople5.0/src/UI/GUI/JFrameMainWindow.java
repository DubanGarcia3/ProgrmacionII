package UI.GUI;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import controller.ControllerGUI;
import persistance.PropertiesTitle;

public class JFrameMainWindow extends JFrame{

	private static final String IMG_ICONOADMIN_JPG = "/img/logoPro.png";
	/**
	 * @author Duban
	 * @author Alejandro Rodríguez
	 * @author Brayan
	 */
	private static final long serialVersionUID = 1L;
	private PropertiesTitle propertiesTitle;
	private ControllerGUI controllerGUI;

	public JFrameMainWindow(PropertiesTitle propertiesTitle, ControllerGUI controllerGUI) {
		this.propertiesTitle = propertiesTitle;
		this.controllerGUI = controllerGUI;
		initComponents();
	}

	/**
	 * inicializa los componentes de la ventana principal
	 */
	private void initComponents() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon(getClass().getResource(IMG_ICONOADMIN_JPG)).getImage());
		this.setTitle(propertiesTitle.getProperty(Constans.MAIN_WINDOW_TITLE));
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setLocationRelativeTo(null);
	}
	
	public void refresh() {
		propertiesTitle = controllerGUI.getPropertiesTitle();
		this.setTitle(propertiesTitle.getProperty(Constans.MAIN_WINDOW_TITLE));
	}
}