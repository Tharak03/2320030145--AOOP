package logger;

public class InfoHandler extends LogHandler {
    @Override
    protected boolean canHandle(LogLevel level) {
        return level == LogLevel.INFO;
    }

    @Override
    protected void log(String message) {
        System.out.println("[INFO]: " + message);
    }
}
