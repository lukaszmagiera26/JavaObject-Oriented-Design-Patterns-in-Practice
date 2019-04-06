package reporting;


import domain.Employee;

public class EmployeeRaportFormatter extends ReportFormatter {



    public EmployeeRaportFormatter(Employee employee, FormatType formatType) {
   super(employee, formatType);
    }

    public String getFormatedEmployee() {
        return getFormattedValue();
    }
}
