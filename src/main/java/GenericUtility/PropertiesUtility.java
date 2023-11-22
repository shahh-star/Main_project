package GenericUtility;
	import java.io.FileInputStream;
	import java.util.Properties;
	/**
	 * this class is for properties utility
	 * @author Shoeb
	 *
	 */

	public class PropertiesUtility {
		/**
		 * This is a generic method to use properties data
		 * @param data
		 * @return
		 * @throws Exception
		 */
		public String getDataFromproperties(String data)throws Exception
		{
			
			FileInputStream fis=new FileInputStream
					("D:\\Selenium\\vtiger.properties");
	    
	         Properties pobj=new Properties();
	         pobj.load(fis);
	         String value=pobj.getProperty(data);
	         return value;
	    
		}

}
