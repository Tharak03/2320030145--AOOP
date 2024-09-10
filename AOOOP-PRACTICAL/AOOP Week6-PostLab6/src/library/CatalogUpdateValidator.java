package library;

public class CatalogUpdateValidator {

    // This method checks if the book title and author are valid.
    public boolean validateUpdate(String bookTitle, String author) {
        // A valid book title and author should not be null and should not be empty.
        if (bookTitle != null && !bookTitle.trim().isEmpty() && 
            author != null && !author.trim().isEmpty()) {
            return true;
        }
        return false;
    }
}
