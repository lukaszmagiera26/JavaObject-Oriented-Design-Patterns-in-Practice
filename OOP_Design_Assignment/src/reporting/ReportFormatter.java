package reporting;

import domain.Employee;

public class ReportFormatter {

    String formattedValue;

    public ReportFormatter(Object object, FormatType formatType) {
       switch (formatType){
           case XML:
               formattedValue = convertObjectToXML(object);
               break;
           case CSV:
               formattedValue = convertObjectToCSV(object);
               break;
       }
    }

    public String convertObjectToXML(Object object){

       return "XML: <title>" + object.toString() + "</titile>";
    }

    public String convertObjectToCSV(Object object){
    return "CSV:,,," + object.toString() + ",,,";
    }

    protected String getFormattedValue() {
        return formattedValue;
    }

}
