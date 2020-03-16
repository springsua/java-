package c3p0;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public class DbutilTese {
    public static void main(String []ages)  {
        QueryRunner qr=new QueryRunner(c3p0.getdataSource());
        //添加数据
//        String sql="insert into students values(?,?)";
//        Object[] values={1,"ddbb"};
//        try {
//            int i=qr.update(sql,values);
//            if(i!=0){
//                System.out.println("欧克");
//            }else{
//                System.out.println("no");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        //删除数据
//        String sql=" delete  from  students where id=999;";
//        try {
//            int i=qr.update(sql);
//            if(i!=0){
//                System.out.println("ok");
//            }else {
//                System.out.println("no");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
       //修改数据
//        String sql="update students set id=55 where name='db';";
//        try {
//            int i=qr.update(sql);
//            if(i!=0){
//                System.out.println("ok");
//            }else {
//                System.out.println("no");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        //查询
        String sql="select* from students";
        try {
            //User是数据表里面的变量，这个操作要一个集合users来存放查询结果，使用query来查询数据（PS：执行sql语句，需要用BeanListHandlerHandler
            // 这个方法，将查询结果放到User.class里面并进行封装）
            List<User> n=qr.query(sql,new BeanListHandler<User>(User.class));
            for (User user:n){
                System.out.println(user.getId()+":"+user.getName());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
