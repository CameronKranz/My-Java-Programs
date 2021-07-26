/**********************************************************************************************************************
                                                        Cameron Kranz
                                                          Computer 2
                                                    Assignment Number 3.14 Test
Purpose : This program will test 3.14.
***********************************************************************************************************************
***********************************************************************************************************************
Variables used in this program : month = the month, day = the day, year = the year.
***********************************************************************************************************************
***********************************************************************************************************************
                                                        Main Program
**********************************************************************************************************************/
import java.util.Scanner;

public class ThreeFourteenTest
{
   public static void main(String[] args)
   {
     ThreeFourteen displayDate = new ThreeFourteen("0","0","0");
     
     System.out.printf("The date is %s/%s/%s.%n", displayDate.getmonth(),displayDate.getday(), displayDate.getyear());
     
     Scanner input = new Scanner(System.in);
       
     System.out.print("Enter month.");
     String month = input.nextLine();
     System.out.print("Enter day.");
     String day = input.nextLine();
     System.out.print("Enter year.");
     String year = input.nextLine();
     
     displayDate.setmonth(month);
     displayDate.setday(day);
     displayDate.setyear(year);
     
     System.out.printf("The date is %s/%s/%s.", displayDate.getmonth(),displayDate.getday(), displayDate.getyear());
   }
}