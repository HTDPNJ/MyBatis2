package hfut;

public class Person
{
    private int id2;
    private String name;
    private int age;
    private boolean perSex;
    public Person()
    {
    }

    public Person(int id2, String name, int age, boolean perSex)
    {
        this.id2 = id2;
        this.name = name;
        this.age = age;
        this.perSex = perSex;
    }

    public int getId2()
    {
        return id2;
    }

    public void setId2(int id2)
    {
        this.id2 = id2;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public boolean isPerSex()
    {
        return perSex;
    }

    public void setPerSex(boolean perSex)
    {
        this.perSex = perSex;
    }

    @Override
    public String toString()
    {
        return "Person{" + "id2=" + id2 + ", name='" + name + '\'' + ", age=" + age + ", perSex=" + perSex + '}';
    }
}
