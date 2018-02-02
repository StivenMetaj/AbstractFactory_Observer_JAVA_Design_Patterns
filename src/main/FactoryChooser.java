package main;

import abstractFactoryPattern.*;
import observerPattern.*;

public final class FactoryChooser implements Observer {

	private int systemCode;
	private AbstractFactory factory;
	private Product prod;
	private Observable subject;
	public static FactoryChooser ISTANCE = null;

	public static FactoryChooser getIstance(Observable sub) {
		if (ISTANCE == null)
			ISTANCE = new FactoryChooser(sub);
		return ISTANCE;
	}

	private FactoryChooser(Observable sub) {
		this.subject = sub;
		this.subject.attach(this);
		update();
	}

	@Override
	public void update() {
		this.systemCode = this.subject.getState();
		this.factory = this.createFactory();
		this.prod = this.factory.createProd();

	}

	@Override
	public int getState() {
		return this.systemCode;
	}

	private AbstractFactory createFactory() {
		if (systemCode == 0)
			return WindowsFactory.getIstance();
		if (systemCode == 1)
			return  MacOsFactory.getIstance();
		else
			return LinuxFactory.getIstance();
	}

	public AbstractFactory getFactory() {
		return this.factory;
	}

	public Product getProd() {
		return this.prod;
	}

}
