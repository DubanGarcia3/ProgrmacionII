package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameCalculator extends JFrame{
	
	/**
	 * @author Duban
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBarCalculator jMenuBarCalculator;
	private JPanel jPanel, jPanel2,jPanel3;
	private JPanelResult jPanelResult;
	private JPanelToolBar jPanelToolBar;
	private JPanelBin jPanelBin;
	private JPanelNumber jPanelNumber;
	
	public JFrameCalculator(){
		jPanel = new JPanel();
		jPanel2 = new JPanel();
		jPanel3 = new JPanel();
		jMenuBarCalculator = new JMenuBarCalculator();
		jPanelResult = new JPanelResult();
		jPanelBin = new JPanelBin();
		jPanelNumber = new JPanelNumber();
		jPanelToolBar = new JPanelToolBar();
		this.init();
		this.initComponents();
	}

	private void init() {
		this.setBackground(new Color(217, 228, 241));
		this.setTitle(Constans.TITLE_WINDOW);
		this.setSize(Constans.WIDTH, Constans.HEIGHT);
		this.setLocationRelativeTo(null);
		//this.setResizable(false);
		this.setJMenuBar(jMenuBarCalculator);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon(getClass().getResource("/icons/calculadora.jpg")).getImage());
		this.setLayout(new BorderLayout());
		jPanelToolBar.setPreferredSize(new Dimension(Constans.WIDTH-50, 40));
		jPanelResult.setPreferredSize(new Dimension(Constans.WIDTH-50, 50));
		jPanelBin.setPreferredSize(new Dimension(Constans.WIDTH-50, 100));
		jPanelNumber.setPreferredSize(new Dimension(Constans.WIDTH-50,220));
		this.setVisible(true);
	}

	public void initComponents(){
		this.add(jPanel, BorderLayout.CENTER);
		jPanel.setBackground(new Color(217, 228, 241));
		jPanel.add(jPanelToolBar);
		jPanel.add(jPanelResult);
		jPanel.add(jPanelBin);
		jPanel.add(jPanelNumber);
		this.add(jPanel2, BorderLayout.EAST);
		jPanel2.setBackground(new Color(217, 228, 241));
		this.add(jPanel3,BorderLayout.WEST);
		jPanel3.setBackground(new Color(217, 228, 241));
		
	}
}