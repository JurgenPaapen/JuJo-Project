package clockyourhours.DataStorageLayer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

//class DatabaseConnectionTest {

//    @Test
//    void connectionIsOpen() {
//    }
//
//    @Test
//    void closeConnection() {
//    }
//
//    @Test
//    void executeSQLSelectStatement() {
//    }
//
//    @Test
//    void executeSqlDmlStatement() {
//    }

//    @Test
//    @DisplayName("Try whether connection with database can be made")
//    public void doConnectTest() {
//        // Arrange and Act
//        ResultSet rs = null;
//        DatabaseConnection connection = new DatabaseConnection();
//        boolean result = connection.openConnection();
//        if (result) {
//            rs = connection.executeSQLSelectStatement("select * from client");
//        }
//
//        // Assert
//        assertTrue("database connection successfully established", result);
//        assertTrue("result set no null", rs != null);
//    }
//}