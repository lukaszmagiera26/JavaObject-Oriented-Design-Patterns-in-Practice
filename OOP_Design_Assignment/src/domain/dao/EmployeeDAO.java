package domain.dao;

import domain.Employee;

public class EmployeeDAO {

    public EmployeeDAO() {
    }

    public void saveEmployee(Employee emp){
        System.out.println("save Employee: " + emp);
    }

    public void deleteEmployee(Employee emp){
        System.out.println("deleted Employee: " + emp);
    }

}
