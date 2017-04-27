package controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.Locale;

import UI.GUI.PanelDate;
import exception.IDException;
import UI.GUI.DialogSplash;
import UI.GUI.JDialogAbout;
import UI.GUI.JDialogDelete;
import UI.GUI.JDialogFormularyAddPerson;
import UI.GUI.JDialogHelp;
import UI.GUI.JDialogLanguage;
import UI.GUI.JFrameMainWindow;
import UI.GUI.JMainMenu;
import UI.GUI.JPanelDate;
import UI.GUI.JPanelStateBar;
import UI.GUI.JPanelTable;
import model.GroupPerson;
import model.Person;
import persistance.Persistence;
import persistance.PropertiesTitle;

public class ControllerGUI implements ActionListener{
	/**
	 * @author Alejandro Rodríguez
	 * @author Brayan
	 */

	private String languagedefault;
	private PropertiesTitle propertiesTitle;
	private JFrameMainWindow jFrameMainWindow;
	private JPanelStateBar jPanelStateBar;
	private JPanelTable jPanelTable;
	private JMainMenu jMainMenu;
	private JDialogLanguage jDialogLanguage;
	private JDialogFormularyAddPerson dialogAddPerson;
	private GroupPerson groupPerson;
	private JDialogAbout jDialogAbout;
	private JDialogHelp jDialogHelp;
	private JPanelDate jPanelDate;
	private DialogSplash dialogSplash; 
	private JDialogDelete jDialogDelete;
	
	private Persistence persistence;
	

	public ControllerGUI() {
		propertiesTitle = new PropertiesTitle("Spanish");
		jFrameMainWindow = new JFrameMainWindow(propertiesTitle, this);
		jMainMenu = new JMainMenu(propertiesTitle, this);
		jPanelTable = new JPanelTable(propertiesTitle, this);
		jPanelStateBar = new JPanelStateBar(propertiesTitle, this);
		jDialogAbout = new JDialogAbout(propertiesTitle, this);
		jDialogHelp = new JDialogHelp(propertiesTitle, this);
		jPanelDate = new JPanelDate(propertiesTitle, this);
		jDialogLanguage = new JDialogLanguage(this, propertiesTitle);
		dialogAddPerson = new JDialogFormularyAddPerson(propertiesTitle, this);
		jDialogDelete = new  JDialogDelete(propertiesTitle, this);
		this.groupPerson = new GroupPerson();
		dialogSplash = new DialogSplash();
		persistence = new Persistence();
		init();
		spash();
		
	}
	private void init(){

		jFrameMainWindow.setLayout(new BorderLayout());
		jFrameMainWindow.add(jMainMenu, BorderLayout.NORTH);
		jFrameMainWindow.add(jPanelTable, BorderLayout.CENTER);
		jFrameMainWindow.add(jPanelStateBar,BorderLayout.SOUTH);
	}
	
	/*
	 * Permite que aparezca el splash y le de tiempo a la venta principal en aparecer visible
	 */
	private void spash(){
		dialogSplash.setVisible(true);
		new Thread();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dialogSplash.setVisible(false);
		jFrameMainWindow.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Action.valueOf(e.getActionCommand())) {
		case OK_LANGUAGE:
			manageLanguage();
			break;

		case ADD_PERSON:
			addPerson();
			break;

		case OK_PERSON:
			okPerson();
			dialogAddPerson.clean();
			break;

		case CANCEL_PERSON:
			dialogAddPerson.setVisible(false);
			dialogAddPerson.clean();
			break;
		case DELETE:
			jDialogDelete.setVisible(true);
			break;
		case OK_DELETE:
			jDialogDelete.setVisible(false);
			delete();
			break;
		case SEARCH:

			break;
		case HELP:
			jDialogHelp.setVisible(true);
			break;
		case ABOUT_OF:
			jDialogAbout.setVisible(true);
			break;
		case LANGUAGE:
			jDialogLanguage.setVisible(true);
			break;
		case ADD_PHOTO:
			changeImagenLocalOnDialogAdd();
			break;
		default:
			break;
		}
	}

	private void delete() {
		jPanelTable.getDtm().removeRow(jPanelTable.getjTable().getSelectedRow());
		groupPerson.deletePerson(jPanelTable.getjTable().getSelectedRow());
		jPanelTable.refreshTable(groupPerson.getList());
	}

	public void addPerson(){
		dialogAddPerson.setVisible(true);
		jPanelTable.refreshTable(groupPerson.getList());
	}
	/*
	 * es la accion del btn ok del dialogo add donde genera un nuevo objeto persona con el fin de agregar a logica
	 */
	public void okPerson(){
		Person person = dialogAddPerson.getPerson();
		groupPerson.add(person);
		jPanelStateBar.setTheText(""+groupPerson.getList().length);
		jPanelTable.addPerson(person);
		dialogAddPerson.setVisible(false);
	}
	/*
	 * ESCOGE EL IDIOMA DEL SISTEMA OPERATIVO COMO PREDETERMINADO
	 */
	public String getLanguageDefault(){
		languagedefault = Locale.getDefault().getLanguage();
		switch (languagedefault) {
		case "espanol":
			return "Espanol";
		case "ingles":
			return "Ingles";
		}
		return "Espanol";
	}

	/*
	 *  Permite establecer que idioma generar cuando se selleccione el radioButton correspondiente al idioma dado
	 */
	public void manageLanguage(){
		if (jDialogLanguage.selectLanguage() == 1) {
			propertiesTitle = new PropertiesTitle("Spanish");
		}else if (jDialogLanguage.selectLanguage() == 2){
			propertiesTitle = new PropertiesTitle("English");
		}
		jDialogLanguage.setVisible(false);
		updatelanguage();
	}

	public void updatelanguage() {
		jDialogLanguage.refresh();
		jFrameMainWindow.refresh();
		jMainMenu.refresh();
		jPanelTable.refresh();
		dialogAddPerson.refresh();
		jDialogAbout.refresh();
		jDialogHelp.refresh();
		jPanelDate.refresh();
		jDialogDelete.refresh();
		jPanelStateBar.refresh();
		//los refresh de todas las clases ....
	}

	public PropertiesTitle getPropertiesTitle() {
		return propertiesTitle;
	}

	public void setPropertiesTitle(PropertiesTitle propertiesTitle) {
		this.propertiesTitle = propertiesTitle;
	}

	//este toma el src de la imagen
	private void changeImagenLocalOnDialogAdd() {
		try {
			dialogAddPerson.getPanelFormulary().getSrc();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Este metodo me guarda en un archivo plano
	 */
	public void save() {
		jFrameMainWindow.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent arg0) {
				try {
					persistence.writePlane(groupPerson.getList());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			@Override
			public void windowClosed(WindowEvent arg0) {
				try {
					persistence.writePlane(groupPerson.getList());
				} catch (IOException e) {
					e.printStackTrace();
				}	
			}
			
			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	/**
	 * Este metodo es usado para la lectura de los datos y al iniciar el programa ya se encuentren en nuestra tabla
	 */
	public void initAll(){
		try {
			jPanelTable.refreshTable(persistence.toVector());
			for (int i = 0; i < persistence.readTheplane().size(); i++) {
				groupPerson.add(persistence.toVector()[i]);
//				System.out.println(persistence.readTheplane().get(i).personToString());
//				System.out.println(persistence.toVector()[i].personToString());
			}
			jPanelStateBar.setTheText(""+ persistence.readTheplane().size());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
