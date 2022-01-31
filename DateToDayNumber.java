import java.util.*;
class DateToDayNumber
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
        int s=0;
        for(int x=0; x<=m-2; x++)
        {
            s=s+month[x];
        }
        s=s+d;
        System.out.println("Day number "+s);
    }
}