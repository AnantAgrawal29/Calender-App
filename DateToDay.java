import java.util.*;
import javax.swing.*;
class DateToDay
{
    public static void main(String args[])
    {
        String date = JOptionPane.showInputDialog("Enter date");
        StringTokenizer st = new StringTokenizer(date,"/-");
        int d = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        String day = JOptionPane.showInputDialog("Enter day on 1/1/"+y);
        String weekdays[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int month[] = {31,y%4==0?29:28,31,30,31,30,31,31,30,31,30,31};
        int s=0, c=0;
        for(int x=0; x<=m-2; x++)
        {
            s=s+month[x];
        }
        s=s+d;
        for(int x=1; x<=6; x++)
        {
            if(weekdays[x].equals(day))
            {
                c=x;
                break;
            }
        }
        if(c!=0)
        {
            for(int z=1; z<=s; z++)
            {
                if(c==weekdays.length)
                {
                    c=0;
                }
                day = weekdays[c];
                c++;
            }
            JOptionPane.showMessageDialog(null,"Day on "+date+" is "+day);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid Day!");
        }
    }
}