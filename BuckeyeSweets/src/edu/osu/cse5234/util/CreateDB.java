package edu.osu.cse5234.util;
import java.sql.DriverManager;

public class CreateDB {
	
		public static void main(String[] args) throws Exception {
			
			Class.forName("org.h2.Driver").newInstance();
			DriverManager.getConnection("jdbc:h2:" + "C:/Users/212600883/git/OSU_CSE5234/h2db/BuckeyeSweetsDB", "sa", "" );
			System.out.println("Database has been created!");
		}
}


/** 
 public static void main(String[] args) throws Exception {
 
	
	Class.forName("org.h2.Driver").newInstance();
	Connection conn = DriverManager.getConnection("jdbc:h2:" + "C:/Users/212600883/git/OSU_CSE5234/h2db/BuckeyeSweetsDB", "sa", "" );
	System.out.println("Database has been created!");
}
*/