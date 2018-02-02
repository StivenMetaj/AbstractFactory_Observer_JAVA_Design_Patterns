package main;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.Product;

public final class WindowsFactory implements AbstractFactory {

	public static WindowsFactory ISTANCE = null;

	public static WindowsFactory getIstance() {
		if (ISTANCE == null)
			ISTANCE = new WindowsFactory();
		return ISTANCE;
	}

	private WindowsFactory() {

	}

	@Override
	public Product createProd() {
		return new WindowsGUI();
	}

}
