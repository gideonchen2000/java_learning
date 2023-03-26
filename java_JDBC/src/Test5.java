/*
	处理查询结果集
*/
import java.sql.*;

public class Test5{
	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			//1
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=UTC","root","123456");
			//3
			stmt = conn.createStatement();
			//4
			String sql = "select empno as a,ename,sal from emp";
			// int executeUpdate(insert/delete/update)
			// ResultSet executeQuery(select)
			rs = stmt.executeQuery(sql); // 专门执行DQL语句的方法
			//5
			/*
			boolean flag1 = rs.next();
			//System.out.println(flag1); // true
			if(flag1){
				// 光标指向的行 存在数据
				// 取数据
				// getString() 方法的特点是不管数据库中的数据类型是什么, 都以String的形式取出
				String empno = rs.getString(1); // JDBC中所有下标从1开始, 不是从0开始
				String ename = rs.getString(2);
				String sal = rs.getString(3);
				System.out.println(empno + "," + ename + "," + sal);
			}

			flag1 = rs.next();
			if(flag1){
				// 以下程序的1 2 3 说的是第几列
				String empno = rs.getString(1);
				String ename = rs.getString(2);
				String sal = rs.getString(3);
				System.out.println(empno + "," + ename + "," + sal);
			}
			*/

			while(rs.next()){
				/*
				String empno = rs.getString(1);
				String ename = rs.getString(2);
				String sal = rs.getString(3);
				System.out.println(empno + "," + ename + "," + sal);
				*/

				/*
				// 这个不是以列的下标获取, 是以列的名字获取
				//String empno = rs.getString("empno");
				String empno = rs.getString("a"); // 重点 列名称不是表中的列名称, 是查询结果集的类名称
				String ename = rs.getString("ename");
				String sal = rs.getString("sal");
				System.out.println(empno + "," + ename + "," + sal);
				*/

				// 除了可以以string类型取出之外, 还可以以特定的类型取出
				/*
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				double sal = rs.getDouble(3);
				System.out.println(empno + "," + ename + "," + (sal + 100));
				*/

				int empno = rs.getInt("a");
				String ename = rs.getString("ename");
				double sal = rs.getDouble("sal");
				System.out.println(empno + "," + ename + "," + (sal + 200));
			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//6
			if(rs != null){
				try{
					rs.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			if(conn != null){
				try{
					conn.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}