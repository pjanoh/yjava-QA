public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Collection col = new Collection(100, "Гарри Поттер");
        shop.add(col);

        CollectionItem item1 = new CollectionItem(
                1,
                "Гарри Поттер и философский камень",
                5,
                100,
                "Спб"
        );
        shop.add(item1);


        CollectionItem item2 = new CollectionItem(
                2,
                "Гарри Поттер и тайная комната",
                4,
                100,
                "Москва"
        );
        shop.add(item2);
    }
}
