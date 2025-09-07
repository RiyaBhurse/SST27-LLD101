package exercise;

public class DEmployeeCSV implements Employee {
    EmployeeCSV e;
    public DEmployeeCSV(EmployeeCSV e) {
        this.e = e;
    }
    String[] tokens = e.tokens();
    // new EmployeeCSV("101,John,Doe,john.doe@acme.com")
    public String getId() {
        return tokens[0];
    }
    public String getFirstName() {
        return tokens[1];
    }
    public String getLastName() {
        return tokens[2];
    }
    public String getEmail() {
        return tokens[3];
    }

}