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
		// ��
		InputStream is=Resources.getResourceAsStream("config.xml");//��ȡconfig.xml ��������
		//�һ���Ự������ͨ����ȡ������������
		SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sf.openSession();//ͨ���Ự������һ���Ự
		Student mb=new Student();
		//ͨ���Ự������ݽ�ȥ ǰ����ӳ����ӽ�ȥ  ������ʵ�����
		mb.setId(12);
		mb.setName("qq");
//		session.insert("insert",mb);
//		session.update("update",mb );
//		mb.setId(111);
//		mb.setName("��");
//		session.delete("delete", mb);
//		mb.setId(222);	
//		//ɾ��
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
