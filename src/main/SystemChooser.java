package main;

import observerPattern.Observable;

public final class SystemChooser extends Observable {
	
	public static SystemChooser ISTANCE = null;

	public static SystemChooser getIstance(int state) {
		if (ISTANCE == null)
			ISTANCE = new SystemChooser(state);
		return ISTANCE;
	}

	private SystemChooser(int state) {
		this.state = state;
		checkState();
	}

	@Override
	public void setState(int state) {
		this.state = state;
		checkState();
		notifyObservers();
	}

	private void checkState() {
		if (this.state < 0 || this.state > 2)
			this.state = 0;
	}
	
}
