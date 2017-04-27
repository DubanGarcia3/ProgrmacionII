package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelResult extends JPanel{

	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel jLabelResult;

	public JPanelResult() {
		this.setBackground(Color.WHITE);
		this.setLayout(new BorderLayout());
		jLabelResult = new JLabel(Constans.LABEL_RESULT);
		init();
	}

	private void init() {
		this.add(jLabelResult, BorderLayout.EAST);
		this.setBorder(BorderFactory.createLineBorder(new Color(72,78,112)));
		jLabelResult.setFont(new Font("Consolas", 1, 50));
		jLabelResult.setText(Constans.LABEL_RESULT);
	}
}