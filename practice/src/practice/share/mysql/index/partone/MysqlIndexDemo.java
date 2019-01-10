package practice.share.mysql.index.partone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MysqlIndexDemo {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		insertInnoDB();
		//insertMyISAM();
	}
	
	public static void insertInnoDB() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false&serverTimezone=UTC","root","root");
        
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String sql = "";
        PreparedStatement pr = conn.prepareStatement(sql);
        for(int i = 1; i < 1000; i++) {
        	cal.add(Calendar.DAY_OF_MONTH, 1);
        	Date date1 = cal.getTime();
        	sql="insert into user_innodb (age, username, password, register_date) values (" + i + ", '测试" + i + "', '111" + i + "', '" + df.format(date1) + "')"; 
            pr = conn.prepareStatement(sql);
            pr.execute();
        }
        System.out.println("-----------------complete----------------");
        pr.close();
        conn.close();
        
		
	}
	
	public static void insertMyISAM() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false&serverTimezone=UTC","root","root");
        
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sql = "";
        PreparedStatement pr = conn.prepareStatement(sql);
        for(int i = 1; i < 1000; i++) {
        	cal.add(Calendar.DAY_OF_MONTH, 1);
        	Date date1 = cal.getTime();
        	sql="insert into title_myisam (emp_no, name, emp_date) values ('100" + i + "', '测试"+i+"', '" + df.format(date1) + "')"; 
            pr = conn.prepareStatement(sql);
            pr.execute();
        }
        System.out.println("-----------------complete----------------");
        pr.close();
        conn.close();
		
	}

}
