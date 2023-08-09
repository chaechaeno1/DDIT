package util;

public class JDBCUtil {	
	private static JDBCUtil instance = null;
	private JDBCUtil() {} 
	public static JDBCUtil getInstance() {
		if(instance == null) 
			instance = new JDBCUtil();
		return instance;

	}
}
