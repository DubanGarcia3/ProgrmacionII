package UI.GUI;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelToChange extends JPanel{

	/**
	 * 
	 */
	private JLabel labelChange;
	private static final long serialVersionUID = 1L;
	private static final String INIT = "Esto";
	
	public PanelToChange() {
		labelChange = new JLabel(INIT);
		init();
	}

	private void init() {
		this.add(labelChange);
	}
	
	public void setTheText(String text){
		this.labelChange.setText(text);
		this.setBackground(Color.decode("#123453"));
	}
}