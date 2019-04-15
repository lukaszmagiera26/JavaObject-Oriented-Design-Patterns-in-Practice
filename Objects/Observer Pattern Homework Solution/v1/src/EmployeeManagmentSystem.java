import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EmployeeManagmentSystem implements ISubject {

    private  Employee employee;
    private   EmployeeDAO employeeDAO = new EmployeeDAO();
    private  String msg;
    private List<IObserver> iObservers = new ArrayList<IObserver>();
    private  List<Employee> employees;


    public EmployeeManagmentSystem() {
        this.employees = employeeDAO.getlistOfEmployee();
    }

    public void registerObserver(IObserver addObserver){
   iObservers.add(addObserver);
    }

    public void removeObserver(IObserver removeObserver){
        int removeIndex = this.iObservers.indexOf(removeObserver);
       iObservers.remove(removeIndex);
    }

   public void modifyEmployeeName(int id, String name){
        boolean notify = false;
       Iterator i1 = employees.iterator();
        while (i1.hasNext()){
            Employee emp = (Employee) i1.next();
            if(id == emp.getId()){
                this.employee = emp;
            employee.setName(name);
            notify = true;
            }
        }
if(notify) {
    this.msg = "Modify Employee name to: "  + employee.getName();
    notifyObserver();
}
    }

    public void notifyObserver(){
            Iterator I5 = iObservers.iterator();
           while(I5.hasNext()) {
                IObserver dep = (IObserver) I5.next();
                dep.callMe(employee, msg);
            }
        }

    public void hireNewE (Employee e){
employee = e;
this.msg = "NEW hire: " + e.getName();
        employees.add(e);
        notifyObserver();
    }
}
