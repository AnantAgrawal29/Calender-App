import java.util.*;
class NextDate
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date(dd/mm/yyyy)");
        String date = sc.nextLine();
        Scanner sc2 = new Scanner(date); 
        /** Using Delimiter OPP!!!!!!*/
        sc2.useDelimiter("/");
        int d = sc2.nextInt();
        int m = sc2.nextInt();
        int y = sc2.nextInt();
        int month[] = {31,y%4==0?29:28,31,30,31,30,31,31,30,31,30,31};
        if(m==12 && d==month[m-1])
        {
            d=1;
            m=1;
            y++;
        }
        else if(d==month[m-1])
        {
            d=1;
            m++;
        }
        else
        {
            d++;
        }
        System.out.println(d+"/"+m+"/"+y);
    }
}