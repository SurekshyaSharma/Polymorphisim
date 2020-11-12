  
import java.util.Scanner;
public class Exam
{
	public static (String[]args)
	{
      Scanner scan = new Scanner(System.in);
      String code = scan.nextLine();
      try {
            char zone = code.charAt(9);
            int district = Integer.parseInt(code.substring(3, 7));
         } catch (Exception exception) {
            System.out.println("An error has occurred: " + code);
         } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("Improper code length: " + code);
         } catch (NumberFormatException exception) {
            System.out.println("District is not numeric: " + code);
         }
	}
} 