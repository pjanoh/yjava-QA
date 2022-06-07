import java.util.ArrayList;

public class Collection extends Product {
    protected ArrayList<Integer> items = new ArrayList<>();

    public Collection(int id, String title) {
        super(id, title, 0);
    }

    public void addItem(int itemId) {
        items.add(itemId);
    }

    public ArrayList<Integer> getItems() {
        return items;
    }
}
