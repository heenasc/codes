package abstractions;

public class Product {
        int id;
        String name;
        String category;
        float salesPrice;
        float cost;
        int quantity;
        boolean active;

        Product () {//no parameter constructor
            System.out.println("Created Product Object");
            id = 1;
            name = "default name";
            category = "default category";
        }
        Product (int _id, String _name, String _category,
                 float _salesPrice, float _cost, int _quantity,
                 boolean _active) {//parametrized constructeor
            id = _id;
            name = _name;
            category = _category;
            salesPrice = _salesPrice;
            cost = _cost;
            quantity = _quantity;
            active = _active;
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
            // write your code here
            Product appleMacBookAir = new Product();//object1
            Product clone = new Product(1, "Apple MacBook Air", "Laptop",
                    80000f, 60000f, 1000, true);//object2

            appleMacBookAir.id = 1;
            appleMacBookAir.name = "Apple MacBook Air";
            appleMacBookAir.category = "Laptop";
            appleMacBookAir.salesPrice = 80000f;
            appleMacBookAir.cost = 60000f;
            appleMacBookAir.quantity = 1000;
            appleMacBookAir.active = true;

            System.out.println(clone.name);
            System.out.println(appleMacBookAir.active);
            appleMacBookAir.deactivate();
            System.out.println(appleMacBookAir.active);
            System.out.println(appleMacBookAir.getProfitOrLoss());

        }
    }




