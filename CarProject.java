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
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author gmouto6
 */
public class CarProject {

    /**
     * @param args the command line arguments
     */
    
    //Creates a file called carInfo and stores the car information on each line.
    public static void saveCarInfo(String carInfo) throws FileNotFoundException{
    
        PrintWriter outFile = new PrintWriter(new FileOutputStream(new File("carInfo.txt"),true));
        outFile.println(carInfo);
        
        outFile.close();
   }
    
    
    //call objects of car and initialize members of car including model, year, VIN, and mileage.
    //Call saveCarInfo to output information in file
    public static void main(String[] args)throws FileNotFoundException {
        // TODO code application logic here
        Car c1 = new Car(12313131, 2009, "Camry");
        c1.setMileage(60000);
        saveCarInfo(c1.getInfo());
        
        Car c2= new Car(95645421, 2010, "Accord");
        c2.setMileage(95000);
        saveCarInfo(c2.getInfo());
        
        Car c3 = new Car(45746587, 2019, "CX5");
        c3.setMileage(600);
        saveCarInfo(c3.getInfo());
    }
    
}
