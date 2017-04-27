package UI.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import controller.Action;
import controller.ControllerGUI;
import persistance.PropertiesTitle;

public class JDialogDelete extends JDialog{

	/**
	 * @author Duban
	 * @author Brayan
	 * @author Alejo²
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel jLabel;
	private JTextField jTextField;
	private JButton jButton;
	private PropertiesTitle propertiesTitle;
	private ControllerGUI controllerGUI;
	
	public JDialogDelete(PropertiesTitle propertiesTitle, ControllerGUI controllerGUI) {
		this.propertiesTitle = propertiesTitle;
		this.controllerGUI = controllerGUI;
		this.setSize(500, 350);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.decode("#E0F8E6"));
		this.setTitle(propertiesTitle.getProperty(Constans.DELETE_DIALOG));
		this.setResizable(false);
		this.setIconImage(new ImageIcon(getClass().getResource("/img/logoPro.png")).getImage());
		init();
	}

	/**
	 * inicializa los componentes del dialogo Borrar Persona
	 */
	private void init() {
		Font font = new Font("Arial", Font.PLAIN, 20);
		JPanel jPanel = new JPanel();
		jLabel = new JLabel(propertiesTitle.getProperty(Constans.DELETE_MESSAGE));
		jLabel.setPreferredSize(new Dimension(this.getWidth()-50, 80));
		jTextField = new JTextField();
		jTextField.setFont(font);
		jButton = new JButton(new ImageIcon(getClass().getResource("/img/success.png")));
		jPanel.setBackground(Color.decode("#E0F8E6"));
		jLabel.setFont(font);
		jTextField.setPreferredSize(new Dimension(this.getWidth()-50, 80));
		jTextField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		jButton.setBackground(Color.decode("#E0F8E6"));
		jButton.setFocusable(false);
		jButton.setFocusPainted(false);
		jButton.setBorderPainted(false);
		jButton.setActionCommand(Action.OK_DELETE.name());
		jButton.addActionListener(controllerGUI);
		this.add(jPanel,BorderLayout.CENTER);
		jPanel.add(jLabel);
		jPanel.add(jTextField);
		jPanel.add(new JSeparator());
		jPanel.add(jButton);
	}
	
	public String getTextId(){
		return jTextField.getText();
	}
	
	/**
	 * Actualiza los enunciados de cada componente del dialogo
	 */
	public void refresh(){
		propertiesTitle = controllerGUI.getPropertiesTitle();
		this.setTitle(propertiesTitle.getProperty(Constans.DELETE_DIALOG));
		jLabel.setText(propertiesTitle.getProperty(Constans.DELETE_MESSAGE));
	}
}