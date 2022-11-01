package factory;

public class IphoneXFactory extends IphoneFactory {

	@Override
	protected Iphone createIphone(String level) {
		if (level.equalsIgnoreCase("standard")) {
			
			return new IphoneX();
			
		}else if(level.equalsIgnoreCase("highEnd")) {

			return new IphoneXPro();
			
		}else {
			return null;
		}
		
		
	}

}
