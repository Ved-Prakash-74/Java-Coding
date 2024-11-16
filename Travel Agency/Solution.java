import java.util.*;

class TravelAgencies
{
    private int regNo;
    private String agencyName; 
    private String packageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies(int regNo , String agencyName , String packageType , int price , boolean flightFacility)
    {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo()
    {
        return regNo;
    }

    public String getAgencyName()
    {
        return agencyName;
    }

    public String getPackageType()
    {
        return packageType;
    }

    public int getPrice()
    {
        return price;
    }

    public boolean getFlightFacility()
    {
        return flightFacility;
    }

    public void setRegNo(int regNo)
    {
        this.regNo = regNo;
    }

    public void setAgencyName(String agencyName)
    {
        this.agencyName = agencyName;
    }

    public void setPackageType(String packageType)
    {
        this.packageType = packageType;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public void setFlightFacility(boolean flightFacility)
    {
        this.flightFacility = flightFacility;
    }
}

public class Solution
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        TravelAgencies arr []  = new TravelAgencies[4];

        for(int i = 0 ; i < arr.length ; i++)
        {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            boolean e = sc.nextBoolean();
            sc.nextLine();

            arr[i] = new TravelAgencies(a , b , c , d , e);
        }

        int input_regNO = sc.nextInt();
        sc.nextLine();
        String input_packageType = sc.nextLine();

        
        int maxPriceResult = findAgencyWithHighestPackagePrice(arr);
        System.out.print(maxPriceResult);

        TravelAgencies obj = agencyDetailsForGivenIdAndType(arr, input_regNO, input_packageType);

        if(obj == null)
        {
            System.out.println("\nFight facility not found");
        }
        else 
        {
            System.out.println();
            System.out.println(obj.getAgencyName() + " : " + obj.getPrice());
        }

        sc.close();
    }

    public static int findAgencyWithHighestPackagePrice(TravelAgencies arr [])
    {
        int maxPrice = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i].getPrice() > maxPrice)
            {
                maxPrice = arr[i].getPrice();
            }
        }
        return maxPrice;
    }

    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies arr [] , int input_regNO , String input_packageType)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i].getFlightFacility() == true)
            {
                if(arr[i].getRegNo() == input_regNO && arr[i].getPackageType().equalsIgnoreCase(input_packageType))
                {
                    return arr[i];
                }
            }
            
        }
        return null;
    }
}