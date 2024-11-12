import java.util.*;

public class Solution
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int sum = 0;

        sc.close();

        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
            {
                sum = sum + (str.charAt(i) - '0');
            }
        }

        if(sum < 15)
        {
            System.out.println(sum);
        }

        else
        {
            System.out.println("No Digits");
        }

    }
}