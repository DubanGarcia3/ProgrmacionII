package UI.GUI;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import controller.Action;
import controller.ControllerGUI;
import persistance.PropertiesTitle;


public class JPanelOK extends JPanel{

	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton jButtonOk, jButtonCancel;
	private PropertiesTitle propertiesTitle;
	private ControllerGUI controllerGUI;
	
	public JPanelOK(PropertiesTitle propertiesTitle, ControllerGUI controllerGUI) {
		this.propertiesTitle = propertiesTitle;
		this.controllerGUI = controllerGUI;
		jButtonOk = new JButton(new ImageIcon(getClass().getResource("/img/success.png")));
		jButtonCancel = new JButton(new ImageIcon(getClass().getResource("/img/error.png")));
		jButtonOk.setBorderPainted(false);
		jButtonCancel.setBorder(null);
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 30));
		this.setBackground(Color.decode("#E0F8E6"));
		init(controllerGUI);
	}

	private void init(ControllerGUI controller) {
		jButtonOk.setBackground(Color.decode("#E0F8E6"));
		jButtonOk.addActionListener(controller);
		jButtonOk.setFocusable(false);
		jButtonOk.setFocusPainted(false);
		jButtonOk.setActionCommand(Action.OK_PERSON.name());
		this.add(jButtonOk);
		jButtonCancel.setBackground(Color.decode("#E0F8E6"));
		jButtonCancel.addActionListener(controller);
		jButtonCancel.setFocusable(false);
		jButtonCancel.setFocusPainted(false);
		jButtonCancel.setActionCommand(Action.CANCEL_PERSON.name());
		this.add(jButtonCancel);
	}
	
	public void refresh(){
		propertiesTitle = controllerGUI.getPropertiesTitle();
	}

	public JButton getjButtonOk() {
		return jButtonOk;
	}

	public JButton getjButtonCancel() {
		return jButtonCancel;
	}
}