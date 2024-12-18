package main.lab10.oop.project.object.listener;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import main.lab10.oop.project.object.button.ButtonMode;
import main.lab10.oop.project.SharedObject;
import main.lab10.oop.project.object.GroupObject;
import main.lab10.oop.project.object.ObjectBase;

public class ManuBarListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (ButtonMode.getInstance().getMode().equals(ButtonMode.buttonModeEnum.selectMode)) {
			switch (e.getActionCommand()) {
			case "group": {

				String name = JOptionPane.showInputDialog(SharedObject.getInstance().getDrawPanel(), "enter name",
						"name", 3);
				if (name != null) {
					ObjectBase ob = new GroupObject(name);
					SharedObject.getInstance().shapes.add(0, ob);
					SharedObject.getInstance().getSao().setSrc(new Point(0, 0));
					SharedObject.getInstance().getSao().setDes(new Point(0, 0));
					break;
				}

			}
			case "ungroup": {
				ObjectBase unGroupOb = null;
				int selectedCounter = 0;
				for (ObjectBase ob : SharedObject.getInstance().shapes) {
					if (ob.getSelectedStatic()) {
						selectedCounter += 1;
						unGroupOb = ob;
					}
				}
				if (selectedCounter == 1) {
					unGroupOb.ungroup();
				}
				break;
			}
			case "change name": {
				for (ObjectBase ob : SharedObject.getInstance().shapes) {
					if (ob.getSelectedStatic()) {
						String name = JOptionPane.showInputDialog(SharedObject.getInstance().getDrawPanel(),
								"enter name", "name", 3);
						ob.setName(name);
						break;
					}
				}
				SharedObject.getInstance().getDrawPanel().repaint();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + e.getActionCommand());
			}
		}
	}
}
