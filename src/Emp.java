import java.util.*;
class Demo1{
    int a,d=-1,e=-1;
    int eid,esalary;
    String ename;
    String ecompany;

    int[] arr1;
    String[] arr2;

    Demo1() {
        Scanner s = new Scanner(System.in);
        a = s.nextInt();

        arr1 = new int[a];
        arr2 = new String[a];
    }

    public void show()
    {
        for(int j=0;j<a;j++)
        {
            if(Objects.equals(arr2[j], "A"))
            {
                if(arr1[j]>d)
                {
                    d=arr1[j];
                }
            }
            else
            {
                if(arr1[j]>e)
                {
                    e=arr1[j];
                }
            }

        }
        System.out.println(d);
        System.out.println(e);
    }

}
public class Emp {
    public static void main(String[] args) {
        Demo1 obj=new Demo1();

        for(int i=0;i<obj.a;i++)
        {
            Scanner s1=new Scanner(System.in);
            obj.ename=s1.nextLine();
            obj.ecompany=s1.nextLine();
            obj.eid=s1.nextInt();
            obj.esalary=s1.nextInt();

            obj.arr1[i]=obj.esalary;
            obj.arr2[i]=obj.ecompany;
        }
        obj.show();
    }
}

