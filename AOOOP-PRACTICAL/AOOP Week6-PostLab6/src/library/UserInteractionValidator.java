package library;

public class UserInteractionValidator {

    // This method checks if the user action (e.g., "Borrow") is valid.
    public boolean validateUserInteraction(String userAction) {
        // A valid user action should not be null and should not be empty.
        if (userAction != null && !userAction.trim().isEmpty()) {
            return true;
        }
        return false;
    }
}
