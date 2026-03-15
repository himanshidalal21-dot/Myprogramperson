import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }
}

class Library {
    ArrayList<Book> list = new ArrayList<Book>();

    void addBook(Book b) {
        list.add(b);
    }

    void removeBook(String isbn) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isbn.equals(isbn)) {
                list.remove(i);
                System.out.println("Book removed");
                return;
            }
        }
        System.out.println("Book not found");
    }

    void displayBooks() {
        for (Book b : list) {
            System.out.println(b.title + " " + b.author + " " + b.isbn);
        }
    }
}

public class Que2 {
    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java", "James", "101");
        Book b2 = new Book("Python", "Guido", "102");

        lib.addBook(b1);
        lib.addBook(b2);

        System.out.println("Books in Library:");
        lib.displayBooks();

        lib.removeBook("101");

        System.out.println("After removal:");
        lib.displayBooks();
    }
}