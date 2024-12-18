package main.lab10.oop.project.object.line;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JComponent;

import main.lab10.oop.project.object.button.ButtonMode;
import main.lab10.oop.project.SharedObject;
import main.lab10.oop.project.object.ObjectBase;
import main.lab10.oop.project.object.ObjectBase.port;

public abstract class LineBase extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2552195740745654751L;

	private Point srcPosition;
	private Point desPosition;
	private String srcUUID;
	private String desUUID;
	private ObjectBase.port srcPort;
	private ObjectBase.port desPort;
	private boolean selected;
	private ButtonMode.buttonModeEnum type;

	public LineBase() {
		srcPosition = new Point(0, 0);
		desPosition = new Point(0, 0);
		srcUUID = null;
		desUUID = null;
		srcPort = port.nullMode;
		desPort = port.nullMode;
		selected = false;
		type = ButtonMode.buttonModeEnum.nullMode;
	}

	public LineBase(int _srcPositionX, int _srcPositionY, int _desPositionX, int _desPositionY, boolean _selected,
			ButtonMode.buttonModeEnum _type) {
		srcPosition = new Point(_srcPositionX, _srcPositionY);
		desPosition = new Point(_desPositionX, _desPositionY);

		type = _type;
		selected = _selected;
	}

	// use uuid to create line
	public LineBase(String _srcUUID, String _desUUID, ObjectBase.port _srcPort, ObjectBase.port _desPort,
			boolean _selected, ButtonMode.buttonModeEnum _type) {
		srcUUID = _srcUUID;
		desUUID = _desUUID;
		srcPort = _srcPort;
		desPort = _desPort;
		getPosFromUUID(srcUUID, desUUID, srcPort, desPort, SharedObject.getInstance().shapes);
		type = _type;
		selected = _selected;
	}

	public void getPosFromUUID(String _srcUUID, String _desUUID, ObjectBase.port _srcPort, ObjectBase.port _desPort,
			ArrayList<ObjectBase> _obList) {
		for (ObjectBase ob : _obList) {
			if (ob.getUUID().equals(_srcUUID)) {
				srcPosition = new Point(ob.getPortPos(_srcPort));
			} else if (ob.getUUID().equals(_desUUID)) {
				desPosition = new Point(ob.getPortPos(_desPort));
			}
		}
	}

	public void setSrcPosition(int _srcX, int _srcY) {
		srcPosition.setLocation(_srcX, _srcY);
	}

	public void SetDesPosition(int _desX, int _desY) {
		desPosition.setLocation(_desX, _desY);
	}

	public void setSelected(boolean _selected) {
		selected = _selected;
	}

	public void setType(ButtonMode.buttonModeEnum _type) {
		type = _type;
	}

	public boolean getSelected() {
		return selected;
	}

	public Point getSrcPos() {
		return srcPosition;
	}

	public Point getDesPos() {
		return desPosition;
	}

	public String getSrcUUID() {
		return srcUUID;
	}

	public String getDesUUID() {
		return desUUID;
	}

	public ObjectBase.port getSrcPort() {
		return srcPort;
	}

	public ObjectBase.port getDesPort() {
		return desPort;
	}

	public ButtonMode.buttonModeEnum getType() {
		return type;
	}

	public boolean inArea(Point src, Point des) {
		Point minPoint = new Point(src.x < des.x ? src.x : des.x, src.y < des.y ? src.y : des.y);
		Point maxPoint = new Point(src.x > des.x ? src.x : des.x, src.y > des.y ? src.y : des.y);
		if (minPoint.x < srcPosition.getX() && minPoint.y < srcPosition.getY() && maxPoint.x > desPosition.getX()
				&& maxPoint.y > desPosition.getY()) {
			return true;
		} else {
			return false;
		}
	}

	public abstract void printObject(Graphics g);

	public void paintBorder(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawRect((int) srcPosition.getX(), (int) srcPosition.getY(), (int) (desPosition.getX() - srcPosition.getX()),
				(int) (desPosition.getY() - srcPosition.getY()));
	}

	@Override
	public void printComponent(Graphics g) {
		super.printComponent(g);
		printObject(g);
	}
}
