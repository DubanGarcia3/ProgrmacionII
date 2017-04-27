package UI.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controller.Action;
import controller.ControllerGUI;
import model.Person;
import persistance.PropertiesTitle;

public class JpanelFormulary extends JPanel{
	
	/**
	 * @author Duban
	 * @author Brayan
	 */
	private static final long serialVersionUID = 1L;
	private JTextFieldName jTextFieldName;
	private JTextFieldApellido jTextFieldApellido;
	private JPanelGender jPanelGender;
	private PanelDate date;
	private JPanelValue jPanelValue;
	private JPanelNumber jPanelNumber;
	private JPanelOK jPanelOK;
	private PropertiesTitle propertiesTitle;
	private ControllerGUI controllerGUI;
	private int id= 100;
	private PanelPhoto photo;
	private String path;

	public JpanelFormulary(PropertiesTitle propertiesTitle, ControllerGUI controllerGUI) {
		Font font = new Font("Arial", Font.PLAIN, 18);
		this.controllerGUI = controllerGUI;
		this.propertiesTitle = propertiesTitle;
		this.jTextFieldName = new JTextFieldName(propertiesTitle,controllerGUI);
		jTextFieldName.setFont(font);
		this.jTextFieldApellido = new JTextFieldApellido(propertiesTitle,controllerGUI);
		jTextFieldApellido.setFont(font);
		this.jPanelGender = new JPanelGender(propertiesTitle,controllerGUI);
		jPanelValue = new JPanelValue(propertiesTitle,controllerGUI);
		jPanelNumber = new JPanelNumber(propertiesTitle,controllerGUI);
		jPanelOK = new JPanelOK(propertiesTitle,controllerGUI);
		date = new PanelDate(propertiesTitle,controllerGUI);
		init();
	}

	public void init(){
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();	
		this.setBackground(Color.decode("#E0F8E6"));

		//panel de previsualizacionde la imagen
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weighty = 10;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets.set(4,4,4,4);
		gbc.fill = GridBagConstraints.BOTH;
		photo = new PanelPhoto();
		photo.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		add(photo, gbc);
		
		//el boton para agregar la imagen
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets.set(4,4,4,4);
		gbc.fill = GridBagConstraints.BOTH;
		JButton btnGetSrc = new JButton(propertiesTitle.getProperty(Constans.GET_SRC));
		btnGetSrc.setBorder(null);
		btnGetSrc.setForeground(Color.BLUE);
		btnGetSrc.setFocusable(false);
		btnGetSrc.setFocusPainted(false);
		btnGetSrc.setBackground(Color.decode("#E0F8E6"));
		btnGetSrc.addActionListener(controllerGUI);
		btnGetSrc.setActionCommand(Action.ADD_PHOTO.name());
		add(btnGetSrc, gbc);
		
		
		//lo del nombre
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets.set(4,4,4,4);
		gbc.fill = GridBagConstraints.BOTH;
		jTextFieldName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(jTextFieldName,gbc);
		
		//lo del apellido
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets.set(4,4,4,4);
		gbc.fill = GridBagConstraints.BOTH;
		jTextFieldApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		add(jTextFieldApellido,gbc);
		
//		lo de date
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets.set(4,4,4,4);
		gbc.fill = GridBagConstraints.BOTH;
		add(date, gbc);
		
//		lo del genero
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets.set(4,4,4,4);
		gbc.fill = GridBagConstraints.BOTH;
		add(jPanelGender,gbc);
		
		
		//lo del numero
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets.set(4,4,4,4);
		gbc.fill = GridBagConstraints.BOTH;
		add(jPanelNumber,gbc);
		
		//lo del valor
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets.set(4,4,4,4);
		gbc.fill = GridBagConstraints.BOTH;
		add(jPanelValue,gbc);
		
		//lo de los botones
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets.set(4,4,4,4);
		gbc.fill = GridBagConstraints.BOTH;
		add(jPanelOK,gbc);
		
		jTextFieldName.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		jTextFieldName.setPreferredSize(new Dimension(JDialogFormularyAddPerson.WIDTH-50, 30));
		jTextFieldApellido.setPreferredSize(new Dimension(JDialogFormularyAddPerson.WIDTH-50, 30));
	}
	
	public Person getPerson(){
		return new Person( jTextFieldName.getText(), jTextFieldApellido.getText(), jPanelGender.getGender() , date.getDate(), Double.parseDouble(jPanelValue.getjTextField().getText()), jPanelNumber.getjTextField().getText(), photo.getImage());
	}

	/**
	 * limpia los campos de la ventana
	 */
	public void clean() {
		jTextFieldName.setText(" ");
		jTextFieldApellido.setText(" ");
		date.clean();
		jPanelValue.getjTextField().setText(" ");
		jPanelNumber.getjTextField().setText(" ");
	}
	
	/**
	 * Genera un chooser para escoger la imagen de la persona
	 * @return
	 */
	public File selectFile() {
		JFileChooser file = new JFileChooser(Constans.IMG_PATH);
		file.showOpenDialog(this);
		return file.getSelectedFile();
	}
	
	/**
	 * obtiene la direccion o ruta donde se encuentra la imagen 
	 * @throws IOException
	 */
	public void getSrc() throws IOException {
		String src = "/img/" + selectFile().getName();
		photo.chancePhotoByPath(src);
		path = "U" + src;
	}
	
	public void refresh(){
		date.refresh();
		jPanelGender.refresh();
		jPanelValue.refresh();
		jPanelNumber.refresh();
		jPanelOK.refresh();
		jTextFieldName.refresh();
		jTextFieldApellido.refresh();
		propertiesTitle = controllerGUI.getPropertiesTitle();
	}
}