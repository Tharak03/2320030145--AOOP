package library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    private List<Book> catalog = new ArrayList<>();
    private List<LibraryUser> libraryUsers = new ArrayList<>();

    public static void main(String[] args) {
        LibraryManagementSystem system = new LibraryManagementSystem();
        system.run();
    }

    public void run() {
        // Initialize some data      
        catalog.add(new Book("Me Before You", "Jojo Moyes"));
        catalog.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        catalog.add(new Book("Pride and Prejudice", "Jane Austen"));
        catalog.add(new Book("War and Peace", "Leo Tolstoy"));
        catalog.add(new Book("Gone with the Wind", "Margaret Mitchell"));

        libraryUsers.add(new LibraryUser("Sreya", 101));
        libraryUsers.add(new LibraryUser("Raghu", 102));
        libraryUsers.add(new LibraryUser("Deekshita", 103));
        libraryUsers.add(new LibraryUser("Shashank", 104));
        libraryUsers.add(new LibraryUser("Shiva", 105));
        libraryUsers.add(new LibraryUser("Sai", 106));
        libraryUsers.add(new LibraryUser("Chandrika", 107));

        // Example of searching for a book
        BookSearchValidator searchValidator = new BookSearchValidator();
        String[] queries = {"The Great Gatsby", "Pride and Prejudice", "War and Peace", "The Hobbit"};
        for (String query : queries) {
            if (searchValidator.validateSearch(query)) {
                Book book = searchBook(query);
                if (book != null) {
                    System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor());
                } else {
                    System.out.println("Book not found: " + query);
                }
            } else {
                System.out.println("Invalid search query: " + query);
            }
        }

        // Updating the catalog
        CatalogUpdateValidator updateValidator = new CatalogUpdateValidator();
        String newBookTitle = "The Hobbit";
        String newBookAuthor = "J.R.R. Tolkien";
        if (updateValidator.validateUpdate(newBookTitle, newBookAuthor)) {
            catalog.add(new Book(newBookTitle, newBookAuthor));
            System.out.println("Catalog updated with: " + newBookTitle + " by " + newBookAuthor);
        } else {
            System.out.println("Invalid catalog update.");
        }

        // User interactions (borrowing and returning books)
        UserInteractionValidator userInteractionValidator = new UserInteractionValidator();
        String[] borrowActions = {"Borrow", "Borrow", "Return", "Borrow", "Return", "Borrow", "Borrow"};
        LibraryUser[] users = {libraryUsers.get(0), libraryUsers.get(1), libraryUsers.get(6), libraryUsers.get(2), libraryUsers.get(3), libraryUsers.get(5), libraryUsers.get(4)};
        String[] booksToBorrow = {catalog.get(2).getTitle(), catalog.get(0).getTitle(), "The Hobbit", catalog.get(4).getTitle(), "War and Peace", catalog.get(1).getTitle(), catalog.get(3).getTitle()};

        for (int i = 0; i < borrowActions.length; i++) {
            if (i < users.length && i < booksToBorrow.length) {
                if (userInteractionValidator.validateUserInteraction(borrowActions[i])) {
                    LibraryUser user = users[i];
                    String bookTitle = booksToBorrow[i];
                    if ("Borrow".equals(borrowActions[i])) {
                        System.out.println(user.getName() + " borrowed --> " + bookTitle);
                    } else {
                        System.out.println(user.getName() + " returned --> " + bookTitle);
                    }
                } else {
                    System.out.println("Invalid user interaction: " + borrowActions[i]);
                }
            } else {
                System.out.println("Index out of bounds. Ensure all arrays are of the same length.");
            }
        }
    }

    private Book searchBook(String title) {
        for (Book book : catalog) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
