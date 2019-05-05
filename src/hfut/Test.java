package hfut;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Test
{
    public static void main(String[] args) throws IOException
    {
        //addPerson();
       // deletePersonByid();
       // updateStudentByid();
        queryPersonByid();
       // addPersonWithConverter();
      //  queryAllStudents();
      //  queryPersonByidConverter();
    }
    //查询单个学生
    public static void queryPersonByid() throws IOException
    {
        //加载MyBatiss配置文件（为了访问数据库）
        Reader reader= Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sessionFactory.openSession();

        personMapper pm=session.getMapper(personMapper.class);
        Person person=pm.queryPersonById(4);
        System.out.println(person.toString());
        session.close();
    }

    //查询多个学生
    public static void queryAllStudents() throws IOException
    {
        //加载MyBatiss配置文件（为了访问数据库）
        Reader reader= Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sessionFactory.openSession();

        personMapper pm=session.getMapper(personMapper.class);
        List<Person> lists=pm.queryAllStudents();
        System.out.println(lists);
        session.close();
    }

    //增加多个学生
    public static void addPerson() throws IOException
    {
        //加载MyBatiss配置文件（为了访问数据库）
        Reader reader= Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sessionFactory.openSession();

        personMapper pm=session.getMapper(personMapper.class);
        pm.addPerson(new Person(2,"LS",25,true));
        session.commit();
        session.close();
    }

    //删除学生
    public static void deletePersonByid() throws IOException
    {
        //加载MyBatiss配置文件（为了访问数据库）
        Reader reader= Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sessionFactory.openSession();

        personMapper pm=session.getMapper(personMapper.class);
        pm.deletePersonByid(2);
        session.commit();
        session.close();
    }

    //修改对象
    public static void updateStudentByid() throws IOException
    {
        //加载MyBatiss配置文件（为了访问数据库）
        Reader reader= Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sessionFactory.openSession();

        personMapper pm=session.getMapper(personMapper.class);
        Person person=new Person();
        person.setId2(3);
        person.setName("aaaaaaa");
        person.setAge(100);
        pm.updateStudentByid(person);
        session.commit();
        session.close();
    }

    //查询单个学生
    public static void queryPersonByIdwithConverter() throws IOException
    {
        //加载MyBatiss配置文件（为了访问数据库）
        Reader reader= Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sessionFactory.openSession();

        personMapper pm=session.getMapper(personMapper.class);
        Person person=pm.queryPersonByConvertor(1);
        System.out.println(person.toString());
        session.close();
    }

    //增加多个学生
    public static void addPersonWithConverter() throws IOException
    {
        //加载MyBatiss配置文件（为了访问数据库）
        Reader reader= Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sessionFactory.openSession();

        personMapper pm=session.getMapper(personMapper.class);
        pm.addPersonWithConverter(new Person(4,"new",25,false));
        session.commit();
        session.close();
    }

}
