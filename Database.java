import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	Connection con;

	Database(String dbName, String username, String password) {
		
		// this URL is used to find the database (that might be running on a server, your computer, etc.)
		String url = "jdbc:mysql://localhost:3306/" + dbName;

		try {
			//use the mysql jdbc driver to access the mysql database in the most intuitive way
			Class.forName("com.mysql.cj.jdbc.Driver");

			// connect to the database with the given credentials
			con = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void UpdateDatabase(String command) {
		try {
			//creates a statement that will be send to the database
			Statement stat = con.createStatement();
			//execute update are the commands we would run in the terminal
			stat.executeUpdate(command);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet runSQL(String sql) {
		try {
			//creates a statement
			Statement stat = con.createStatement();
			//stores the result of the executed SQL Query
			ResultSet rs = stat.executeQuery(sql);
			//returns the result
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void CloseConnection() {
		try {
			//closes the connection to the database
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
