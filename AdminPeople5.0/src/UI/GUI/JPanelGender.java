package UI.GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import controller.ControllerGUI;
import model.Gender;
import persistance.PropertiesTitle;

public class JPanelGender extends JPanel{

	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	
	private JRadioButton jRadioButtonMale, jRadioButtonFemale, JRadioButtonOther;
	private JLabel jLabel;
	private ControllerGUI controllerGUI;
	private PropertiesTitle propertiesTitle;
	
	public JPanelGender(PropertiesTitle propertiesTitle, ControllerGUI controllerGUI) {
		this.propertiesTitle = propertiesTitle;
		this.controllerGUI = controllerGUI;
		jLabel = new JLabel(propertiesTitle.getProperty(Constans.GENRE));
		jRadioButtonMale = new JRadioButton(propertiesTitle.getProperty(Constans.MALE));
		jRadioButtonFemale = new JRadioButton(propertiesTitle.getProperty(Constans.FEMALE));
		JRadioButtonOther = new JRadioButton(propertiesTitle.getProperty(Constans.OTHER));
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 30));
		init();
	}

	private void init() {
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButtonFemale);
		buttonGroup.add(jRadioButtonMale);
		buttonGroup.add(JRadioButtonOther);
		this.add(jLabel);
		this.add(jRadioButtonMale);
		this.add(jRadioButtonFemale);
		this.add(JRadioButtonOther);
		jRadioButtonMale.setBackground(Color.decode("#E0F8E6"));
		jRadioButtonMale.setFocusable(false);
		jRadioButtonMale.setFocusPainted(false);
		jRadioButtonFemale.setBackground(Color.decode("#E0F8E6"));
		jRadioButtonFemale.setFocusable(false);
		jRadioButtonFemale.setFocusPainted(false);
		JRadioButtonOther.setBackground(Color.decode("#E0F8E6"));
		JRadioButtonOther.setFocusable(false);
		JRadioButtonOther.setFocusPainted(false);
		this.setBackground(Color.decode("#E0F8E6"));
	}
	
	public void refresh(){
		propertiesTitle = controllerGUI.getPropertiesTitle();
		jLabel.setText(propertiesTitle.getProperty(Constans.GENRE));
		jRadioButtonFemale.setText(propertiesTitle.getProperty(Constans.FEMALE));
		jRadioButtonMale.setText(propertiesTitle.getProperty(Constans.MALE));
		JRadioButtonOther.setText(propertiesTitle.getProperty(Constans.OTHER));
	}
	
	
	public Gender getGender(){
		if (jRadioButtonFemale.isSelected()) {
			return Gender.FEMALE;
		}else if (jRadioButtonMale.isSelected()) {
			 return Gender.MALE;
		}else{
			return Gender.OTHER;
		}
	}
}
