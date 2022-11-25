//package com.example.jdbc_02;
//
//
//import org.junit.Test;
//
//import java.sql.Connection;
//import java.sql.Statement;
//
//public class Demo03 {
//
//    // 增加操作
//        @Test
//    public void insert() throws Exception {
//            Connection connection = DBUtils.getConnection();
//            Statement statement = connection.createStatement();
//            String sql = "insert into emp value(2,'张三','m','1.1','2020.1.1','草屋')";
//            statement.executeUpdate(sql);
//            connection.close();
//            System.out.println("增加完毕");
//        }
//
//         public void insertUpgrade() {
//             try(Connection connection = DBUtils.getConnection();) {
//                 Statement statement = connection.createStatement();
//                 String sql = "insert into emp value(2,'张三','m','1.1','2020.1.1','草屋')";
//                 statement.executeUpdate(sql);
//                 System.out.println("增加完毕");
//             } catch (Exception e) {
//                 throw new RuntimeException(e);
//             }
//         }
//
//
//
//        @Test
//    public void update() throws Exception {
//            Connection connection = DBUtils.getConnection();
//            Statement statement = connection.createStatement();
//            String sql = "update emp set ename = '呵呵' where eid = 1 ";
//            statement.executeUpdate(sql);
//            connection.close();
//            System.out.println("更新完毕");
//        }
//        @Test
//    public void delete() throws Exception {
//            Connection connection = DBUtils.getConnection();
//            Statement statement = connection.createStatement();
//            String sql = "delete  from emp where eid = 1";
//            String sql2 = "insert into emp value(1,'张三','m','1.1','2020.1.1','草屋')";
//            statement.executeUpdate(sql);
//            statement.executeUpdate(sql2);
//            connection.close();
//            System.out.println("删除完成");
//
//        }
//        @Test
//    public void select() throws Exception {
//            Connection connection = DBUtils.getConnection();
//            Statement statement = connection.createStatement();
//
//
//
//        }
//
//
//}
