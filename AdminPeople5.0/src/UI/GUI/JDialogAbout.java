package UI.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import controller.ControllerGUI;
import persistance.PropertiesTitle;

public class JDialogAbout extends JDialog{
	
	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jLabelAbout,jLabelLogo;
	private PropertiesTitle propertiesTitle;
	private ControllerGUI controllerGUI;
	private JScrollPane jScrollPane;

	public JDialogAbout(PropertiesTitle propertiesTitle, ControllerGUI controllerGUI) {
		this.propertiesTitle = propertiesTitle;
		this.controllerGUI = controllerGUI;
		this.setBackground(Color.decode("#E0F8E6"));
		this.setTitle(propertiesTitle.getProperty(Constans.DIALOG_ABOUT));
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
//		this.setLayout(new GridLayout(2,1));
		init();
		this.setIconImage(new ImageIcon(getClass().getResource("/img/logoPro.png")).getImage());
	}

	/**
	 * inicializa los componentes del dialogo AcercaDe
	 */
	private void init() {
		JPanel pPanel = new JPanel();
		jScrollPane = new JScrollPane(pPanel);
		jLabelLogo = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("/img/logoPro.png")).getImage().getScaledInstance(200,200, 0)));
		jLabelAbout = new JLabel(propertiesTitle.getProperty(Constans.ABOUT_TEXT));
		Font fontHeader = new Font("Arial" , Font.PLAIN ,20);
		jLabelAbout.setFont(fontHeader);
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		pPanel.setLayout(new GridLayout(2, 1));
		pPanel.setBackground(Color.decode("#E0F8E6"));
		this.add(jScrollPane);
		pPanel.add(panel, BorderLayout.CENTER);
		pPanel.add(panel2, BorderLayout.CENTER);
		panel.setBackground(Color.decode("#E0F8E6"));
		panel.setPreferredSize(new Dimension(500, 200));
		panel2.setBackground(Color.decode("#E0F8E6"));
		panel.add(jLabelLogo);
		panel2.add(jLabelAbout);
	}
	
	/**
	 * permite actualizar las palabras de cada componente
	 */
	public void refresh(){
		propertiesTitle =controllerGUI.getPropertiesTitle();
		this.setTitle(propertiesTitle.getProperty(Constans.DIALOG_ABOUT));
		jLabelAbout.setText(propertiesTitle.getProperty(Constans.ABOUT_TEXT));
	}
}