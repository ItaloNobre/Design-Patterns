package SimpleFactory;

public class IphoneSimpleFactory {

	public static Iphone orderIphone(String modelo, String level) {

		Iphone device = null;

		if ("11".equalsIgnoreCase(modelo)) {
			if ("standard".equalsIgnoreCase(level)) {
				device = new Iphone11();
			} else if ("hightend".equalsIgnoreCase(level)) {
				device = new Iphone11Pro();
			}
		} else if ("X".equalsIgnoreCase(modelo)) {
			if ("standard".equalsIgnoreCase(level)) {
				device = new IphoneX();
			} else if ("hightend".equalsIgnoreCase(level)) {
				device = new IphoneXPro();

			}
		}

		if (device != null) {
			device.getHardware();
			device.assemble();
			device.certificates();
			device.pack();

		}

		return device;
	}
}
