package UI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class JtoolbarCalculator extends JToolBar{

	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton jButtonView, jButtonEdit, jButtonHelp;
	
	public JtoolbarCalculator(){
		this.setLayout(new FlowLayout());
		this.setFloatable(false);
		this.init();
	}

	private void init() {
		jButtonView = new JButton(Constans.BTN_VIEW);
		jButtonEdit = new JButton(Constans.BTN_EDIT);
		jButtonHelp = new JButton(Constans.BTN_HELP);
		this.add(jButtonView);
		this.add(jButtonEdit);
		this.add(jButtonHelp);
	}
}
