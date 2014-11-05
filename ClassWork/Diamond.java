import java.util.Scanner;

public class Diamond
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please type an even side length: ");
        int num = in.nextInt();

        for (int index = 1; index <= num; index++)
        {
            for (int index1 = 1; index1 <= index*2 - 1; index1++)
            {
                if (Math.abs(index1 - num) < (index))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
            