import java.util.Scanner;

public class NestedLoops
{
    public static void main(String[] args)
    {
        boolean go = true;
        while (go = true)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Input a letter key to exit.");
            System.out.print("Input an integer for how long this program will execute steps for: ");
            if (!s.hasNextInt())
            {
                break;
            }
            int num = s.nextInt();
            int numb1=1;
            int numb2=0;

            for( int index = 0; index < num; index++)
            { 
                if( index%4 == 0)
                {
                    numb1++;
                    numb2=0;
                }
                numb2++;
                System.out.println(numb1+" "+ numb2);
            }
        }
    }
}