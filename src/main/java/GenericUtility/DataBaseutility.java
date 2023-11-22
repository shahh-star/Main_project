package GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * 
 * 
 * @this class contains all generic methods regarding data base author syeds
 *
 */

public class DataBaseutility {
	Connection c = null;

	/**
	 *
	 * this method is use to establish the connection
	 */
	public void establishConnection() throws Exception {
		DriverManager.getConnection(IconstantUtility.dbPath, IconstantUtility.dbUsername, IconstantUtility.dbPassword);

	}

	/**
	 * this method is use to close the connection 2throws Exception
	 */
	public void closeConnection() throws Exception {
		c.close();

	}

	public String executeQuerryOperation(String querry, int colindex, String expData) throws Exception {
		boolean flag = false;
		ResultSet rs = c.createStatement().executeQuery(querry);

		while (rs.next()) {
			String actualData = rs.getString(colindex);

			if (actualData.equals(expData)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("expected data is: " + expData);
			return expData;
		} else {
			System.out.println("Expected data is not present");
			return "";

		}
	}
}
