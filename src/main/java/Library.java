import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {
    private String libraryName;
    Map<String, LibraryItem> catalog;
    Set<LibraryItem> checkedOutItems;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.catalog = new HashMap<>();
        this.checkedOutItems = new HashSet<>();
    }

    public void addItems(String itemName, LibraryItem item) {
        catalog.put(itemName, item);
    }

    public boolean checkOutItem(String itemName) {
        if (catalog.containsKey(itemName)) {
            checkedOutItems.add(catalog.get(itemName));
            catalog.remove(itemName);
        }
        return false;
    }

    public boolean checkInItem(String itemName, LibraryItem item) {
        if (checkedOutItems.contains(itemName)) {
            catalog.put(itemName, item);
            checkedOutItems.remove(itemName);
        }
        return false;
    }

    public void listCatalog() {
        System.out.println("Catalog of " +libraryName);
        catalog.forEach((key, values) -> {
            System.out.println(key+" "+values);
        });
    }

    public Set<LibraryItem> getCheckedOutItems() {
        return checkedOutItems;
    }
}

