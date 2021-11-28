package abstractions;

public class Product1 {

        int id;
        String name;
        String category;
        float salesPrice;
        float cost;
        int quantity;
        boolean active;
        Product1 (int _id, String _name, String _category,
                  float _salesPrice, float _cost, int _quantity,
                  boolean _active) {//parametrized constructor
            id = _id;
            name = _name;
            category = _category;
            salesPrice = _salesPrice;
            cost = _cost;
            quantity = _quantity;
            active = _active;
        }

        Product1 (Product1 product) {//copy constructor
            id = product.id;
            name = product.name;
            category = product.category;
            salesPrice = product.salesPrice;
            cost = product.cost;
            quantity = product.quantity;
            active = product.active;
        }

        float getProfitOrLoss() {//methods
            return salesPrice - cost;
        }
        void activate() {
            active = true;
        }
        void deactivate() {
            active = false;
        }
        boolean isBelowThreshold() {
            return quantity < 100;
        }

        public static void main(String[] args) {
            Product1 appleMacBookAir =
                    new Product1(1, "Apple MacBook Air", "Laptop",
                            80000f, 60000f, 1000, true);//object1

            Product1 clone = new Product1(appleMacBookAir);//object2
            System.out.println(clone.name);
            System.out.println(appleMacBookAir.name);

            clone.name = "clone";
            System.out.println(clone.name);
            System.out.println(appleMacBookAir.name);
            System.out.println(appleMacBookAir.active);
            appleMacBookAir.deactivate();
            System.out.println(appleMacBookAir.active);
            System.out.println(appleMacBookAir.getProfitOrLoss());
        }
    }




