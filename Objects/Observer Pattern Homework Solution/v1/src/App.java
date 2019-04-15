import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {


EmployeeManagmentSystem employeeManagmentSystem = new EmployeeManagmentSystem();
IObserver payrollDepartment = new PayrollDepartment();
HRDepartment hrDepartment = new HRDepartment();

employeeManagmentSystem.registerObserver(payrollDepartment);
employeeManagmentSystem.hireNewE(new Employee(3, "Susan", 7000));
employeeManagmentSystem.modifyEmployeeName(2,"Stt");
//employeeManagmentSystem.notifyObserver();

    }



}
