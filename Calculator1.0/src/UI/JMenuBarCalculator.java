package UI;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class JMenuBarCalculator extends JMenuBar{
	
	private JMenu jMenuView, jMenuEdit, jmMenuHelp, jMenuCalculusHoja;
	private JMenuItem jMenuItemEstandar, jMenuItemCientific, jMenuItemProgrammer, jMenuItemStatwistics, jMenuItemHistory, jMenuItemNgoup, 
	jMenuItemBassic, jMenuItemConverter, jMenuItemDateCalculator, jMenuItemCopy, jMenuItemPaste, jMenuItemViewHelp,
	jMenuItemAboutHelp, jMenuItemHipotec, jMenuItemCars, jMenuItemFuelMpg, jMenuItemFuelKm;

	public JMenuBarCalculator(){
		this.init();
	}
	
	private void init() {
		jMenuView = new JMenu(Constans.MENU_VIEW);
		
		jMenuItemEstandar = new JMenuItem(Constans.ESTANDAR);
		jMenuItemCientific = new JMenuItem(Constans.CIENTIFIC);
		jMenuItemProgrammer = new JMenuItem(Constans.PROGRAMMER);
		jMenuItemStatwistics = new JMenuItem(Constans.STATISTICS);
		jMenuItemHistory = new JMenuItem(Constans.HISTORY);
		jMenuItemNgoup = new JMenuItem(Constans.N_GROUP);
		jMenuItemBassic = new JMenuItem(Constans.BASSIC);
		jMenuItemConverter = new JMenuItem(Constans.CONVERTER);
		jMenuItemDateCalculator = new JMenuItem(Constans.DATE_CALCULATOR);
		
		jMenuCalculusHoja = new JMenu(Constans.HOJA_CALCULO);
		jMenuItemHipotec = new JMenuItem(Constans.HIPOTEC);
		jMenuItemCars = new JMenuItem(Constans.ITEM_CARS);
		jMenuItemFuelMpg = new JMenuItem(Constans.FUEL_MPG); 
		jMenuItemFuelKm = new JMenuItem(Constans.FUEL_KM);
		
		jMenuEdit = new JMenu(Constans.MENU_EDIT);
		jMenuItemCopy = new JMenuItem(Constans.COPY);
		jMenuItemPaste = new JMenuItem(Constans.PEGAR);
		
		jmMenuHelp = new JMenu(Constans.MENU_HELP);
		jMenuItemViewHelp = new JMenuItem(Constans.VIEW_HELP);
		jMenuItemAboutHelp = new JMenuItem(Constans.ABOUT_HELP);
		
		this.add(jMenuView);
		jMenuView.add(jMenuItemEstandar);
		jMenuItemEstandar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,java.awt.event.InputEvent.ALT_DOWN_MASK));
		jMenuView.add(jMenuItemCientific);
		jMenuItemCientific.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,java.awt.event.InputEvent.ALT_DOWN_MASK));
		jMenuView.add(jMenuItemProgrammer);
		jMenuItemProgrammer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3,java.awt.event.InputEvent.ALT_DOWN_MASK));
		jMenuView.add(jMenuItemStatwistics);
		jMenuItemStatwistics.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3,java.awt.event.InputEvent.ALT_DOWN_MASK));
		jMenuView.addSeparator();
		jMenuView.add(jMenuItemHistory);
		jMenuItemHistory.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jMenuView.add(jMenuItemNgoup);
		jMenuView.addSeparator();
		jMenuView.add(jMenuItemBassic);
		jMenuItemBassic.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4,java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jMenuView.add(jMenuItemConverter);
		jMenuItemConverter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jMenuView.add(jMenuItemDateCalculator);
		jMenuItemDateCalculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jMenuView.add(jMenuCalculusHoja);
		jMenuCalculusHoja.add(jMenuItemHipotec);
		jMenuCalculusHoja.add(jMenuItemCars);
		jMenuCalculusHoja.add(jMenuItemFuelMpg);
		jMenuCalculusHoja.add(jMenuItemFuelKm);
		
		this.add(jMenuEdit);
		jMenuEdit.add(jMenuItemCopy);
		jMenuItemCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jMenuEdit.add(jMenuItemPaste);
		jMenuItemPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,java.awt.event.InputEvent.CTRL_DOWN_MASK));
		
		this.add(jmMenuHelp);
		jmMenuHelp.add(jMenuItemViewHelp);
		jMenuItemViewHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		
		jmMenuHelp.addSeparator();
		jmMenuHelp.add(jMenuItemAboutHelp);
	}
}