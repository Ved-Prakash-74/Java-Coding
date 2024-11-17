import java.util.*;

public class Solution
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        String str , strLowerCase , rev_str = ""; 
        str = sc.nextLine();

        strLowerCase = str.toLowerCase();

        for(int i = strLowerCase.length() - 1 ; i >= 0 ; i--)
        {
            rev_str += strLowerCase.charAt(i);
        }

        System.out.println(rev_str);

        sc.close();
    }
} 