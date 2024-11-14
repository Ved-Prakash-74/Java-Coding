import java.util.*;
class Spotify
{
    private int spotifyId;
    private String subscriptionName;
    private String subscriptionType;
    private double price;
    private String groupSession;
    
    public Spotify(int spotifyId , String subscriptionName , String subscriptionType , double price , String groupSession)
    {
        this.spotifyId = spotifyId;
        this.subscriptionName = subscriptionName;
        this.subscriptionType = subscriptionType;
        this.price = price;
        this.groupSession = groupSession;
    }
    
    public int getSpotifyId()
    {
        return spotifyId;
    }
    
    public String getSubscriptionName()
    {
        return subscriptionName;
    }
    
    public String getSubscriptionType()
    {
        return subscriptionType;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public String getGroupSession()
    {
        return groupSession;
    }
    
    public void setSpotifyId(int spotifyId)
    {
        this.spotifyId = spotifyId;
    }
    
    public void setSubscriptionName(String subscriptionName)
    {
        this.subscriptionName = subscriptionName;
    }
    
    public void setSubscriptionType(String subscriptionType)
    {
        this.subscriptionType = subscriptionType;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public void setGroupSession(String groupSession)
    {
        this.groupSession = groupSession;
    }
    
}

public class Solution
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Spotify arr [] = new Spotify[4];
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();
            String e = sc.nextLine();
            
            arr[i] = new Spotify(a , b , c , d , e);
        }
        
        String input_subscription_type = sc.nextLine();
        String input_group_session = sc.nextLine();

        sc.close();
        
        double result = SearchSpotifyAvg(arr , input_subscription_type , input_group_session);
        
        if(result > 0)
        {
            System.out.println(result);
        }
        else
        {
            System.out.println("No users found");
        }
    }
    public static double SearchSpotifyAvg(Spotify arr [] , String input_subscription_type , String input_group_session)
    {
        int count = 0;
        double sum = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i].getSubscriptionType().equalsIgnoreCase(input_subscription_type) && arr[i].getGroupSession().equalsIgnoreCase(input_group_session))
            {
                sum = sum + arr[i].getPrice();
                count = count + 1;
            }
        }
        return sum/count;
    }
}