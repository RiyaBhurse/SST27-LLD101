public class DEmployeeDB {
    EmployeeDB e = new EmployeeDB();
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
