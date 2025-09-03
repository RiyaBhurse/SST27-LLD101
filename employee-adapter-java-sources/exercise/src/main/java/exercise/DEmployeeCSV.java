public class DEmployeeCSV {
    EmployeeCSV e = new EmployeeCSV();
    String[] tokens = e.tokens();
    // new EmployeeCSV("101,John,Doe,john.doe@acme.com")
    String getId() {
        return tokens[0];
    }
    String getFirstName() {
        return tokens[1];
    }
    String getLastName() {
        return tokens[2];
    }
    String getEmail() {
        return tokens[3];
    }

}
