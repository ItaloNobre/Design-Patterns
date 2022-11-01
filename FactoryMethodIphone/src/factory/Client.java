package factory;

public class Client {
		public static void main(String[] args) {
			
		
	IphoneFactory iphone11FactoryPro = new Iphone11Factory();
	Iphone iphone11Pro = iphone11FactoryPro.orderIphone("highend");
	
	IphoneFactory iphone11Factory = new Iphone11Factory();
	Iphone iphone11 = iphone11Factory.orderIphone("standard");
	
	IphoneFactory iphoneXFactory = new IphoneXFactory();
	Iphone iphoneX = iphoneXFactory.orderIphone("standard");
	
	
	
	System.out.println(iphone11Pro.getHardware());
	System.out.println(iphone11.getHardware());
	System.out.println(iphoneX.getHardware());
		}
}
