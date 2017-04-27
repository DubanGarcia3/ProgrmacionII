package UI.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.ControllerGUI;
import persistance.PropertiesTitle;

public class JPanelDate extends JPanel{

	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel jLabelDate;
	private JTexFieldDay jTexFieldDay;
	private JTextFieldMonth jTextFieldMonth;
	private JTextFieldYear jTextFieldYear;
	private JPanel jPanel1, jPanel2;
	private PropertiesTitle propertiesTitle;
	private ControllerGUI controllerGUI;
	
	public JPanelDate(PropertiesTitle propertiesTitle, ControllerGUI controllerGUI) {
		this.propertiesTitle = propertiesTitle;
		this.controllerGUI = controllerGUI;
		jLabelDate = new JLabel(propertiesTitle.getProperty(Constans.BIRTH_DATE));
		jTexFieldDay = new JTexFieldDay(propertiesTitle,controllerGUI);
		jTextFieldMonth = new JTextFieldMonth(propertiesTitle,controllerGUI);
		jTextFieldYear = new JTextFieldYear(propertiesTitle,controllerGUI);
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		this.setLayout(new FlowLayout());
		init();
	}

	private void init() {
		this.setBackground(Color.decode("#E0F8E6"));
		jLabelDate.setPreferredSize(new Dimension(150, 20));
		jLabelDate.setBackground(Color.decode("#E0F8E6"));
		jTexFieldDay.setPreferredSize(new Dimension(60, 30));
		jTextFieldMonth.setPreferredSize(new Dimension(100, 30));
		jTextFieldYear.setPreferredSize(new Dimension(100, 30));
		this.add(jPanel1);
		this.add(jPanel2);
		jPanel1.add(jLabelDate);
		jPanel2.add(jTexFieldDay);
		jPanel2.add(jTextFieldMonth);
		jPanel2.add(jTextFieldYear);
	}
	
	public void refresh(){
		propertiesTitle = controllerGUI.getPropertiesTitle();
		jLabelDate.setText(propertiesTitle.getProperty(Constans.BIRTH_DATE));
	}

	//repoio
	public JTexFieldDay getjTexFieldDay() {
		return jTexFieldDay;
	}

	public JTextFieldMonth getjTextFieldMonth() {
		return jTextFieldMonth;
	}

	public JTextFieldYear getjTextFieldYear() {
		return jTextFieldYear;
	}
}