import java.util.*;
class PreviousDate
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date(dd/mm/yyyy)");
        String date = sc.nextLine();
        Scanner sc2 = new Scanner(date);
        sc2.useDelimiter("/");
        int d = sc2.nextInt();
        int m = sc2.nextInt();
        int y = sc2.nextInt();
        int month[] = {31,y%4==0?29:28,31,30,31,30,31,31,30,31,30,31};
        if(d==1 && m==1)
        {
            m=12;
            d=31;
            y--;
        }
        else if(d==1)
        {
            m--;
            d= month[m-1];
        }
        else
        {
            d--;
        }
        System.out.println(d+"/"+m+"/"+y);
    }
}