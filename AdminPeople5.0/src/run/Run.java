package run;

import controller.ControllerGUI;

public class Run {

	public static void main(String[] args) {
		ControllerGUI g = new ControllerGUI();
		g.initAll();
		g.save();
	}
}