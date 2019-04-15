public class HRDepartment implements IObserver {

    @Override
    public void callMe(Employee emp, String msg) {
        System.out.println("noticeHRD: added " + emp.getName() );
    }
}
