import java.util.*;
class DateDifference
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter old date");
        String old = sc.nextLine();
        
        System.out.println("Enter new date");
        String new_date = sc.nextLine();
        
        Scanner sc2 = new Scanner(old);
        sc2.useDelimiter("/");
        int d1 = sc2.nextInt();
        int m1 = sc2.nextInt();
        int y1 = sc2.nextInt();
        
        Scanner sc3 = new Scanner(new_date);
        sc3.useDelimiter("/");
        int d2 = sc3.nextInt();
        int m2 = sc3.nextInt();
        int y2 = sc3.nextInt();
        
        int ar1[] = {31,y1%4==0?29:28,31,30,31,30,31,31,30,31,30,31};        
        int ar2[] = {31,y2%4==0?29:28,31,30,31,30,31,31,30,31,30,31};
        
        if(m1 == m2 && y1 == y2)
        {
            System.out.println(d2-d1);
        }
        else if(y1 == y2)
        {
            int s=0;
            for(int x=m1; x<=m2-2; x++)
            {
                s = s+ar1[x];
            }
            s=s+ar1[m1-1]-d1+d2;
            System.out.println(s);
        }
        else
        {
            int s=0;
            s = ar1[m1-1]-d1;
            for(int x=m1; x<ar1.length; x++)
            {
                s=s+ar1[x];
            }
            
            s = s+d2;
            
            for(int x=0; x<=m2-2; x++)
            {
                s=s+ar2[x];
            }
            
            for(int y=1; y<=y2-y1-1; y++)
            {
                if((y1+y)% 4==0)
                {
                    s= s+366;
                }
                else
                {
                    s=s+365;
                }
            }
            System.out.println(s);
        }
    }
}