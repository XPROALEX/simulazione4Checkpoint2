public class Book implements LibraryItem {
    private String title;
    private String author;
    private String isbn;
    private boolean checkedOut;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.checkedOut = true;
    }


    @Override
    public boolean checkOut() {
        return checkedOut= checkedOut==true;
    }

    @Override
    public boolean checkIn() {
        return checkedOut= !(checkedOut==true);
    }

    @Override
    public boolean isAvailable() {
        return !checkedOut;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", checkedOut=" + checkedOut +
                '}';
    }
}
