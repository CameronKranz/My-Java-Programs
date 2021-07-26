/**********************************************************************************************************************
                                                        Cameron Kranz
                                                          Computer 2
                                                    Assignment Number 3.14
Purpose : This program will get the month, date, and year from a user.
***********************************************************************************************************************
***********************************************************************************************************************
Variables used in this program : month = the month, day = the day, year = the year.
***********************************************************************************************************************
***********************************************************************************************************************
                                                        Main Program
**********************************************************************************************************************/
public class ThreeFourteen
{
  private String month;
  private String day;
  private String year;
  
  public ThreeFourteen(String month, String day, String year)
  {
    this.month = month;
    this.day = day;
    this.year = year;
  }
  
  public void setmonth(String month)
  {
     this.month = month;
  }
  
  public void setday(String day)
  {
    this.day = day;
  }
  
  public void setyear(String year)
  {
    this.year = year;
  }
  
  public String getmonth()
  {
    return month;
  }
  
  public String getday()
  {
    return day;
  }
  
  public String getyear()
  {
    return year;
  }
}
