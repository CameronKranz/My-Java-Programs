/**************************************************************************************************************************************************************************
                                                                           Name: Cameron Kranz
                                                                            Assignment: 7.10
Purpose: This program will calculate the salaries of a user determined amount of salespeople who get a flat pay of $200 and then 9% of their gross sales. It will then
organize the results into tabular format to display how many people fall within each of a certain number of salary ranges.
***************************************************************************************************************************************************************************
Variables: gross = the gross sales of each salespeson, com = the total commision each salesperson earns, pay = the total salery of each salesperson.
**************************************************************************************************************************************************************************/
import java.util.*;

public class AssignmentSevenTen
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int gross;
    int com = 0;
    int pay = 0;
    
    System.out.print("Enter the gross sales of the employee or enter -1 to exit");
    gross = input.nextInt();
    
    while (gross != -1)
    {
      com = ((gross * 100) * 9) / 10000;
      
      pay = com + 200;
      
      if (pay >= 200)
      if (pay <= 299)
      array[0] = array[0] + 1;
      
      if (pay >= 300)
      if (pay <= 399)
      array[1] = array[1] + 1;
      
      if (pay >= 400)
      if (pay <= 499)
      array[2] = array[2] + 1;
      
      if (pay >= 500)
      if (pay <= 599)
      array[3] = array[3] + 1;
      
      if (pay >= 600)
      if (pay <= 699)
      array[4] = array[4] + 1;
      
      if (pay >= 700)
      if (pay <= 799)
      array[5] = array[5] + 1;
      
      if (pay >= 800)
      if (pay <= 899)
      array[6] = array[6] + 1;
      
      if (pay >= 900)
      if (pay <= 999)
      array[7] = array[7] + 1;
      
      if (pay >= 1000)
      array[8] = array[8] + 1;
      
      System.out.print("Enter the gross sales of the employee or enter -1 to exit");
      gross = input.nextInt();
    }
    
    System.out.printf("200-299 %d%n", array[0]);
    System.out.printf("300-399 %d%n", array[1]);
    System.out.printf("400-499 %d%n", array[2]);
    System.out.printf("500-599 %d%n", array[3]);
    System.out.printf("600-699 %d%n", array[4]);
    System.out.printf("700-799 %d%n", array[5]);
    System.out.printf("800-899 %d%n", array[6]);
    System.out.printf("900-999 %d%n", array[7]);
    System.out.printf("1000 up %d%n", array[8]);
    
    
  }
}