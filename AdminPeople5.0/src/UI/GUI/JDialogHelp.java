package UI.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controller.ControllerGUI;
import persistance.PropertiesTitle;

public class JDialogHelp extends JDialog{

	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jLabelAbout;
	private JPanel panel;
	private PropertiesTitle  propertiesTitle;
	private ControllerGUI controllerGUI;
	private JScrollPane jScrollPane;
	
	public JDialogHelp(PropertiesTitle propertiesTitle, ControllerGUI controllerGUI) {
		this.propertiesTitle = propertiesTitle;
		this.controllerGUI = controllerGUI;
		this.setTitle(propertiesTitle.getProperty(Constans.DIALOG_HELP));
		this.setSize(500, 500);
		this.setLayout(new BorderLayout());
		this.setBackground(Color.decode("#E0F8E6"));
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon(getClass().getResource("/img/logoPro.png")).getImage());
		init();
		this.setResizable(false);
	}

	/**
	 * inicializa los componentes del dialogo de Ayuda
	 */
	private void init() {
		jLabelAbout = new JLabel(propertiesTitle.getProperty(Constans.HELP_TEXT));
		jScrollPane = new JScrollPane(jLabelAbout);
		panel = new JPanel();
		Font fontHeader = new Font("Arial" , Font.PLAIN ,20);
		jLabelAbout.setFont(fontHeader);
		this.add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.decode("#E0F8E6"));
		panel.add(jScrollPane, BorderLayout.SOUTH);
		panel.add(jLabelAbout, BorderLayout.CENTER);
	}
	
	/**
	 * Refresca los enunciados de cada componente, para cambiarlos de idioma
	 */
	public void refresh(){
		propertiesTitle = controllerGUI.getPropertiesTitle();
		this.setTitle(propertiesTitle.getProperty(Constans.DIALOG_HELP));
		jLabelAbout.setText((propertiesTitle.getProperty(Constans.HELP_TEXT)));
	}
}
