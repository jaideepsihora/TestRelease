package com.jaideep.Release;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.log4j.NDC;

public class TestReleaseMain {

	final static Logger logger =  Logger.getLogger(TestReleaseMain.class);
	
	
	 static void logSimpleMessage() {
	        // This adds a simple message to the logs
	        logger.error("This is a test");
	    }

	  private static  void logWithExtras() {
	        // MDC extras
	        MDC.put("extra_key", "extra_value");
	        // NDC extras are sent under 'log4J-NDC'
	        NDC.push("Extra_details");
	        // This adds a message with extras to the logs
	        logger.error("This is a test");
	    }

	    private static void logException() {
	        try {	
	            unsafeMethod();
	        } catch (Exception e) {
	            // This adds an exception to the logs
	            logger.error("Exception caught", e);
	        }
	    }

	    static void unsafeMethod() {
	        throw new UnsupportedOperationException("You shouldn't call that");
	    }
	
	public static void main(String[] args) {
		
		logger.error("This is a test");
		 MDC.put("extra_key", "extra_value");
	        // NDC extras are sent under 'log4J-NDC'
	        NDC.push("Extra_details");
	        // This adds a message with extras to the logs
	        logger.error("This is a test");
	        try {	
	        	throw new UnsupportedOperationException("You shouldn't call that");
	        } catch (Exception e) {
	            // This adds an exception to the logs
	            logger.error("Exception caught", e);
	        }
	        
	        logger.info("This is also test");
		
		
		
//		AerospikeClient client = new AerospikeClient("127.0.0.1", 3000);
//		
//		if(logger.isDebugEnabled()){
//		    logger.debug("This is debug");
//		}
//
//		//logs an error message with parameter
//		logger.error("This is error : " );
//
//		//logs an exception thrown from somewhere
//		logger.error("This is error");
//		
//		// Initialize policy.
//		WritePolicy policy = new WritePolicy();
//		policy.timeout = 50;  // 50 millisecond timeout
//		
//		// Write single value.
//		Key key = new Key("test", "myset", "mykey");
//		Bin bin = new Bin("mybin", "myvalue");
//		client.put(policy, key, bin);
	}
}
