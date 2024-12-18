package main.lab10.oop.project.object.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

import main.lab10.oop.project.object.button.ButtonMode;
import main.lab10.oop.project.SharedObject;
import main.lab10.oop.project.object.ClassObject;
import main.lab10.oop.project.object.ObjectBase;
import main.lab10.oop.project.object.UseCaseObject;

public class ObjectListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (ButtonMode.getInstance().getMode() == ButtonMode.buttonModeEnum.classMode
				|| ButtonMode.getInstance().getMode() == ButtonMode.buttonModeEnum.useCaseMode) {
			String name = JOptionPane.showInputDialog(SharedObject.getInstance().getDrawPanel(), "enter name", "name",
					3);
			System.out.println(e.getX() + " " + e.getY() + " " + name + " " + ButtonMode.getInstance().getMode());

			if (name != null) {
				ObjectBase newObject = null;
				if (ButtonMode.getInstance().getMode() == ButtonMode.buttonModeEnum.classMode) {
					newObject = new ClassObject(e.getX(), e.getY(), 50, 50, false, name);
				} else if (ButtonMode.getInstance().getMode() == ButtonMode.buttonModeEnum.useCaseMode) {
					newObject = new UseCaseObject(e.getX(), e.getY(), 50, 30, false, name);
				}
				SharedObject.getInstance().shapes.add(newObject);
				SharedObject.getInstance().getDrawPanel().repaint();
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
}
