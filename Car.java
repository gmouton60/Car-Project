/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Student Name: Gerald Mouton
//LSU ID: 894569516
//Lab Section:1
//Assignment Lab 2
//Submission Time: 5:25
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
