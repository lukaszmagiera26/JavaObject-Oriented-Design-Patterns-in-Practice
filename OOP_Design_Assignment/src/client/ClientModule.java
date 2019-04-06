package client;

import domain.Employee;
import domain.dao.EmployeeDAO;
import reporting.EmployeeRaportFormatter;
import reporting.FormatType;

import static reporting.FormatType.XML;


public class ClientModule {

    public static void main(String[] args) {
        Employee peggy = new Employee(1, "Peggy", "R%D", true);
        hireNewEmployee(peggy);
        printEmployeeReport(peggy, XML);

    }

    public static void hireNewEmployee(Employee emp){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(emp);
    }
    public static void terminateEmployee(Employee emp){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(emp);
    }

    public static void printEmployeeReport(Employee emp, FormatType formatType){
       EmployeeRaportFormatter formatter = new EmployeeRaportFormatter(emp, formatType);
        System.out.println(formatter.getFormatedEmployee());

    }

}
