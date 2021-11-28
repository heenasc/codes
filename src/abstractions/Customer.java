package abstractions;

public class Customer {
    int id;

    String addressStreet;
    String addressCity;
    String addressState;

    String contactName;
    String contactPhone;
    String contactEmail;

    int transactionCount;

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
        Customer customer = new Customer();

        customer.id = 1;
        customer.addressStreet = "2nd street";
        customer.addressCity = "Bengaluru";
        customer.addressState = "Karnataka";
        customer.contactName = "Srishti Gupta";
        customer.contactPhone = "9090909090";
        customer.contactEmail = "srishti.gupta@gmail.com";
        customer.transactionCount = 10;

        System.out.println(customer.contactName);
        System.out.println(customer.getAddressDetails());
        System.out.println(customer.calculateDiscount());
    }
}


