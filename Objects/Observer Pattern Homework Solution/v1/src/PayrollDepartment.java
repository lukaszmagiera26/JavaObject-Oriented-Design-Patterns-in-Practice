

public class PayrollDepartment implements IObserver {


    @Override
    public void callMe(Employee emp, String msg) {

        System.out.println("INFO: "  + msg);
    }
}
