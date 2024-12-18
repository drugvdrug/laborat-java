package main.lab10.oop.project.object.button;

public class ButtonMode {
	private static ButtonMode instance;

	public static ButtonMode getInstance() {
		if (instance == null) {
			instance = new ButtonMode();
		}
		return instance;
	}

	public enum buttonModeEnum {
		selectMode, associationLineMode, generalizationLineMode, compositionLineMode, classMode, useCaseMode, nullMode
	}

	private buttonModeEnum buttonMode = buttonModeEnum.nullMode;

	public buttonModeEnum getMode() {
		return buttonMode;
	}

	public void setMode(buttonModeEnum _mode) {
		buttonMode = _mode;
	}
}
