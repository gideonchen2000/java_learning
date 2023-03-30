import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 1. 解决SQL注入问题
 *      只要用户提供的信息不参与SQL语句的编译过程 即解决
 *      即使用户提供的信息中含有sql语句关键字, 但是没参与编译, 不起作用
 *      要想用户信息不参与sql语句的编译, 那么必须使用java.sql.PreparedStatement
 *      PreparedStatement接口继承了java.sql.Statement
 *      PreparedStatement是属于预编译的数据库操作对象
 *      PreparedStatement的原理是: 预先对sql语句的框架进行编译, 然后再给sql语句传 "值"
 */
public class Test7 {
    public static void main(String[] args) {
        // 初始化一个界面
        Map<String, String> userLoginInfo = initUI();
        // 验证用户名和密码
        boolean loginSuccess = login(userLoginInfo);
        // 最后输出结果
        System.out.println(loginSuccess ? "Succeed" : "Failed");
    }
    
    /*
     * 用户登录
     * userLoginInfo用户登录信息
     * @return false表示失败, true表成功
     */
    private static boolean login(Map<String, String> userLoginInfo) {
        // 打标记的意识
        boolean loginSuccess = false;
        // 单独定义变量
        String loginName = userLoginInfo.get("loginName");
        String loginPwd = userLoginInfo.get("loginPwd");

        // JDBC代码
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // 1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=UTC", "root", "123456");
            // 3.获取预编译数据库操作对象
            // sql语句的框子, ? 表示一个占位符
            String sql = "select * from t_user where loginName = ? and loginPwd = ?"; 
            ps = conn.prepareStatement(sql);
            // 给占位符 ? 传值. 第一个? 下标是1, 第二个? 下标是2, JDBC中所有下标从1开始
            ps.setString(1, loginName);
            ps.setString(2, loginPwd);
            // 4.执行sql
            rs = ps.executeQuery();
            // 5.处理结果集
            if(rs.next()){
                // 登录成功
                loginSuccess = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 6.释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return loginSuccess;
    }

    /*
     * 初始化用户界面
     * @return 用户输入的登录信息
     */
    private static Map<String, String> initUI() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("用户名: ");
            String loginName = s.nextLine();

            System.out.print("密码: ");
            String loginPwd = s.nextLine();

            Map<String, String> userLoginInfo = new HashMap<>();
            userLoginInfo.put("loginName", loginName);
            userLoginInfo.put("loginPwd", loginPwd);

            return userLoginInfo;
        }
    }
}