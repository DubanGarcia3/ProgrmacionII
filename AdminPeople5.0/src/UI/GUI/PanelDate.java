package UI.GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.time.LocalDate;
import java.time.Month;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import controller.ControllerGUI;
import persistance.PropertiesTitle;


public class PanelDate extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JComboBox<Months> comboBoxMonths;
	private JSpinner spinnerDays;
	private JSpinner spinnerYears;
	private ControllerGUI controllerGUI;
	private PropertiesTitle propertiesTitle;
	private JLabel date, day, year, month;
	
	public PanelDate(PropertiesTitle propertiesTitle ,ControllerGUI controllerGUI) {	
		this.controllerGUI = controllerGUI;
		this.propertiesTitle = propertiesTitle;
		comboBoxMonths = new JComboBox<Months>(Months.values());
		spinnerDays = new JSpinner(new SpinnerNumberModel(1, 1, 30, 1));
		spinnerYears = new JSpinner(new SpinnerNumberModel(2017, 1970, 2100, 1));
		setSize(500, 700);
		init();
	}
	
	private void init(){
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		date = new JLabel(propertiesTitle.getProperty(Constans.BIRTH_DATE));
		add(date);
		day = new JLabel(propertiesTitle.getProperty(Constans.DAY));
		add(day);
		add(spinnerDays);
		month = new JLabel(propertiesTitle.getProperty(Constans.MONTH));
		add(month);
		add(comboBoxMonths);
		year = new JLabel(propertiesTitle.getProperty(Constans.YEAR));
		add(year);
		add(spinnerYears);
		this.setBackground(Color.decode("#E0F8E6"));
	}
	
	public LocalDate getDate(){
		return LocalDate.of((int) spinnerYears.getValue(), Month.of(comboBoxMonths.getSelectedIndex() + 1), (int) spinnerDays.getValue());
	}
	
	public void clean(){
		comboBoxMonths.setSelectedItem(0);
		spinnerDays.setValue(1);
		spinnerYears.setValue(2017);
	}
	
	public void refresh(){
		propertiesTitle = controllerGUI.getPropertiesTitle();
		date.setText(propertiesTitle.getProperty(Constans.BIRTH_DATE));
		day.setText(propertiesTitle.getProperty(Constans.DAY));
		month.setText(propertiesTitle.getProperty(Constans.MONTH));
		year.setText(propertiesTitle.getProperty(Constans.YEAR));
	}
}