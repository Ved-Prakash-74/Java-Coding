import java.util.*;

public class Solution
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int flag = 0;
        String str;
        str = sc.nextLine();

        String vowels [] = { "a" , "e" , "i" , "o" , "u"};

        for(int i = 0 ; i < vowels.length ; i++)
        {
            if(str.toLowerCase().contains(vowels[i]))
            {
                System.out.println(vowels[i]);
                break;
            }
            else
            {
                flag = 1;
            }
        }

        if(flag == 1)
        {
            System.out.println("No Vowels Present");
        }

        sc.close();
    }
}