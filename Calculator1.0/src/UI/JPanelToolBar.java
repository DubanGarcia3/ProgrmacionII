package UI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class JPanelToolBar extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JtoolbarCalculator jtoolbarCalculator;
	
	public JPanelToolBar() {
		//this.setPreferredSize(new Dimension(Constans.WIDTH-20, 80));
		jtoolbarCalculator = new JtoolbarCalculator();
		this.setBackground(new Color(217, 228, 241));
		init();
	}
	public void init(){
		this.add(jtoolbarCalculator);
	}
}
