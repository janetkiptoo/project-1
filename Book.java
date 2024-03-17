import java.util.Arrays;

public class Book {
    private String title;
    private String author;
    private int year;

    // Constructor to set all attributes during object instantiation
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getter methods for each attribute
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        // Create an array named library that can store five Book objects
        Book[] library = new Book[5];

        // Instantiate five Book objects with different titles, authors, and publication
        // years
        library[0] = new Book("The Catcher in the Rye", "J.D. Salinger", 1953);
        library[1] = new Book("To Kill a Mockingbird", "Harper Lee", 1934);
        library[2] = new Book("1984", "George Orwell", 1949);
        library[3] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        library[4] = new Book("The Odyssey", "Homer", -1980); // Approximate year of composition

        // Loop to traverse the library array
        for (Book book : library) {
            // Print out the details of each book in the specified format
            System.out.println(
                    "Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Year: " + book.getYear());
        }
    }
}