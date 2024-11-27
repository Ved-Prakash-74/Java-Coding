import java.util.*;

public class Solution
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int num , flag = 0;
        num = sc.nextInt();

        for(int i = 0 ; i <= num/2 ; i++)
        {
            if(i * i == num)
            {
                flag = 1;
                break;
            }

        }

        if(flag == 1)
        {
            System.out.println("\nTrue");
        }
        else 
        {
            System.out.println("\nFalse");
        }

        sc.close();
    }
}