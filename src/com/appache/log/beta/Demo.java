package com.appache.log.beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	
	static Logger logger = LogManager.getLogger(Demo.class.getName());
	
	public static void main(String[] args) {
		logger.error("Hello error!!!");
		logger.info("Hello info!!!");
		
	}
}
/*
 * It is now in default configuration  =>we don't have any configuration file
 * 
 * It only prints error message =>Not going to print info message
 * 
 */