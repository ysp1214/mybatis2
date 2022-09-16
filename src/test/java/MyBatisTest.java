import com.yt.mybatis.dao.StudentDao;
import com.yt.mybatis.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @auther杨甜
 */
public class MyBatisTest {
    @Test
    public void m1(){
        //读取MyBatis的核心配置文件
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //通过代理模式创建UserMapper接口的代理实现类对象
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        //1
      /*  List<Student> listStudent = studentDao.getStudentByName("Marry");
        marry.forEach(System.out::println);*/
        //2
       /* List<Student> listStudent = studentDao.getStudentByMajor(null,"法学");
        listStudent.forEach(System.out::println);*/
        //3
        /*List<Student> studentById = studentDao.getStudentById();
        studentById.forEach(System.out::println);*/
        //4
        /*List<Integer> ids=new ArrayList<Integer>();
        for(int i =2001;i<2006;i++){
            ids.add(i);}
        List<Student> byList = studentDao.findByList(ids);
        byList.forEach(System.out::println);*/
    }
    @Test
    public void m2(){
        System.out.println("你好世界！");
        System.out.println("你好中国！");
        System.out.println("第二次hot_fix操作");
    }

}
