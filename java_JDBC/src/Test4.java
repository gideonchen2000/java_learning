// 将连接数据库的所有信息配置到配置文件中

import java.sql.*;
import java.util.ResourceBundle;

public class Test4{
	public static void main(String[] args){

        // 使用资源绑定器 绑定配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
		String url = bundle.getString("url");
		String user = bundle.getString("user");
		String password = bundle.getString("password");

		Connection conn = null;
		Statement stmt = null;
		try{
			//1注册驱动
			Class.forName(driver);
			//2获取连接
			conn = DriverManager.getConnection(url, user, password);
			//3获取数据库操作对象
			stmt = conn.createStatement();
			//4执行SQL语句	
            // JDBC中的sql语句不需要提供分号

			// String sql = "delete from dept where deptno = 40";
			String sql = "update dept set dname = '销售部', loc = '天津' where deptno = 20";
			int count = stmt.executeUpdate(sql);
			System.out.println(count == 1 ? "删除/修改成功" : "删除/修改失败");
		}catch(SQLException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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