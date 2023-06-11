import java.sql.ResultSet;

public class JDBCDemo {
	
	private void PrintResultSet(ResultSet t) {
		try {
			int counter = 1;
			while (t.next()) {
				try {
					while (true) {
					System.out.print(t.getString(counter));
					System.out.print("  ");
					counter++;
					}
				}
				catch(Exception e) {}
				System.out.print("\n");
				counter = 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	JDBCDemo(){
		//connect to the database with the given credentials
		Database db = new Database("test", "root", "toor");
		//db.UpdateDatabase("insert into Kunden values('Kunde1', 'Nachname' ,'1234','2000-01-01');");
		//db.UpdateDatabase("delete from Kunden where Name = 'Kunde1'");
		ResultSet s = db.runSQL("select * from Kunden");
		PrintResultSet(s);
		db.CloseConnection();
	}
	
	// remove when using the code in BlueJ, etc.
	public static void main(String[] args) {
		new JDBCDemo();
	}
}
