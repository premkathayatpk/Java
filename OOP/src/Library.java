
class Book {
    static int totalBook;
    String title;
    String auther;
    String isbn;
    boolean isBorrowed;
    static {
        totalBook = 0;

        // Object Init
        totalBook++;
    }

    Book(String title, String auther, String isbn) {
        this.title = title;
        this.auther = auther;
        this.isbn = isbn;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalBook() {
        return totalBook;
    }

    public void borrowBook() {
        if (isBorrowed) {
            System.out.println("It is already borrowed.");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoy ");
        } else {
            System.out.println("This book is already in the liabarary.");
        }
    }

}

public class Library {
    public static void main(String[] args) {
        Book b = new Book("Math", "Ram", "123");
        Book b2 = new Book("Math", "Ram", "123");

        b.borrowBook();
        b.borrowBook();
        b.returnBook();
        b.returnBook();
        System.out.println(b.getTotalBook());

    }

}
