package UI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelBin extends JPanel{
	
	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel [] jLabelBinList;

	public JPanelBin(){
		super();
		jLabelBinList = new JLabel[32];
		for (int i = 0; i < jLabelBinList.length; i++) {
			jLabelBinList[i] = new JLabel();
		}
		this.setLayout(new GridLayout(4,8));
		initComponents();
		this.setBackground(new Color(217, 228, 241));
		this.setBorder(BorderFactory.createLineBorder(new Color(72,78,112)));
		this.setVisible(true);
	}

	private void initComponents() {
		for (int i = 0; i < jLabelBinList.length; i++) {
			if ((i>=0 && i<=7)||(i>=16 && i<=23)) {
				jLabelBinList[i].setForeground(new Color(72,78,112));
				jLabelBinList[i].setText(Constans.LABEL_BIN);
			}else{
				jLabelBinList[i].setForeground(Color.GRAY);
				if(i ==8){
					jLabelBinList[i].setText("63");
				}else if (i == 12) {
					jLabelBinList[i].setText("43");
				}else if (i == 15) {
					jLabelBinList[i].setText("32");
				}else if (i == 24) {
					jLabelBinList[i].setText("31");
				}else if (i == 28) {
					jLabelBinList[i].setText("15");
				}else if (i == 31) {
					jLabelBinList[i].setText("0");
				}
			}
			jLabelBinList[i].setFont(new Font("Consolas", 1, 20));
			this.add(jLabelBinList[i]);
		}
	}
}