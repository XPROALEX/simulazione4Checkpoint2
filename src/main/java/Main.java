public class Main {
    public static void main(String[] args) {
        Library myLib=new Library("My Lib");
        Book book1 = new Book("Book1", "Author1", "ISBN1");
        Book book2 = new Book("Book2", "Author2", "ISBN2");
        DVD dvd1 = new DVD("DVD1", "Director1", 2020);
        DVD dvd2 = new DVD("DVD2", "Director2", 2019);
        myLib.addItems("book1",book1);
        myLib.addItems("book2",book2);
        myLib.addItems("DVD1",dvd1);
        myLib.addItems("DVD2",dvd2);
        myLib.listCatalog();
        System.out.println(myLib.checkOutItem("DVD1"));
       myLib.listCatalog();
    }
}
