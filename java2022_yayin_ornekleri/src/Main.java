
public class Main {

    public static void main(String[] args) {
        String mesaj = "Vade Oranı";

        Product product1 = new Product();
        product1.setName("Arçelik Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInStock(25);
        product1.setImageUrl("enestayboga1.jpg");

        Product product2 = new Product();
        product2.setName("Bosch Kahve Makinesi");
        product2.setDiscount(9);
        product2.setUnitPrice(1000);
        product2.setUnitInStock(25);
        product2.setImageUrl("enestayboga2.jpg");

        Product product3 = new Product();
        product3.setName("Beko Kahve Makinesi");
        product3.setDiscount(10);
        product3.setUnitPrice(4500);
        product3.setUnitInStock(25);
        product3.setImageUrl("enestayboga3.jpg");


        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }
//        //HTML Page
//        System.out.println("<ul>");
//        for (Product product : products){
//            System.out.println("<il>" + product.name + "</ik>");
//        }
//        System.out.println("</ul>");


        IndividualCustomer individualCustomer =
                new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhoneNumber("5522290644");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Enes");
        individualCustomer.setLastName("Tayboğa");

        CorporateCustomer corporateCustomer =
                new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhoneNumber("0522222222");
        corporateCustomer.setCustomerNumber("123456");
        corporateCustomer.setCompanyName("ENES LTD");
        corporateCustomer.setTaxName("651654611");

        Customer [] customers =
                {individualCustomer, corporateCustomer};

    }
}
