import java.util.*;
class DayNumberToDate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day number");
        int n=sc.nextInt();
        System.out.println("Enter year");
        int y=sc.nextInt();
        int month[] = {31,y%4==0?29:28,31,30,31,30,31,31,30,31,30,31};
        int i=0;
        while(month[i]<n)
        {
            n=n-month[i];
            i++;
        }
        System.out.println(n+"/"+(i+1)+"/"+y);
    }
}