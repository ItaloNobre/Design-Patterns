package factory;

public abstract class  IphoneFactory {
	
	public Iphone orderIphone(String level) {
		
		Iphone device = null;
		
		device = createIphone(level);
		
		device.getHardware();
		
		
		
		
		return device;
	}
	
	protected abstract Iphone createIphone(String level);

}
