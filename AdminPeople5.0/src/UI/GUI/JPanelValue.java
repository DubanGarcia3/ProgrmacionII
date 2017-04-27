package UI.GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControllerGUI;
import persistance.PropertiesTitle;

public class JPanelValue extends JPanel{

	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jLabel;
	private JTextField jTextField;
	private ControllerGUI controllerGUI;
	private PropertiesTitle propertiesTitle;
	
	public JPanelValue(PropertiesTitle propertiesTitle, ControllerGUI controllerGUI) {
		this.propertiesTitle = propertiesTitle;
		this.controllerGUI = controllerGUI;
		jLabel = new JLabel(propertiesTitle.getProperty(Constans.VALUE));
		jTextField = new JTextField(20);
		jTextField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 42, 10));
		init();
	}

	private void init() {
		this.add(jLabel);
		this.add(jTextField);
		this.setBackground(Color.decode("#E0F8E6"));
	}
	
	public void refresh(){
		propertiesTitle = controllerGUI.getPropertiesTitle();
		jLabel.setText(propertiesTitle.getProperty(Constans.VALUE));
	}

	public JTextField getjTextField() {
		return jTextField;
	}
}
