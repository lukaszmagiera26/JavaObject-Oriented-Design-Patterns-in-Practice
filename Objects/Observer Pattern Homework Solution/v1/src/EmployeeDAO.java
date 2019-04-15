import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    public EmployeeDAO() {
    }


    private  List<Employee> listEmployeeDAO = new ArrayList<Employee>();
    private  Employee employee1 = new Employee(1, "Peggy", 7000);
    private  Employee employee2 = new Employee(2, "Dereck", 8000);


    public  List<Employee> getlistOfEmployee (){
        listEmployeeDAO.add(employee1);
        listEmployeeDAO.add(employee2);
        return listEmployeeDAO;
    }

public void addEmployee(Employee emp){
        listEmployeeDAO.add(emp);
}



}
