package Log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XmlConfiguratorExample {

	static Logger logger = Logger.getLogger(XmlConfiguratorExample.class);

	public static void main(String[] args) {

		DOMConfigurator.configure("log4j.xml");

		logger.debug("This is debug");
		logger.info("This is info");
		logger.warn("This is warning");
		logger.error("This is error");
		logger.fatal("This is fatal");

	}

}
