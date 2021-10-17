package Log4jExample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfigratorExample {
	
	static Logger logger = Logger.getLogger(BasicConfigratorExample.class);

	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		logger.debug("This is debug");
		logger.info("This is info");
		logger.warn("This is warning");
		logger.error("This is error");
		logger.fatal("This is fatal");
	}
}
