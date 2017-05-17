package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class JToolbar extends JToolBar{

	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton jButtonDept, jButtonCity, jButtonExit;
	
	public JToolbar() {
		this.setFloatable(false);
		init();
	}

	private void init() {
		jButtonCity = new JButton(Constans.CITIES);
		jButtonDept = new JButton(Constans.DEPARTMENTS);
		jButtonExit = new JButton("Salir");
		this.add(jButtonCity);
		this.add(jButtonDept);
		this.add(jButtonExit);
	}
}