package abstractions;

public class Customer2 {
    int id;

    String addressStreet;
    String addressCity;
    String addressState;

    String contactName;
    String contactPhone;
    String contactEmail;

    int transactionCount;

    Customer2() {//no parameter constructor
        System.out.println("Customer Object Created.");
    }

    Customer2(int _id, String _addressStreet, String _addressCity, String _addressState,
              String _contactName, String _contactPhone, String _contactEmail,
              int _transactionCount) {//parametrized constructor
        id = _id;
        addressStreet = _addressStreet;
        addressCity = _addressCity;
        addressState = _addressState;
        contactName = _contactName;
        contactPhone = _contactPhone;
        contactEmail = _contactEmail;
        transactionCount = _transactionCount;
    }

    Customer2(Customer2 customer) {//copy constructor
        id = customer.id;
        addressStreet = customer.addressStreet;
        addressCity = customer.addressCity;
        addressState = customer.addressState;
        contactName = customer.contactName;
        contactPhone = customer.contactPhone;
        contactEmail = customer.contactEmail;
        transactionCount = customer.transactionCount;
    }

    String getAddressDetails() {
        return addressStreet + ", " + addressCity + ", " + addressState;
    }

    String getContactDetails() {
        return contactName + ", " + contactPhone + ", " + contactEmail;
    }

    int getTransactionCount() {
        return transactionCount;
    }

    float calculateDiscount() {
        float discount = transactionCount * 0.1f;
        return discount <= 10.0f ? discount : 10.0f;
    }

    public static void main(String[] args) {
        Customer2 customer =
                new Customer2(1, "2nd street", "Bengaluru",
                        "Karnataka", "Srishti Gupta",
                        "9090909090", "srishti.gupta@gmail.com", 10);//object one

        Customer2 customer1 = new Customer2(customer);//object 2

        System.out.println(customer.contactName);
        System.out.println(customer1.contactName);

        customer1.contactName = "default name";

        System.out.println(customer.contactName);
        System.out.println(customer1.contactName);
    }
}

