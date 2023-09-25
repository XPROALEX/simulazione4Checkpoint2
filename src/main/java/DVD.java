public class DVD implements LibraryItem {
    private String title;
    private String director;
    private int releaseYear;
    private boolean checkedOut;

    public DVD(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.checkedOut=true;
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
        return "DVD{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +
                ", checkedOut=" + checkedOut +
                '}';
    }
}