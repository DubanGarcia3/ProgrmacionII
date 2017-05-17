package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameMainWindow extends JFrame {
	
	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	
	private JMainMenu jMainMenu;
	private JToolbar jToolbar;
	private JPanelTableCity jPanelTableCity;
	private JPanel jPanel;

	public JFrameMainWindow() {
		this.setTitle(Constans.MAIN_TITLE);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		init();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void init() {
		jMainMenu = new JMainMenu();
		jPanel = new JPanel();
		jToolbar = new JToolbar();
		jPanelTableCity = new JPanelTableCity();
		this.setJMenuBar(jMainMenu);
		this.add(jPanel, BorderLayout.NORTH);
		jPanel.add(jToolbar);
		this.add(jPanelTableCity);
	}	
}