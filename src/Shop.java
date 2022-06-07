import java.util.HashMap;

public class Shop {
    private HashMap<Integer, SimpleProduct> simpleProducts = new HashMap<>();
    private HashMap<Integer, Collection> collections = new HashMap<>();
    private HashMap<Integer, CollectionItem> items = new HashMap<>();

    public void add(SimpleProduct product) {
        simpleProducts.put(product.getId(), product);
    }

    public void add(Collection product) {
        collections.put(product.getId(), product);
    }

    public void add(CollectionItem product) {
        items.put(product.getId(), product);

        int colId = product.getCollectionId();
        Collection col = collections.get(colId);
        col.addItem(product.getId());

        updateCollectionRating(col);
    }

    public void removeSimpleById(int id) {
        simpleProducts.remove(id);
    }

    public void removeCollectionById(int id) {
        Collection col = collections.get(id);
        collections.remove(id);

        for (int itemId : col.getItems()) {
            items.remove(itemId);
        }
    }

    public void update(SimpleProduct product) {
        simpleProducts.put(product.getId(), product);
    }

    public void update(CollectionItem item) {
        items.put(item.getId(), item);

        updateCollectionRating(collections.get(item.getCollectionId()));
    }

    private void updateCollectionRating(Collection col) {
        int ratingTotal = 0;
        for (int itemId : col.getItems()) {
            CollectionItem item = items.get(itemId);
            ratingTotal += item.getRating();
        }

        col.setRating(ratingTotal / col.getItems().size());
    }
}
