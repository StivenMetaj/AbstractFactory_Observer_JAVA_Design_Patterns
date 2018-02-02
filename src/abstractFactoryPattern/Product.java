package abstractFactoryPattern;

public abstract class Product {
	
	protected String state;

	@Override
	public String toString() {
		return "Product's type : " + state + "\n";
	}
	
}
