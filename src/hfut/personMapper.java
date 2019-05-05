package hfut;

import java.util.List;

//操作Mybatis的接口
public interface personMapper
{
    //方法名和mapper.xml文件中的id一样
    //方法的输入参数与mapper.xml文件中标签的parameterType一样
    //返回值与mapper.xml文件中resultType一致
    //习惯sql映射文件（mapper.xml）和接口放在同一个包中
    Person queryPersonById(int id);
    List<Person> queryAllStudents();
    void addPerson(Person person);
    void deletePersonByid(int id);
    void updateStudentByid(Person person);
    Person queryPersonByConvertor(int id);
    void addPersonWithConverter(Person person);


}
