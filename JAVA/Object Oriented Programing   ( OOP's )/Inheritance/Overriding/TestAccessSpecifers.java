class Parent 
{
    protected void myMethod() 
    {
        System.out.println("Parent's method");
    }
}
class Child extends Parent 
{
    void myMethod() 
    { 
        System.out.println("Child's method");
    }
}
public class TestAccessSpecifers
{
    public static void main(String[] args) 
    {
        Child child = new Child();
        child.myMethod();
    }
}