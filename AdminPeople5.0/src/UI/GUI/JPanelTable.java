package UI.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.ControllerGUI;
import model.Person;
import persistance.PropertiesTitle;

public class JPanelTable extends JPanel{

	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	
	private JTable jTable;
	private DefaultTableModel dtm;
	private JScrollPane jsp;
	private PropertiesTitle propertiesTitle;
	private ControllerGUI controllerGUI;
	
	public JPanelTable(PropertiesTitle propertiesTitle, ControllerGUI controllerGUI){
		this.propertiesTitle = propertiesTitle;
		this.controllerGUI = controllerGUI;
		initComponents();
	}
	
	public void initComponents(){		
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBackground(Color.decode("#E0F8E6"));
		
		dtm = new DefaultTableModel();
		upDate();
		
		Font fontHeader = new Font("Franklin Ghotic Demi" , Font.ITALIC ,20);
		Font font = new Font("Arial" , Font.PLAIN ,17);
		jTable = new JTable(){
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column){  
				return false;  
			}
		};;
		jTable.setModel(dtm);
		jTable.getTableHeader().setReorderingAllowed(false);
		jTable.getTableHeader().setBackground(Color.decode("#282E33"));
		jTable.getTableHeader().setForeground(Color.white);
		jTable.getTableHeader().setFont(fontHeader);
		jTable.setFont(font);
		jTable.setBackground(Color.white);
		jTable.setBorder(null);
		
		jsp = new JScrollPane(jTable);
		jsp.setForeground(Color.white);
		jsp.setBorder(null);
		jsp.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		add(jsp, BorderLayout.PAGE_END);
		this.setBorder(null);
	}
	
	/**
	 * crea una cabecera de la tabla por defecto
	 */
	public void upDate(){
//		propertiesTitle = controller.getPropertiesTitle();
//		String [] headers= {propertiesTitle.getProperty(Constans.IMAGE),propertiesTitle.getProperty(Constans.T_D_NOMBRE),propertiesTitle.getProperty(Constans.T_TYPE) , propertiesTitle.getProperty(Constans.T_D_QUALIFICATION) };
//		dtm.setColumnIdentifiers(headers);
		String [] head = {propertiesTitle.getProperty(Constans.CODE),
				propertiesTitle.getProperty(Constans.NAME),
				propertiesTitle.getProperty(Constans.LAST_NAME),
				propertiesTitle.getProperty(Constans.GENRE),
				propertiesTitle.getProperty(Constans.BIRTH_DATE),
				propertiesTitle.getProperty(Constans.CITY)};
		dtm.setColumnIdentifiers(head);
	}

	public void refresh() {
		propertiesTitle = controllerGUI.getPropertiesTitle();
		String [] head = {propertiesTitle.getProperty(Constans.CODE),
				propertiesTitle.getProperty(Constans.NAME),
				propertiesTitle.getProperty(Constans.LAST_NAME),
				propertiesTitle.getProperty(Constans.GENRE),
				propertiesTitle.getProperty(Constans.BIRTH_DATE),
				propertiesTitle.getProperty(Constans.CITY)};
		dtm.setColumnIdentifiers(head);
	}
	
	/**
	 * extrae los datos de cada columna, agregandolos a la persona de la logica
	 * @param Person
	 */
	public void addPerson(Person Person) {
		String[] person = { "" + Person.getId(), Person.getName(), "" + Person.getLastName(), Person.getGender().name(), Person.getBirthDate().toString()};
		dtm.addRow(person);
	}
	
	/**
	 * refresca la tabla
	 * @param persons
	 */
	public void refreshTable(Person[] persons){
		jTable.removeAll();
		for (int i = 0; i < persons.length; i++) {
			addPerson(persons[i]);
		}
	}
	
	public int returnTheSelectedProduct() {
		return (int) jTable.getValueAt(jTable.getSelectedRow(), 0);	
	}
	
	public void deleteSelectedProduct() {
		if (jTable.getSelectedRow() != -1) {
			dtm.removeRow(jTable.getSelectedRow());
		}
	}

	public JTable getjTable() {
		return jTable;
	}

	public DefaultTableModel getDtm() {
		return dtm;
	}
}