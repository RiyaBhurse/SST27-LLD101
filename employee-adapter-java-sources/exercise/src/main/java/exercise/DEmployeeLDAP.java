package exercise;

public class DEmployeeLDAP implements Employee {
    EmployeeLDAP e;
    public DEmployeeLDAP(EmployeeLDAP e) {
        this.e = e;
    }
    String[] tokens = { e.get("uid"), e.get("givenName"), e.get("sn"), e.get("mail") };
    // new EmployeeLDAP(Map.of("uid","301
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