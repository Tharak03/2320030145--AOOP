package logger;

public abstract class LogHandler {
    protected LogHandler nextHandler;

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(String message, LogLevel level) {
        if (canHandle(level)) {
            log(message);
        } else if (nextHandler != null) {
            nextHandler.handle(message, level);
        }
    }

    protected abstract boolean canHandle(LogLevel level);

    protected abstract void log(String message);
}
