package logger;

public class ClientDemo {
    public static void main(String[] args) {
        // Create handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        // Set up chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create Logger instance
        Logger logger = new Logger();

        // Create and add commands with different log levels
        logger.addCommand(new LogCommand(infoHandler) {
            @Override
            public void execute(String message, LogLevel level) {
                level = LogLevel.INFO; // Set to INFO level
                super.execute(message, level);
            }
        });

        logger.addCommand(new LogCommand(infoHandler) {
            @Override
            public void execute(String message, LogLevel level) {
                level = LogLevel.DEBUG; // Set to DEBUG level
                super.execute(message, level);
            }
        });

        logger.addCommand(new LogCommand(infoHandler) {
            @Override
            public void execute(String message, LogLevel level) {
                level = LogLevel.ERROR; // Set to ERROR level
                super.execute(message, level);
            }
        });

        // Process commands
        logger.processCommands();
    }
}
