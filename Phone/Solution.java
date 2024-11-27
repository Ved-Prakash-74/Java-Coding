import java.util.*;

class Phone
{
    private int phoneId;
    private String os;
    private String brand;
    private int price;

    public Phone(int phoneId , String os , String brand , int price)
    {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getPhoneId()
    {
        return phoneId;
    }

    public String getOs()
    {
        return os;
    }

    public String getBrand()
    {
        return brand;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPhoneId(int phoneId)
    {
        this.phoneId = phoneId;
    }

    public void setOs(String os)
    {
        this.os = os;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
}

public class Solution
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        Phone arr [] = new Phone [4];

        for(int i = 0 ; i < arr.length ; i++)
        {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();

            arr[i] = new Phone(a , b , c , d);
        }

        String input_brand = sc.nextLine();
        String input_os = sc.nextLine();

        int result = indPriceForGivenBrand(arr, input_brand);
        Phone obj = getPhoneIdBasedOnOs(arr, input_os);

        if(result > 0)
        {
            System.out.println();
            System.out.println(result);
        }
        else
        {
            System.out.println();
            System.out.println("The given Brand is not available");
        }

        if(obj != null)
        {
            System.out.println();
            System.out.println(obj.getPhoneId());
        }
        else 
        {
            System.out.println();
            System.out.println("No phones are available with specified os and price range");
        }

        sc.close();
    }

    public static int indPriceForGivenBrand(Phone arr [] , String input_brand)
    {
        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i].getBrand().equalsIgnoreCase(input_brand))
            {
                sum = sum + arr[i].getPrice();
            }
        }

        if(sum > 0)
        {
            return sum;
        }
        else
        {
            return 0;
        }
    }

    public static Phone getPhoneIdBasedOnOs(Phone arr [] , String input_os)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i].getOs().equalsIgnoreCase(input_os) && arr[i].getPrice() >= 50000)
            {
                return arr[i];
            }
        }
        return null;
    }
}