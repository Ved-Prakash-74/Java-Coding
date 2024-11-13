import java.util.*;

public class Solution
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        String st , str;
        st = sc.nextLine();
        str = st.toLowerCase();

        int vowel_count  = 0, consonant_count = 0;

        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowel_count = vowel_count + 1;
                continue;
            }

            if(ch >= 'a' && ch <= 'z')
            {
                consonant_count = consonant_count + 1;
                continue;
            }
        }

        System.out.println("Number of vowels: " + vowel_count);
        System.out.println("Number of consonants: " + consonant_count);

        sc.close();
    }
}