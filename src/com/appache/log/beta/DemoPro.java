package com.appache.log.beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoPro {
		public static void main(String[] args) throws Exception {
			
			Logger logger = LogManager.getLogger(DemoPro.class.getName());
			
			logger.info("Start");
			Thread.sleep(500);
			logger.info("Mumbai");
			Thread.sleep(500);
			logger.info("Bangalore");
			Thread.sleep(500);
			logger.info("Hyderabad");
			Thread.sleep(500);
			logger.info("Bhubaneswar");
			Thread.sleep(500);
			logger.info("Delhi");
			Thread.sleep(500);
			logger.info("Mysore");
			Thread.sleep(500);
			logger.info("Pune");
			Thread.sleep(500);
			logger.info("Navi Mumbai");
			Thread.sleep(500);
			logger.info("Goa");
			Thread.sleep(500);
			logger.info("Kolkata");
			Thread.sleep(500);
			logger.info("Odisha");
			Thread.sleep(500);
			logger.info("Vizag\n\n");
			Thread.sleep(500);
			
		}
		
}
