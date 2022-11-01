package SimpleFactory;

public class Client {
	public static void main(String[] args) {

		Iphone iphone = IphoneSimpleFactory.orderIphone("x", "standard");

		System.out.println(iphone);
	}
}
