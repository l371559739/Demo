package log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemo {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	// log方法
	public void log() {
		logger.info("aaa");
	}

	// main方法
	public static void main(String[] args) {
		LogbackDemo demo = new LogbackDemo();
		demo.log();
	}
}
