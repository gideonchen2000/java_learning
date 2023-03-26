## JDBC

JAVA DATABASE CPONNECTIVITY(java语言连接数据库)

## JDBC的本质

JDBC是SUN公司指定的一套接口  
`java.sql.*` 这个包下有很多接口

- JDBC开发前的准备工作, 先从数据库官网下载对性的驱动jar包, 然后将其配置到环境变量classpath当中.  
使用IDE不需要以上配置


## JDBC编程六步

1. 注册驱动
2. 获取连接
3. 获取数据库操作对象
4. 执行SQL语句(DQL DML)
5. 处理查询结果集
6. 释放资源