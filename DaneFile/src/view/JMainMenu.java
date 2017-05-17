package view;

import java.awt.Color;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMainMenu extends JMenuBar{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JMenu jMenuFile;
	JMenuItem jMenuItemDepartments, jmMenuItemCities;
	
	public JMainMenu() {
		this.setBackground(Color.BLACK);
		init();
	}

	private void init() {
		jMenuFile = new JMenu(Constans.MENU_FILE);
		jMenuItemDepartments = new JMenuItem(Constans.DEPARTMENTS);
		jmMenuItemCities = new JMenuItem(Constans.CITIES);
		jMenuFile.setForeground(Color.WHITE);
		jmMenuItemCities.setForeground(Color.WHITE);
		jMenuItemDepartments.setForeground(Color.WHITE);
		jmMenuItemCities.setBackground(Color.BLACK);
		jMenuItemDepartments.setBackground(Color.BLACK);
		this.add(jMenuFile);
		jMenuFile.add(jMenuItemDepartments);
		jMenuFile.add(jmMenuItemCities);
	}
}
