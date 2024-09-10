package logger;

public class DebugHandler extends LogHandler {
    @Override
    protected boolean canHandle(LogLevel level) {
        return level == LogLevel.DEBUG;
    }

    @Override
    protected void log(String message) {
        System.out.println("[DEBUG]: " + message);
    }
}
