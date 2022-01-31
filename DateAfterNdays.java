import java.util.*;
class DateAfterNdays
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date(dd/mm/yyyy)");
        String date=sc.next();
        System.out.println("Enter value of N");
        int n=sc.nextInt();
        StringTokenizer st = new StringTokenizer(date,"/-");
        int d = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int ar[] = {31,y%4==0?29:28,31,30,31,30,31,31,30,31,30,31};
        for(int x=1; x<=n; x++)
        {
            if(m==12 && d==ar[m-1])
            {
                d=1;
                m=1;
                y++;
                if(y%4==0)
                {
                    ar[1]=29;
                }
                else
                {
                    ar[1]=28;
                }
            }
            else if(d==ar[m-1])
            {
                d=1;
                m++;
            }
            else
            {
                d++;
            }
        }
        System.out.println(d+"/"+m+"/"+y);
    }
}