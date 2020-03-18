package itree.test;

import com.github.tools.generators.sqls.MyqlTableGenerator;

import test.test.models.User;

public class tip {
	public static void main( String[] args )
    {
		MyqlTableGenerator sql;
		try {
			sql = new MyqlTableGenerator(
					"jdbc:mysql://127.0.0.1:3306/mypoj",
					"com.mysql.cj.jdbc.Driver",
					"root", "root");
			sql.setDbName("mypoj");
			sql.DropDatabase();
			sql.createDatabase();
			sql.createTable(User.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
    }

}
