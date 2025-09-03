public class DEmployeeLDAP {
    EmployeeLDAP e = new EmployeeLDAP();
    String[] tokens = e.tokens();
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
