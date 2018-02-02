package main;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.Product;

public final class LinuxFactory implements AbstractFactory {

	public static LinuxFactory ISTANCE = null;

	public static LinuxFactory getIstance() {
		if (ISTANCE == null)
			ISTANCE = new LinuxFactory();
		return ISTANCE;
	}

	private LinuxFactory() {

	}

	@Override
	public Product createProd() {
		return new LinuxGUI();
	}

}