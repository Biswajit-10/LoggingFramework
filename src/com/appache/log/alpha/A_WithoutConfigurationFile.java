package com.appache.log.alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class A_WithoutConfigurationFile {
	
	static Logger logger = LogManager.getLogger(A_WithoutConfigurationFile.class.getName());
	
	public static void main(String[] args) {
		logger.error("Hello error!!!");
		logger.info("Hello info!!!");
		logger.fatal("Hello fatal!!!");
		logger.warn("Hello warn!!!");
		logger.fatal("Hello fatal!!!");
	}
}
/*
 * It is now in default configuration  =>we don't have any configuration file
 * 
 * It only prints error message =>Not going to print info message
 * 
 */