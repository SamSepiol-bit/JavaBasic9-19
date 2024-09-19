/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javabasic;

/**
 *
 * @author hnd
 */
public class Bike {
    String brand = "Ducati";
    String model1 = "Panigala";
    int speed = 0;
    
    void ride(int increaseSpeed){
        speed += increaseSpeed;
        System.out.println(brand + " " +model1 + "  is riding at " + speed + "kmph.");
    }
    
    void brake(int decreaseSpeed){
        speed -= decreaseSpeed;
        if (speed<0){
            speed = 0;
        }
        
        System.out.println(brand + " " +model1 + " is slow down at " + speed + "kmph.");
    }
    
    public static void main(String[] args){
        Bike bike1 = new Bike();
        System.out.println(bike1.brand);
        
        Bike bike2 = new Bike();
        System.out.println(bike2.brand);
        
        bike1.ride(60);
        bike1.brake(40);
        bike2.ride(120);
        bike2.brake(50);
        
        
    }
    
}
