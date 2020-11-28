package homeWork1;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;



public class LoggerApplication {
	private static Logger LOG = Logger.getLogger(LoggerApplication.class);

	public static void main(String[] args) {
		logWithDomConfigurator();

	}

	public static void logWithDomConfigurator() {
		DOMConfigurator.configure("loggerConfigMy.xml");

//		LOG.trace("TRACE Logger message of project");
		LOG.debug("Debug Logger message of project");
		LOG.info("Info Logger message of project");
		LOG.warn("Warn Logger message of project");
		LOG.error("ERROR Logger message of project");
//		LOG.fatal("FATAL Logger message of project");
	}
}
