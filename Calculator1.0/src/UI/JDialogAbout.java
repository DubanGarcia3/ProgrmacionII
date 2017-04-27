package UI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class JDialogAbout extends JDialog{
	
	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;

	private JLabel acerca;
	
	public JDialogAbout() {
		this.setLayout(new BorderLayout());
		this.setTitle("Acerca de");
		this.setBackground(Color.decode("#98FFFF"));
		this.setSize(600, 200);
		this.setLocationRelativeTo(null);
		acerca = new JLabel("Esta es la version 1.0 de la Calculadora. Creada por:  "
				+ "Duban Estiven Garcia Ramos" +" Cod :  "
				+ "201511229");
		acerca.setBackground(Color.decode("#98FFFF"));
		this.add(acerca, BorderLayout.CENTER);
		this.setVisible(true);
	}

}
