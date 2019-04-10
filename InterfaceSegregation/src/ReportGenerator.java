//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


public class ReportGenerator {
    private Reporting transactionObject;

    public ReportGenerator(Reporting transactionObject) {
        this.transactionObject = transactionObject;
    }

    public void generateReport() {

        System.out.println(this.transactionObject.getName() + " " + this.transactionObject.productBreakDown() + " " + this.transactionObject.getDate());
    }
}
