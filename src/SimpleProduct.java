public class SimpleProduct extends Product {
    protected String city;


    public SimpleProduct(int id, String title, int rating, String city) {
        super(id, title, rating);
        this.city = city;
    }
}
