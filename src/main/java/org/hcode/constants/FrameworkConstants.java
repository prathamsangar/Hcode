package org.hcode.constants;

public final class FrameworkConstants {

	private FrameworkConstants() {}

	//	Chromepath

	private static final String chromDriverPath = System.getProperty("user.dir")+"/src/test/resources/Executables/chromedriver.exe";

	public static String getChromedriverpath() {
		return chromDriverPath;
	}

}
