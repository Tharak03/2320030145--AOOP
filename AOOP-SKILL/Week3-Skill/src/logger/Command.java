package logger;

public interface Command {
    void execute(String message, LogLevel level);
}
