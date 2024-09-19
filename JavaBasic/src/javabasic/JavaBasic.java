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
public class JavaBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create 3 objectes
        Car car1 = new Car("BMW", "M3");
        car1.drive(100);
        car1.brake(50);

        System.out.println("");

        Car car2 = new Car("Nissan", "Skyline");
        car2.drive(180);
        car2.brake(60);
    }
}
