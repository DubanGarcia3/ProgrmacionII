package UI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JPanelNumber extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel[] panelList;
	private JPanel jPanelbtn1, jPanelbtn2, jPanelSection1;
	private JButton[] listBtn1;
	private JRadioButton jRadioButtonHexa, jRadioButtonDec, jRadioButtonOct, jRadioButtonBin, jRadioButtonQ, jRadioButtonD, jRadioButtonWord, jRadioButtonByte;
	
	public JPanelNumber(){
		//this.setBackground(new Color(217, 228, 241));
		jPanelbtn1 = new JPanel();
		jPanelbtn2 = new JPanel();
		jPanelSection1 = new JPanel();
		jRadioButtonHexa = new JRadioButton(Constans.BTN_HEXA);
		jRadioButtonDec = new JRadioButton(Constans.BTN_DEC);
		jRadioButtonOct = new JRadioButton(Constans.BTN_OCT);
		jRadioButtonBin = new JRadioButton(Constans.BTN_BIN);
		jRadioButtonQ = new JRadioButton(Constans.BTN_QWORD);
		jRadioButtonD = new JRadioButton(Constans.BTN_DWORD);
		jRadioButtonWord = new JRadioButton(Constans.BTN_WORD);
		jRadioButtonByte = new JRadioButton(Constans.BTN_BYTE);
		this.setLayout(new FlowLayout());
		this.setBackground(new Color(217, 228, 241));
		panelList = new JPanel[2];
		listBtn1 = new JButton[48];
		for (int i = 0; i < listBtn1.length; i++) {
			listBtn1[i] = new JButton();
		}
		for (int i = 0; i < panelList.length; i++) {
			panelList[i] = new JPanel();
		}
		init();
	}

	private void init() {
		for (int i = 0; i < panelList.length; i++) {
			this.add(panelList[i]);
		}
		panelList[0].setLayout(new GridLayout(2, 2, 5, 5));
		panelList[0].add(jPanelbtn1);
		panelList[0].add(jPanelbtn2);
		panelList[1].add(jPanelSection1);
		jPanelbtn1.setBorder(BorderFactory.createLineBorder(new Color(72,78,112)));
		jPanelbtn1.setLayout(new GridLayout(4, 1));
		jPanelbtn1.add(jRadioButtonHexa);
		jRadioButtonHexa.setBackground(new Color(217, 228, 241));
		jRadioButtonHexa.setForeground(new Color(72,78,112));
		jPanelbtn1.add(jRadioButtonDec);
		jRadioButtonDec.setBackground(new Color(217, 228, 241));
		jRadioButtonDec.setForeground(new Color(72,78,112));
		jPanelbtn1.add(jRadioButtonOct);
		jRadioButtonOct.setBackground(new Color(217, 228, 241));
		jRadioButtonOct.setForeground(new Color(72,78,112));
		jPanelbtn1.add(jRadioButtonBin);
		jRadioButtonBin.setBackground(new Color(217, 228, 241));
		jRadioButtonBin.setForeground(new Color(72,78,112));
		jPanelbtn1.setBackground(new Color(217, 228, 241));
		jPanelbtn2.setBorder(BorderFactory.createLineBorder(new Color(72,78,112)));
		jPanelbtn2.setLayout(new GridLayout(4, 1));
		jPanelbtn2.add(jRadioButtonQ);
		jRadioButtonQ.setBackground(new Color(217, 228, 241));
		jRadioButtonQ.setForeground(new Color(72,78,112));
		jPanelbtn2.add(jRadioButtonD);
		jRadioButtonD.setBackground(new Color(217, 228, 241));
		jRadioButtonD.setForeground(new Color(72,78,112));
		jPanelbtn2.add(jRadioButtonWord);
		jRadioButtonWord.setBackground(new Color(217, 228, 241));
		jRadioButtonWord.setForeground(new Color(72,78,112));
		jPanelbtn2.add(jRadioButtonByte);
		jRadioButtonByte.setBackground(new Color(217, 228, 241));
		jRadioButtonByte.setForeground(new Color(72,78,112));
		jPanelbtn2.setBackground(new Color(217, 228, 241));
		addSection1();
	}
	
	public void addSection1(){
		jPanelSection1.setLayout(new GridLayout(6,3,5,5));
		for (int i = 0; i < listBtn1.length; i++) {
			listBtn1[i].setPreferredSize(new Dimension(60,30));
			listBtn1[i].setFont(new Font("Consolas", 1, 15));
			listBtn1[i].setBackground(new Color(217, 228, 241));
			listBtn1[i].setForeground(new Color(72,78,112));
			jPanelSection1.add(listBtn1[i]);
		}
		listBtn1[1].setText("Mod");
		listBtn1[2].setText("A");
		listBtn1[3].setText("Mc");
		listBtn1[4].setText("Mr");
		listBtn1[5].setText("Ms");
		listBtn1[6].setText("M+");
		listBtn1[7].setText("M-");
		listBtn1[8].setText("(");
		listBtn1[9].setText(")");
		listBtn1[10].setText("B");
		listBtn1[11].setText("→");
		//→ 
		listBtn1[12].setText("CE");
		listBtn1[13].setText("C");
		listBtn1[14].setText("±");
		//√ 
		listBtn1[15].setText("√");
		//± 
		listBtn1[16].setText("Rol");
		listBtn1[17].setText("RoR");
		listBtn1[18].setText("C");
		listBtn1[19].setText("7");
		listBtn1[20].setText("8");
		listBtn1[21].setText("9");
		listBtn1[22].setText("/");
		listBtn1[23].setText("%");
		listBtn1[24].setText("Or");
		listBtn1[25].setText("Cor");
		listBtn1[26].setText("D");
		listBtn1[27].setText("4");
		listBtn1[28].setText("5");
		listBtn1[29].setText("6");
		listBtn1[30].setText("*");
		listBtn1[31].setText("1/x");
		listBtn1[32].setText("Lsh");
		listBtn1[33].setText("Rsh");
		listBtn1[34].setText("E");
		listBtn1[35].setText("1");
		listBtn1[36].setText("2");
		listBtn1[37].setText("3");
		listBtn1[38].setText("-");
		listBtn1[40].setText("Not");
		listBtn1[41].setText("And");
		listBtn1[42].setText("F");
		listBtn1[43].setText("0");
		listBtn1[44].setText("");
		listBtn1[45].setText(",");
		listBtn1[46].setText("+");
		listBtn1[47].setText("=");
	}
}
