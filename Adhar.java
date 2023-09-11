import java.util.Scanner;

public class Adhar
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name=sc.next();
        System.out.println("Enter the Age: ");
        int age=sc.nextInt();
        System.out.println("Enter the Location: ");
        String loc=sc.next();
        Govt g = Govt.getInstance(name, age, loc);
        //Govt g3= Govt.getInstance(name, age, loc);
        g.display();
    }
}
class Govt
{
    String name;
    int age;
    String add;
    private Govt(String name,int age,String add)
    {
        this.name=name;
        this.age=age;
        this.add=add;
    }
    private static Govt gv;
    public static Govt getInstance(String name,int age,String add)
    {
        if(gv==null)
        {
            gv=new Govt(name, age, add);
        }
        else
        {
            System.out.println("Adhar card has been issued to you, Kindly request you to meet udai.gov");
        }
        return gv;
    }
    public void display()
    {
        System.out.println("Name: "+name+ "\n age: "+age+ "\n Adress :"+add);
    }
}
