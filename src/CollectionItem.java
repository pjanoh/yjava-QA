public class CollectionItem extends Product {
    protected int collectionId;
    protected String city;

    public CollectionItem(int id, String title, int rating, int collectionId, String city) {
        super(id, title, rating);
        this.city = city;
        this.collectionId = collectionId;
    }

    public int getCollectionId() {
        return collectionId;
    }
}
