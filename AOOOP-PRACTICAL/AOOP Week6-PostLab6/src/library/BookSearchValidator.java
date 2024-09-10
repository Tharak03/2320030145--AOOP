package library;

public class BookSearchValidator {

    // This method checks if the search query is valid.
    public boolean validateSearch(String query) {
        // A valid query should not be null and should not be empty.
        if (query != null && !query.trim().isEmpty()) {
            return true;
        }
        return false;
    }
}
