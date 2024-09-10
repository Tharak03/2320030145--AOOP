package com.Logger;

public class Logger1 {
	
	private static Logger1 instance;

    private Logger1() {
    }
    public static synchronized Logger1 getInstance() {
        if (instance == null) {
            instance = new Logger1();
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("Logging message: " + message);
    }

	public static void main(String[] args) {
		Logger1 logger = Logger1.getInstance();
        logger.log("This is a log message.");

        Logger1 anotherLogger = Logger1.getInstance();
        anotherLogger.log("This is another log message.");

        System.out.println("Are both loggers the same instance? " + (logger == anotherLogger));
	}

}


