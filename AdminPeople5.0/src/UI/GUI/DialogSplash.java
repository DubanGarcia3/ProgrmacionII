package UI.GUI;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;

public class DialogSplash extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean run;
	private JButton btimg;

	public DialogSplash() {
		this.run = false;
		init();
	}

	/**
	 * inicializa los componentes
	 */
	private void init(){
		this.setSize(900, 600);
		this.setVisible(run);
		this.setLayout(new BorderLayout(1, 1));
		btimg = new JButton(new ImageIcon(getClass().getResource("/img/splash.png")));
		btimg.setBorderPainted(false);
		this.add(btimg);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		
	}
	
	/**
	 * verifica si el hilo esta ejecutandose
	 * @return run
	 */
	public boolean isRun() {
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}
}
