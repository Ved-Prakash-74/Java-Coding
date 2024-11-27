import java.util.*;

class FootWear
{
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    public FootWear(int footwearId , String footwearName , String footwearType , int price)
    {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    public int getFootWearId()
    {
        return footwearId;
    }

    public String getFootWearName()
    {
        return footwearName;
    }

    public String getFootWearType()
    {
        return footwearType;
    }

    public int getPrice()
    {
        return price;
    }

    public void getFootWearId(int footwearId)
    {
        this.footwearId = footwearId;
    }

    public void getFootWearName(String footwearName)
    {
        this.footwearName = footwearName;
    }

    public void getFootWearType(String footwearType)
    {
        this.footwearType = footwearType;
    }

    public void getPrice(int price)
    {
        this.price = price;
    }
}

public class Solution
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        FootWear arr [] = new FootWear[5];

        for(int i = 0 ; i < arr.length ; i++)
        {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();

            arr[i] = new FootWear(a , b , c , d);
        }

        String input_footwear_type = sc.nextLine();

        int result = getCountByType(arr , input_footwear_type);
        if(result > 0)
        {
            System.out.println();
            System.out.println(result);
        }
        else 
        {
            System.out.println();
            System.out.println("Footwear Not Available");
        }


        sc.close();
    }

    public static int getCountByType(FootWear arr[] , String input_footwear_type)
    {
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i].getFootWearType().equalsIgnoreCase(input_footwear_type))
            {
                count++;
            }
        }
        return count;
    }
}