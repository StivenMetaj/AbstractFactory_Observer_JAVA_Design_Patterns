package main;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.Product;

public final class MacOsFactory implements AbstractFactory {

	public static MacOsFactory ISTANCE = null;

	public static MacOsFactory getIstance() {
		if (ISTANCE == null)
			ISTANCE = new MacOsFactory();
		return ISTANCE;
	}

	private MacOsFactory() {

	}

	@Override
	public Product createProd() {
		return new MacOsGUI();
	}

}
