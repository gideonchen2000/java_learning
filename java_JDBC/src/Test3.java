import java.sql.*;

public class Test3 {
    public static void main(String[] args) {
        try{
			
            //1注册驱动
            // 这是注册驱动的第一种写法
			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            // 注册驱动的第二种方式 常用的
            Class.forName("com.mysql.cj.jdbc.Driver");
			//2获取连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=UTC","root","123456");
			System.out.println(conn);

            
		}catch(SQLException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
