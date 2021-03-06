public class StaticTest {
    public static void main(String[] args)
    {
        Employee[] staff=new Employee[3];
        staff[0]=new Employee("Tom",40000);
        staff[1]=new Employee("Dick",60000);
        staff[2]=new Employee("Harry",65000);
        staff[0].setSalary(56);
        for(Employee e:staff)
        {
            e.setId();
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }
        int n=Employee.getNextId();
        System.out.println("Next available id=是吗？"+n);
        System.out.println();
    }
}

class Employee
{
    private String name;
    private double salary;
    private int id;
    private char anInt;
    private static int nextId=1;

    public Employee(String n,double s)
    {
        name=n;
        salary=s;
        id=0;
    }
    public String getName()
    {
        return "我的名字是"+name;
    }
    public void setSalary(double money){this.salary=money; }

    public double getSalary()
    {
        return salary;
    }
    public int getId()
    {
        return id;
    }
    public void setId()
    {
        id=nextId;
        nextId++;
    }
    public static int getNextId()
    {
        return nextId;
    }
    public static void main(String[] args)
    {
        char aChar;
        Employee e=new Employee("Harry",50000);
        System.out.println(e.getName()+" "+e.getSalary());
        System.out.println(e.anInt);
    }
}