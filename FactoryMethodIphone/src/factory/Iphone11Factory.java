package factory;

public class Iphone11Factory extends IphoneFactory{

	@Override
	protected Iphone createIphone(String level) {
		if (level.equalsIgnoreCase("standard")) {

			return new Iphone11();
			
		}else if(level.equalsIgnoreCase("highEnd")) {
			
			return new Iphone11Pro();
			
		}else {
			return null;
		}
		
		
	}

}
