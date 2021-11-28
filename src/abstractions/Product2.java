package abstractions;

public class Product2 {
    int id;
    String name;
    String category;
    float salesPrice;
    float cost;
    int quantity;
    boolean active;

    Product2() {//constructor chaining
        this(1, "product", "category",
                0f, 0f, 0, false);
    }

    Product2(int id, String name, String category,
             float salesPrice, float cost, int quantity,
             boolean active) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.quantity = quantity;
        this.active = active;
    }

    Product2(Product2 product) {
        this.id = product.id;
        this.name = product.name;
        this.category = product.category;
        this.salesPrice = product.salesPrice;
        this.cost = product.cost;
        this.quantity = product.quantity;
        this.active = product.active;
    }

    float getProfitOrLoss() {
        return this.salesPrice - this.cost;
    }

    void activate() {
        this.active = true;
    }

    void deactivate() {
        this.active = false;
    }

    boolean isBelowThreshold() {
        return this.quantity < 100;
    }

    public static void main(String[] args) {
        Product2 appleMacBookAir =
                new Product2(1, "Apple MacBook Air", "Laptop",
                        80000f, 60000f, 1000, true);

        Product2 clone = new Product2(appleMacBookAir);
        System.out.println(clone.name);
        System.out.println(appleMacBookAir.name);

        clone.name = "clone";
        System.out.println(clone.name);
        System.out.println(appleMacBookAir.name);
    }
}



