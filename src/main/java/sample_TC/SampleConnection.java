package sample_TC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import GenericUtility.IconstantUtility;

public class SampleConnection {

	public static void main(String[] args) throws Exception{
		Connection c=null;
		/*establish connection
		 */
		try {
		 c= DriverManager.getConnection(IconstantUtility.dbPath,IconstantUtility.dbUsername,IconstantUtility.dbPassword);
	//create statement																																			
		Statement s=c.createStatement();
		//execute query
		ResultSet rs=s.executeQuery("select * from Students");
		while(rs.next())
				{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				}
		}
		catch(Exception e) 
		{
			
		}
		finally {
			c.close();			}
		
		}	

	}

