/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clockyourhours.datastorage;

import org.junit.*;

import java.sql.ResultSet;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * For this test to pass a database must be present
 *
 * @author ppthgast
 */
public class DatabaseConnectionTest {

    public DatabaseConnectionTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void doConnectTest() {
        // test preparation and execution
        ResultSet rs = null;
        DatabaseConnection connection = new DatabaseConnection();
        boolean result = connection.openConnection();
        if (result) {
            rs = connection.executeSQLSelectStatement("select * from member");
        }

        // test verification
        assertTrue("database connection successfully established", result);
        assertTrue("result set no null", rs != null);
    }
}
