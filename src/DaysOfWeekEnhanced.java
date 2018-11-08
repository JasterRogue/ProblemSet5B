import javax.swing.*;

public class DaysOfWeekEnhanced {
    public static void main(String[] args)
    {
        String [] days  = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int dayNumber;
        int arrayNumber=0;
       // int i;

        dayNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of the day. 0 to exit"));

        while(dayNumber!=0)
        {
            for( arrayNumber : days)
            {
                if(arrayNumber == dayNumber - 1)
                {
                    break;
                }
            }

            JOptionPane.showMessageDialog(null,"The day you entered is " + days[i]);

            dayNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of the day. 0 to exit"));
        }

    }
}
