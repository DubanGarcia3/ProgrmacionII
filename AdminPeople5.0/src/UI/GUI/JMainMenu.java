package UI.GUI;

import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import controller.Action;
import controller.ControllerGUI;
import persistance.PropertiesTitle;

public class JMainMenu extends JMenuBar{

	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;

	private JMenu jMenuFile, jMenuAbout, jMenuSettings;
	private JMenuItem jMenuItemAdd, jMenuItemSearch, jMenuItemDelete, jMenuItemHelp, jMenuItemAboutOf, jMenuItemLanguage;
	private PropertiesTitle propertiesTitle;
	private ControllerGUI controllerGUI;
	
	public JMainMenu(PropertiesTitle propertiesTitle, ControllerGUI controllerGUI) {
		this.propertiesTitle = propertiesTitle;
		this.controllerGUI = controllerGUI;
		init(controllerGUI);
	}

	/**
	 * crea e inicializa los componentes
	 * @param controller
	 */
	private void init(ControllerGUI controller) {
		Font font = new Font("Arial", Font.PLAIN, 16);
		jMenuFile = new JMenu(propertiesTitle.getProperty(Constans.MENU_FILE));
		jMenuFile.setFont(font);
		jMenuAbout = new JMenu(propertiesTitle.getProperty(Constans.MENU_ABOUT));
		jMenuAbout.setFont(font);
		jMenuSettings = new JMenu(propertiesTitle.getProperty(Constans.MENU_SETTINGS));
		jMenuSettings.setFont(font);
		jMenuItemAdd = new JMenuItem(propertiesTitle.getProperty(Constans.ITEM_ADD));
		jMenuItemAdd.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jMenuItemAdd.addActionListener(controller);
		jMenuItemAdd.setActionCommand(Action.ADD_PERSON.name());
		jMenuItemAdd.setFont(font);
		
		jMenuItemSearch = new JMenuItem(propertiesTitle.getProperty(Constans.ITEM_SEARCH));
		jMenuItemSearch.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jMenuItemSearch.addActionListener(controller);
		jMenuItemSearch.setActionCommand(Action.SEARCH.name());
		jMenuItemSearch.setFont(font);
		
		jMenuItemDelete = new JMenuItem(propertiesTitle.getProperty(Constans.ITEM_DELETE));
		jMenuItemDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jMenuItemDelete.addActionListener(controller);
		jMenuItemDelete.setActionCommand(Action.DELETE.name());
		jMenuItemDelete.setFont(font);
		
		jMenuItemHelp = new JMenuItem(propertiesTitle.getProperty(Constans.ITEM_HELP));
		jMenuItemHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jMenuItemHelp.addActionListener(controller);
		jMenuItemHelp.setActionCommand(Action.HELP.name());
		jMenuItemHelp.setFont(font);
		
		jMenuItemAboutOf = new JMenuItem(propertiesTitle.getProperty(Constans.ITEM_ABOUT));
		jMenuItemAboutOf.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jMenuItemAboutOf.addActionListener(controller);
		jMenuItemAboutOf.setActionCommand(Action.ABOUT_OF.name());
		jMenuItemAboutOf.setFont(font);
		
		jMenuItemLanguage = new JMenuItem(propertiesTitle.getProperty(Constans.ITEM_LANGUAGE));
		jMenuItemLanguage.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jMenuItemLanguage.addActionListener(controllerGUI);
		jMenuItemLanguage.setActionCommand(Action.LANGUAGE.name());
		jMenuItemLanguage.setFont(font);
		
		this.add(jMenuFile);
		jMenuFile.add(jMenuItemAdd);
		jMenuFile.add(jMenuItemSearch);
		jMenuFile.add(jMenuItemDelete);
		this.add(jMenuSettings);
		jMenuSettings.add(jMenuItemLanguage);
		this.add(jMenuAbout);
		jMenuAbout.add(jMenuItemAboutOf);
		jMenuAbout.add(jMenuItemHelp);
	}
	
	public void refresh() {
		propertiesTitle = controllerGUI.getPropertiesTitle();
		jMenuFile.setText(propertiesTitle.getProperty(Constans.MENU_FILE));
		jMenuAbout.setText(propertiesTitle.getProperty(Constans.MENU_ABOUT));
		jMenuSettings.setText(propertiesTitle.getProperty(Constans.MENU_SETTINGS));
		jMenuItemAdd.setText(propertiesTitle.getProperty(Constans.ITEM_ADD));
		jMenuItemSearch.setText(propertiesTitle.getProperty(Constans.ITEM_SEARCH));
		jMenuItemDelete.setText(propertiesTitle.getProperty(Constans.ITEM_DELETE));
		jMenuItemHelp.setText(propertiesTitle.getProperty(Constans.ITEM_HELP));
		jMenuItemAboutOf.setText(propertiesTitle.getProperty(Constans.ITEM_ABOUT));
		jMenuItemLanguage.setText(propertiesTitle.getProperty(Constans.ITEM_LANGUAGE));
		// TODO Auto-generated method stub
	}
}