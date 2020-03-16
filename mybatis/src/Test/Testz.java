package Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.cjf.dao.Student;
import com.cjf.mapper.MyBatis;

public class Testz {

	public static void main(String[] args) throws Exception {
		// 增
		InputStream is=Resources.getResourceAsStream("config.xml");//获取config.xml 环境内容
		//搭建一个会话工厂，通过获取的内容来创建
		SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sf.openSession();//通过会话工厂打开一个会话
		Student mb=new Student();
		//通过会话添加数据进去 前者用映射添加进去  后者用实体添加
		mb.setId(12);
		mb.setName("qq");
//		session.insert("insert",mb);
//		session.update("update",mb );
//		mb.setId(111);
//		mb.setName("改");
//		session.delete("delete", mb);
//		mb.setId(222);	
//		//删除
//		mb.setName("mybatis");
//		List<Student>  stu=session.selectList("select", mb);
		List<Student> stu=session.selectList("select", mb);
		for(Student stud:stu) {
			System.out.println(stud.getId()+":"+stud.getName());
		}
		session.commit();
		session.close();
	}

}
