package carproject;

/**
 *
 * @author gmouto6
 */
public class Car {
    //private member variables
    private long VIN;
    private String model;
    private int year;
    private double mileage;
    
    
    
    //default constructor
    public Car(){}
    
    
    //constructor that initializes private member variables
    public Car(long Vin, int Year, String Model)
    {
        VIN= Vin;
        model=Model;
        year=Year;
    }
    
    //initializes mileage
    public void setMileage(double miles)
    {
        mileage = miles;
    }
    
    //returns a string containing the car's year, VIN, model, and mileage
    public String getInfo()
    {
        return (year+" "+model+ " (VIN: "+VIN+", mileage: "+ mileage + " miles)");
    }
}
