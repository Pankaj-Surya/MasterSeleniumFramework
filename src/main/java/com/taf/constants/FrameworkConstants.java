package com.taf.constants;

// restrict extend class
public final class FrameworkConstants {
	
	// restrict instantiation 
	private FrameworkConstants() {
		
	}

	private static final String CHROMEPATH =System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";
	
	
	public static String getChromeDriverPath() {
	  return CHROMEPATH; 	
	}
}
