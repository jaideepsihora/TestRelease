package com.jaideep.Release;

public class TestReleaseMain {

	
	
	 static void logSimpleMessage() {
	        // This adds a simple message to the logs
		 // just adding comment to see jsch version getting used
		 // during maven release pushing of tag information to git
	    }

	  private static  void logWithExtras() {
	        // MDC extras
	    }

	    private static void logException() {
	        try {	
	            unsafeMethod();
	        } catch (Exception e) {
	            // This adds an exception to the logs
	        }
	    }

	    static void unsafeMethod() {
	        throw new UnsupportedOperationException("You shouldn't call that");
	    }
	
	public static void main(String[] args) {
		
	        // NDC extras are sent under 'log4J-NDC'
	        // This adds a message with extras to the logs
	        try {	
	        	throw new UnsupportedOperationException("You shouldn't call that");
	        } catch (Exception e) {
	            // This adds an exception to the logs
	        }
	        
		
		
		
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
