package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Place;


public class JPanelTableCity extends JPanel{
	
	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	
	private JTable jTable;
	private DefaultTableModel dtm;
	private JScrollPane jsp;
	
	public JPanelTableCity(){
		initComponents();
	}
	
	public void initComponents(){		
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBackground(Color.decode("#00000"));
		
		dtm = new DefaultTableModel();
		upDate();
		
		Font fontHeader = new Font("Franklin Ghotic Demi" , Font.ITALIC ,14);
				
		jTable = new JTable();
		jTable.setModel(dtm);
		jTable.getTableHeader().setReorderingAllowed(false);
		jTable.getTableHeader().setBackground(Color.decode("#282E33"));
		jTable.getTableHeader().setForeground(Color.white);
		jTable.getTableHeader().setFont(fontHeader);
		jTable.setBackground(Color.white);
		jTable.setBorder(null);
		
		jsp = new JScrollPane(jTable);
		jsp.setForeground(Color.white);
		jsp.setBorder(null);
		jsp.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		add(jsp, BorderLayout.PAGE_END);
		this.setBorder(null);
	}
	
	public void upDate(){
		String [] head = { Constans.ID_DEPT, Constans.NAME_DEPT, Constans.ID_CITY, Constans.NAME_CITY};
		dtm.setColumnIdentifiers(head);
	}
	public void addplace(Place place) {
		String[] placevectr = { ""+place.getDepartamentCode(), place.getNameDepartment(), ""+place.getCityCode(), place.getCityName()};
		dtm.addRow(placevectr);
	}
	public void add2(ArrayList<Place> place){
		for (int i = 0; i < place.size(); i++) {
			String []rowdata = { ""+place.get(i).getDepartamentCode(), place.get(i).getNameDepartment(), ""+place.get(i).getCityCode(), place.get(i).getCityName()};
			dtm.addRow(rowdata);
		}
	}
//
//	public void refresh() {
//		propertiesTitle = controllerGUI.getPropertiesTitle();
//		String [] head = {propertiesTitle.getProperty(Constans.CODE),
//				propertiesTitle.getProperty(Constans.NAME),
//				propertiesTitle.getProperty(Constans.LAST_NAME),
//				propertiesTitle.getProperty(Constans.GENRE),
//				propertiesTitle.getProperty(Constans.BIRTH_DATE),
//				propertiesTitle.getProperty(Constans.CITY)};
//		dtm.setColumnIdentifiers(head);
//	}
//	
//	
//	public void refreshAll(){
//	}	
}