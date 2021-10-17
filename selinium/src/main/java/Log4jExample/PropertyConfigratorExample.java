package Log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyConfigratorExample {
	
	static Logger logger = Logger.getLogger(PropertyConfigratorExample.class);

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		logger.debug("This is debug");
		logger.info("This is info");
		logger.warn("This is warning");
		logger.error("This is error");
		logger.fatal("This is fatal");
	}
}
