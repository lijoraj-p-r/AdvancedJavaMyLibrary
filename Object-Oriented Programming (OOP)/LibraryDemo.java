// Class representing a Book
class Book {
    String title;
    String author;
    int pages;

    // Method to display information about the book
    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        // Create a Book object
        Book myBook = new Book();

        // Set properties
        myBook.title = "1984";
        myBook.author = "George Orwell";
        myBook.pages = 328;

        // Call method to print book details
        myBook.displayInfo();  // Output: Title: 1984, Author: George Orwell, Pages: 328
    }
}
