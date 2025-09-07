package exercise;

public class DEmployeeDB implements Employee {
    EmployeeDB e;
    public DEmployeeDB(EmployeeDB e) {
        this.e = e;
    }
    //  new EmployeeDB(201, "Ravi", "Kumar", "ravi.kumar@contoso.com")
    String[] tokens = { String.valueOf(e.getId()), e.getFirstName(), e.getSurname(), e.getEmailAddress() };

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