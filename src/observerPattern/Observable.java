package observerPattern;

import java.util.ArrayList;

public abstract class Observable {
	
	protected int state = 0;

	public ArrayList<Observer> observers = new ArrayList<Observer>();

	protected void notifyObservers() {
		for (Observer obs : observers)
			obs.update();
	}

	public void attach(Observer obs) {
		this.observers.add(obs);
	}

	public void detach(Observer obs) {
		this.observers.remove(obs);
	}

	public int getState() {
		return this.state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyObservers();
	}
	
}
