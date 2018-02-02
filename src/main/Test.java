package main;

import observerPattern.*;

public class Test {

	public static void main(String[] args) {
		int state = 0;
		Observable sub = SystemChooser.getIstance(state);
		Observer factoryChooser = FactoryChooser.getIstance(sub);
		System.out.println("Lo stato di sub è uguale a " + sub.getState());
		System.out.println(((FactoryChooser) factoryChooser).getProd().toString());

		sub.setState(1);
		System.out.println("Lo stato di sub è uguale a " + sub.getState());
		System.out.println(((FactoryChooser) factoryChooser).getProd().toString());
		
		sub.setState(2);
		System.out.println("Lo stato di sub è uguale a " + sub.getState());
		System.out.println(((FactoryChooser) factoryChooser).getProd().toString());

	}

}
