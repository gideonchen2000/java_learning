import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Test1 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        Driver driver;
        try {
            // 1. 注册驱动
            driver = new com.mysql.cj.jdbc.Driver(); // 多态 父类引用指向子类型对象
            DriverManager.registerDriver(driver);
            // 2. 获取链接
            String url = "jdbc:mysql://127.0.0.1:3306/bjpowernode?serverTimezone=UTC";
            String user = "root";
            String password = "123456";
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("数据库连接对象 = " + conn);
            // 数据库连接对象 = com.mysql.cj.jdbc.ConnectionImpl@17497425
            // 3. 获取数据库操作对象
            // Statement专门执行sql语句的
            stmt = conn.createStatement();

            // 4. 执行sql
            String sql = "insert into dept(deptno, dname, loc) values(50, '人事部', '北京')";
            // 专门执行DML语句的(insert delete update)
            // int返回值是"影响数据库中的记录条数"
            int count = stmt.executeUpdate(sql);
            System.out.println(count == 1 ? "ok" : "fail");
            // 5. 处理查询结果集

            



        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            // 6. 释放资源
            // 为了保证资源一定释放,在finally语句中关闭资源
            // 并且要遵循从小到大依次关闭
            // 分别对其try catch
            try {
                if(stmt != null){
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } 
        
        

        
        
        

    }
}
