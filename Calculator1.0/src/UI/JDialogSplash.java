package UI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JDialogSplash extends JDialog{

	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String PATH = "/icons/intro2.0.png";
	public static final int WIDTH = 300;
	public static final int HEIGHT = 232;
	private JPanel jPanel;
	private JLabel jLabel;

	public JDialogSplash() {
		this.setIconImage(new ImageIcon(getClass().getResource("/icons/calculadora.jpg")).getImage());
		this.setSize(WIDTH, HEIGHT);
		this.setTitle(Constans.WELCOME);
		jPanel = new JPanel();
		jLabel = new JLabel(new ImageIcon(getClass().getResource(PATH)));
		setLocationRelativeTo(null);
		this.setResizable(false);
		init();
		this.setVisible(true);
	}

	private void init() {
		this.add(jPanel);
		jPanel.add(jLabel);	
		jLabel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
}