package UI.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JRadioButton;

import controller.Action;
import controller.ControllerGUI;
import persistance.PropertiesTitle;


public class JDialogLanguage extends JDialog{

	/**
	 * @author DUBAN GARCIA 
	 * @author ALEJANDRO RODRIGUEZ
	 */
	private static final long serialVersionUID = 1L;
	
	private JRadioButton jRSpanish, jREnglish;
	private ButtonGroup group1;
	private JButton JbOK;
	private PropertiesTitle propertiesTitle;
	private ControllerGUI controller;
	public static final Dimension SIZE = new Dimension(250,250);
	
	public JDialogLanguage(ControllerGUI controller, PropertiesTitle propertiesTitle){
		this.propertiesTitle = propertiesTitle;
		this.controller = controller;
		this.setIconImage(new ImageIcon(getClass().getResource("/img/logoPro.png")).getImage());
		initComponents();
	}
	/**
	 * Inicializa y agrega los respectivos componentes al dialogo
	 */
	public void initComponents(){
		Font font = new Font("Arial", Font.PLAIN, 20);
		this.setBackground(Color.decode("#E0F8E6"));
		setTitle(propertiesTitle.getProperty(Constans.TITLE_LANGUAGE));		
		setSize(SIZE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new GridBagLayout());
		
		
		GridBagConstraints gridBagC = new GridBagConstraints();
		gridBagC.fill = GridBagConstraints.BOTH;
		gridBagC.insets = new Insets(10, 10, 10, 10);
		
		JbOK = new JButton(new ImageIcon(getClass().getResource("/img/success.png")));
		JbOK.setBorderPainted(false);
		JbOK.setBackground(Color.decode("#E0F8E6"));
		JbOK.setFocusable(false);
		JbOK.setFocusPainted(false);
		JbOK.setActionCommand(Action.OK_LANGUAGE.name());
		JbOK.addActionListener(controller);
		gridBagC.gridx= 1;//que tan a la -> de la pantalla esta
		gridBagC.gridy = 6;//cuanto hacia abajo
		gridBagC.weightx= 0.1;//porcentaje de tamaño
		gridBagC.weighty = 0.1;
		gridBagC.gridheight = 1;//cuantas filas
		gridBagC.gridwidth = 2;//cuantas columnas 		
		add(JbOK,gridBagC);
		
		jRSpanish = new JRadioButton(propertiesTitle.getProperty(Constans.T_BT_SPANISH));
		jRSpanish.setFont(font);
		jRSpanish.setBackground(Color.decode("#E0F8E6"));
		gridBagC.gridx= 2;//que tan a la -> de la pantalla esta
		gridBagC.gridy = 1;//cuanto hacia abajo
		gridBagC.weightx= 0.1;//porcentaje de tamaño
		gridBagC.weighty = 0.1;
		gridBagC.gridheight = 1;//cuantas filas
		gridBagC.gridwidth = 2;//cuantas columnas 				
		add(jRSpanish,gridBagC);
		
		jREnglish = new JRadioButton(propertiesTitle.getProperty(Constans.T_BT_ENGLISH));
		jREnglish.setFont(font);
		jREnglish.setBackground(Color.decode("#E0F8E6"));
		gridBagC.gridx= 2;//que tan a la -> de la pantalla esta
		gridBagC.gridy =2;//cuanto hacia abajo
		gridBagC.weightx= 0.1;//porcentaje de tamaño
		gridBagC.weighty = 0.1;
		gridBagC.gridheight = 1;//cuantas filas
		gridBagC.gridwidth = 2;//cuantas columnas 				
		add(jREnglish,gridBagC);
		
		group1 = new ButtonGroup();
		group1.add(jREnglish);
		group1.add(jRSpanish);
	}	
	
	public int selectLanguage(){
		int language = 2;
		if (jRSpanish.isSelected()) {
			 language = 1;
		}else if (jREnglish.isSelected()) {
			 language = 2;
		}
		return language;
	}
	/**
	 * actualiza los componentes del dialogo para cambiarlos de idioma
	 */
	public void refresh(){
		propertiesTitle = controller.getPropertiesTitle();
		JbOK.setText(propertiesTitle.getProperty(Constans.BTN_OK));
		jRSpanish.setText(propertiesTitle.getProperty(Constans.T_BT_SPANISH));
		jREnglish.setText(propertiesTitle.getProperty(Constans.T_BT_ENGLISH));
	}
}