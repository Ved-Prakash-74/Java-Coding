import java.util.*;

class AutonomousCar
{
    private int carId;
    private String brand;
    private int noOfTestsConducted;
    private int noOfTestsPassed;
    private String environment;
    private String grade;

    public AutonomousCar(int carId , String brand , int noOfTestsConducted , int noOfTestsPassed , String environment)
    {
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
    }

    public int getCarId()
    {
        return carId;
    }

    public String getBrand()
    {
        return brand;
    }

    public int getNoOfTestsConducted()
    {
        return noOfTestsConducted;
    }

    public int getNoOfTestsPassed()
    {
        return noOfTestsPassed;
    }

    public String getEnvironment()
    {
        return environment;
    }

    public String getGrade()
    {
        return grade;
    }

    public void setCarId(int carId)
    {
        this.carId = carId;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setNoOfTestsConducted(int noOfTestsConducted)
    {
        this.noOfTestsConducted = noOfTestsConducted;
    }

    public void setNoOfTestsPassed(int noOfTestsPassed)
    {
        this.noOfTestsPassed = noOfTestsPassed;
    }

    public void setEnvironment(String environment)
    {
        this.environment = environment;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

}

public class Solution
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        AutonomousCar arr[] = new AutonomousCar[4];

        for(int i = 0 ; i < arr.length ; i++)
        {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new AutonomousCar(a, b, c, d, e);
        }

        String input_environment = sc.nextLine();
        String input_brand = sc.nextLine();

        int result = findTestPassedByEnv(arr, input_environment);
        if(result > 0)
        {
            System.out.println();
            System.out.println(result);
        }
        else 
        {
            System.out.println();
            System.out.println("There are no tests passed in this particular environment");
        }

        AutonomousCar obj = updateCarGrade(arr, input_brand);
        if(obj != null)
        {
            System.out.println();
            System.out.println(obj.getBrand() + " :: " + obj.getGrade());
        }
        else 
        {
            System.out.println();
            System.out.println("No Car is available with the specified brand");
        }


        sc.close();
    }

    public static int findTestPassedByEnv(AutonomousCar arr[] , String input_environment)
    {
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i].getEnvironment().equalsIgnoreCase(input_environment))
            {
                sum = sum + arr[i].getNoOfTestsPassed();
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

    public static AutonomousCar updateCarGrade(AutonomousCar arr[] , String input_brand)
    {
        int rating;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i].getBrand().equalsIgnoreCase(input_brand))
            {
                rating = (arr[i].getNoOfTestsPassed() * 100) / arr[i].getNoOfTestsConducted();
                if(rating > 80)
                {    
                    arr[i].setGrade("A1");
                }
                else
                {
                    arr[i].setGrade("B2");
                }

                return arr[i];
            }
        }
        
        return null;
    }
}