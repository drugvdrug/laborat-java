package main.lab10.oop.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import main.lab10.oop.project.object.button.ButtonFactory;
import main.lab10.oop.project.object.button.ButtonMode.buttonModeEnum;
import main.lab10.oop.project.object.listener.LineListener;
import main.lab10.oop.project.object.listener.ManuBarListener;
import main.lab10.oop.project.object.listener.ObjectListener;
import main.lab10.oop.project.object.listener.SelectListener;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class UmlEditor {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UmlEditor window = new UmlEditor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UmlEditor() {
		initialize();
	}


	private void initialize() {
		SharedObject.init();
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);

		ButtonFactory bFactory = new ButtonFactory(panel);
		bFactory.addButton(buttonModeEnum.selectMode);
		bFactory.addButton(buttonModeEnum.associationLineMode);
		bFactory.addButton(buttonModeEnum.generalizationLineMode);
		bFactory.addButton(buttonModeEnum.compositionLineMode);
		bFactory.addButton(buttonModeEnum.classMode);
		bFactory.addButton(buttonModeEnum.useCaseMode);
		bFactory.addButtonListener();

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu fileButton = new JMenu("file");
		menuBar.add(fileButton);

		JMenu editButton = new JMenu("edit");
		menuBar.add(editButton);

		ManuBarListener mbl = new ManuBarListener();

		JMenuItem groupButton = new JMenuItem("group");
		groupButton.addActionListener(mbl);
		editButton.add(groupButton);

		JMenuItem ungroupButton = new JMenuItem("ungroup");
		ungroupButton.addActionListener(mbl);
		editButton.add(ungroupButton);

		JMenuItem changeNameButton = new JMenuItem("change name");
		changeNameButton.addActionListener(mbl);
		editButton.add(changeNameButton);

		DrawPanel layeredPanel = new DrawPanel();

		frame.getContentPane().add(layeredPanel, BorderLayout.CENTER);

		layeredPanel.addMouseListener(new ObjectListener());
		layeredPanel.addMouseListener(new LineListener());
		SelectListener SL = new SelectListener();
		layeredPanel.addMouseListener(SL);
		layeredPanel.addMouseMotionListener(SL);

		SharedObject.getInstance().setFrameJPanel(panel);
		SharedObject.getInstance().setDrawPanel(layeredPanel);

	}

}
