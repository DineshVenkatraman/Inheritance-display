class A
{
    void display()
    {
        System.out.println("A is display");

    }
}
class B extends A
{
    void display(int no)
    {
        System.out.println("B is display");

    }

}
class C extends B
{
    void display(int no)
    {
        System.out.println("C is display");

    }

}




public class InheritDemoDisplay {
    public static void main(String args[])
    {
        A a=new A();
        a.display();
        a=new B();
        a.display();
        a=new C();
        a.display();


    }
}
