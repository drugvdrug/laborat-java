package main.lab10.oop.project.object;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import main.lab10.oop.project.SharedObject;
import main.lab10.oop.project.object.line.LineBase;

public class GroupObject extends ObjectBase {

	private static final long serialVersionUID = -8545686183717297656L;

	private ArrayList<ObjectBase> allObjects = new ArrayList<ObjectBase>();
	private ArrayList<Point> allObjectShift = new ArrayList<Point>();
	private Point objPoint = new Point();

	public GroupObject() {
		// TODO Auto-generated constructor stub
		allObjects = null;
	}

	public GroupObject(String _name) {
		super();

		Point minPos = new Point(Integer.MAX_VALUE, Integer.MAX_VALUE);
		Point maxPos = new Point(Integer.MIN_VALUE, Integer.MIN_VALUE);
		for (ObjectBase ob : SharedObject.getInstance().shapes) {
			if (ob.getSelectedStatic()) {
				ob.setSelected(false);
				allObjects.add(ob);

				if (ob.getPosX() < minPos.x) {
					minPos.setLocation(ob.getPosX(), minPos.y);
				}
				if ((ob.getPosX() + ob.getObjectWidth()) > maxPos.x) {
					maxPos.setLocation((ob.getPosX() + ob.getObjectWidth()), maxPos.y);
				}
				if (ob.getPosY() < minPos.y) {
					minPos.setLocation(minPos.x, ob.getPosY());
				}
				if ((ob.getPosY() + ob.getObjectHeight()) > maxPos.y) {
					maxPos.setLocation(maxPos.x, (ob.getPosY() + ob.getObjectHeight()));
				}

			}
		}

		setName(_name);
		objPoint.setLocation(minPos);
		for (ObjectBase ob : allObjects) {
			System.out.println("ob: " + ob.getName());
			allObjectShift.add(new Point(ob.getPosX() - objPoint.x, ob.getPosY() - objPoint.y));
		}
		setPosition(minPos.x, minPos.y);
		setWidth(maxPos.x - minPos.x);
		setHeight(maxPos.y - minPos.y);
		setIsGroup(true);

		SharedObject.getInstance().getDrawPanel().repaint();

	}

	public void ungroup() {
		SharedObject.getInstance().shapes.remove(this);
		SharedObject.getInstance().getDrawPanel().repaint();
	}

	@Override
	public void setPosition(int x, int y) {

		super.setPosition(x, y);
		for (ObjectBase ob : allObjects) {
			int index = allObjects.indexOf(ob);
			ob.setPosition(x + allObjectShift.get(index).x, y + allObjectShift.get(index).y);
		}
		for (LineBase lb : SharedObject.getInstance().lines) {
			lb.getPosFromUUID(lb.getSrcUUID(), lb.getDesUUID(), lb.getSrcPort(), lb.getDesPort(), allObjects);
		}
	}

	@Override
	public void paintObject(Graphics g) {
		// TODO Auto-generated method stub
	}

	@Override
	public void paintName(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.drawString(getName(), getPosX() + getObjectWidth() / 8, getPosY() + getObjectHeight() / 2);
	}

}
