/**********************************************************************************************************************
                                                      Name: Cameron Kranz
                                                      Assignment Number: 6.18
Purpose: This program will print a square of asterisks.
***********************************************************************************************************************
Variables: side = the number of asterisk on each side.
**********************************************************************************************************************/
import java.util.Scanner;

public class AssignmentSixEighteen
{
  private static int side;
  
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a side: ");
    side = input.nextInt();
    
    int sidelength = squareOfAstersisks(side);
    int sidelength2 = 0;
    int save = 0;
    
    sidelength2 = sidelength;
    save = sidelength;
    
    for(sidelength = 0 + sidelength; sidelength >= 1; sidelength = sidelength - 1)
    {
     for(sidelength2 = save; sidelength2 >= 1; sidelength2 = sidelength2 - 1)
     {
       System.out.print("*");
     }
     
     System.out.println();
    }
  }
  
    public static int squareOfAstersisks(int side)
  {
    int length = 0;
    
    if (side >= 0)
      length = side;
      
    return length;
  }
}