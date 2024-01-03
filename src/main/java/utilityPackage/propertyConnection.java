package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Set;

public class propertyConnection {
	
	public static void main(String[] args) {
		propertyConnection pc = new propertyConnection();
		pc.readProperty();
		
	}
	public void readProperty() {
		FileInputStream fis=null;
		Properties prop =null;
		Hashtable<String, String> my_dict = new Hashtable<String, String>();
		try {
			prop=new Properties();
			File fp=new File(System.getProperty("user.dir")+"\\src\\main\\java\\dataPackage\\property\\data.property");
			if(fp.exists()) {
				fis = new FileInputStream(fp);
				prop.load(fis);
				Set<Object> s= prop.keySet();
				for(Object O: s)
				{
					String key=O.toString();
					my_dict.put(key, prop.getProperty(key));
					System.out.println(key+":"+my_dict.get(key));
				}
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		finally {
		try {
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	}

	
	public void writeProperty() {
		
	}


}
