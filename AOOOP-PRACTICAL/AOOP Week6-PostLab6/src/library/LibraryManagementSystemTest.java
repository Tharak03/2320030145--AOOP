package library;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class LibraryManagementSystemTest {

    @Test
    public void testBookSearchValidation() {
        BookSearchValidator searchValidator = new BookSearchValidator();
        assertTrue(searchValidator.validateSearch("Moby Dick"));
        assertFalse(searchValidator.validateSearch(""));
        assertFalse(searchValidator.validateSearch("   ")); // Test with only spaces
        assertFalse(searchValidator.validateSearch(null)); // Test with null input
        assertTrue(searchValidator.validateSearch("The Great Gatsby")); // Test with another valid book title
    }

    @Test
    public void testCatalogUpdateValidation() {
        CatalogUpdateValidator updateValidator = new CatalogUpdateValidator();
        assertTrue(updateValidator.validateUpdate("The Hobbit", "J.R.R. Tolkien"));
        assertFalse(updateValidator.validateUpdate("", "J.R.R. Tolkien"));
        assertFalse(updateValidator.validateUpdate("The Hobbit", "")); // Edge case for empty author
        assertFalse(updateValidator.validateUpdate("The Hobbit", null)); // Edge case for null author
        assertFalse(updateValidator.validateUpdate(null, "J.R.R. Tolkien")); // Edge case for null title
        assertTrue(updateValidator.validateUpdate("Harry Potter", "J.K. Rowling")); // Test with another valid entry
    }

    @Test
    public void testUserInteractionValidation() {
        UserInteractionValidator userInteractionValidator = new UserInteractionValidator();
        assertTrue(userInteractionValidator.validateUserInteraction("Borrow"));
        assertFalse(userInteractionValidator.validateUserInteraction(""));
        assertFalse(userInteractionValidator.validateUserInteraction("   ")); // Test with only spaces
        assertFalse(userInteractionValidator.validateUserInteraction(null)); // Test with null input
        assertTrue(userInteractionValidator.validateUserInteraction("Return")); // Test with another valid action
    }
}
