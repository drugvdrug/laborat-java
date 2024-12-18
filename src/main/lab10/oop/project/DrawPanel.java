package main.lab10.oop.project;

import java.awt.Graphics;

import javax.swing.JLayeredPane;

import main.lab10.oop.project.object.ObjectBase;
import main.lab10.oop.project.object.line.LineBase;

@SuppressWarnings("serial")
public class DrawPanel extends JLayeredPane {
	public DrawPanel() {
		super();
		this.setLayout(null);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (ObjectBase shape : SharedObject.getInstance().shapes) {
			shape.printComponent(g);
		}
		for (LineBase line : SharedObject.getInstance().lines) {
			line.printComponent(g);
		}
		SharedObject.getInstance().getSao().printComponent(g);
	}
}
