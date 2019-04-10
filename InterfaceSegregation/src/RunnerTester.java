import java.util.ArrayList;
import java.util.List;

public class RunnerTester {
    public static void main(String[] args) {
        String aa = "aa";

        int a = 5;
        String a1 = "namea";

        int a2 = 7;
        String a3 = "Peter";

        int a4 = 8;
        String a5 = "zz";

        Customer customer = new Customer();
        customer.setName(aa);

        Product product = new Product();
        product.setProductId(a);
        product.setProductName(a1);

        Product product2 = new Product();
        product2.setProductId(a2);
        product2.setProductName(a3);

        Product product3 = new Product();
        product3.setProductId(a4);
        product3.setProductName(a5);


        List<Product> listp = new ArrayList<>();
        listp.add(product);
        listp.add(product2);
        listp.add(product3);

        CustomerTransaction customerTransaction = new CustomerTransaction(customer, listp);
        System.out.println(customerTransaction.getDate());
        System.out.println(customerTransaction.getName());
        System.out.println(customerTransaction.productBreakDown());
        customerTransaction.prepareInvoice();

        Accounting abc = new CustomerTransaction(customer, listp);
        abc.prepareInvoice();
        AccountsReceivable abc2 = new AccountsReceivable(abc);
        abc2.sendInvoice();

        Reporting abc4 = new CustomerTransaction(customer, listp);
        ReportGenerator ra = new ReportGenerator(abc4);
        ra.generateReport();
        System.out.println(customerTransaction.productList());
        System.out.println("2"+customerTransaction.productBreakDown());
    }
}
