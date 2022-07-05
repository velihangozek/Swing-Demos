import java.sql.*;

public class DbHelper {
    private String userName = "root";
    private String password = "mN0_aS7-xF";
    private String dbUrl = "jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";
    
    public Connection getConnection() throws SQLException {
//        try {
//            return DriverManager.getConnection(dbUrl, userName, password);
//        } catch (SQLException sqlException) {
//            sqlException.getMessage();
//        }     
            return DriverManager.getConnection(dbUrl, userName, password);
    }
    
    public void showErrorMessage(SQLException sqlException) { // For logging.
        System.out.println("Error : " + sqlException.getMessage());
        System.out.println("Error code : " + sqlException.getErrorCode());
    }
}

