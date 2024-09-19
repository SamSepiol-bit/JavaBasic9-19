/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Encapsulation;

/**
 *
 * @author hnd
 */
public class Main {
    public static void main(String[] args){
        Car car1 = new Car( "Benz","C200" );
        
        car1.drive(100);
        
        car1.brake(40);
        
        System.out.println( "Brand: " + car1.getBrand());
    }
    
}
