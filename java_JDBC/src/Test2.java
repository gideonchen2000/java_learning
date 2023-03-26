/*
	JDBC完成delete update
*/

import java.sql.*;

public class Test2{
	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		try{
			//1注册驱动
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//2获取连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=UTC","root","123456");
			//3获取数据库操作对象
			stmt = conn.createStatement();
			//4执行SQL语句	
            // JDBC中的sql语句不需要提供分号

			// String sql = "delete from dept where deptno = 40";
			String sql = "update dept set dname = '销售部', loc = '天津' where deptno = 20";
			int count = stmt.executeUpdate(sql);
			System.out.println(count == 1 ? "删除成功" : "删除失败");
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			//6释放资源
			if(stmt != null){
				try{
					stmt.close();
				}catch(SQLException e){
					e.printStackTrace();
				}	
			}
			if(conn != null){
				try{
					conn.close();
				}catch(SQLException e){
					e.printStackTrace();
				}	
			}
		}
		
	}
}
