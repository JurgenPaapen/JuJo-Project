package clockyourhours.DataStorageLayer;

import java.sql.ResultSet;
import java.sql.Statement;

public class ClientRegistrationDAO {

    public static void addProjectToDatabase(String query) {
        try {
            DatabaseConnection connection = new DatabaseConnection();
            connection.openConnection();
            connection.executeSqlDmlStatement(query);
            connection.closeConnection();
        } catch (Exception e) {
            System.out.println("oeps");
            System.out.println(e.getMessage());

        }
    }
}