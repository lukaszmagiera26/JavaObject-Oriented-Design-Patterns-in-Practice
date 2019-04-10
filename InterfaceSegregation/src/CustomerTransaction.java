//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {
    private List<Product> products;
    private Customer customer;

    public CustomerTransaction(Customer customer, List<Product> products) {
        this.products = products;
        this.customer = customer;
    }

    public String getName() {
        return this.customer.getName();
    }

    public Date getDate() {
        return new Date();
    }

    public String productBreakDown() {
        String reportListing = null;

        Product product;
        for(Iterator var3 = this.products.iterator(); var3.hasNext(); reportListing = reportListing + product.getProductName()) {
            product = (Product)var3.next();
        }

        return reportListing;
    }

    public   String productList(){
        String productList = null;
        for (Product product :  products){
            productList += product.getProductName();
        }
        return productList;
    }

    public void prepareInvoice() {
        System.out.println("invoice prepared...");

    }

    public void chargeCustomer() {
        System.out.println("charged the customer");
    }



}