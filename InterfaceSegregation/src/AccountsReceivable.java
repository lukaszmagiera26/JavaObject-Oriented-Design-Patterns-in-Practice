//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class AccountsReceivable {
    private Accounting transactionObject;

    public AccountsReceivable(Accounting aTransaction) {
        this.transactionObject = aTransaction;
    }

    public void postPayment() {
        this.transactionObject.chargeCustomer();
    }

    public void sendInvoice() {
        this.transactionObject.prepareInvoice();
    }
}
