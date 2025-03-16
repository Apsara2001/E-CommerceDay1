public class eight {
    public static void main(String[] args) {
        RetailStore store = new RetailStore();

        store.addProduct(new Fruit("Apple", 100, 8));
        store.addProduct(new Vegetable("Carrot", 300, 7));
        store.addProduct(new Grocery("Flour", 246, 3));

        store.displayProducts();

        store.editProduct(0, "Apple", 150, 10);

        System.out.println("\nAfter editing Apple:");
        store.displayProducts();

        store.deleteProduct(1);

        System.out.println("\nAfter deleting Carrot:");
        store.displayProducts();
    }
}