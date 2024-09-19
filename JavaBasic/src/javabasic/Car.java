package javabasic;

public class Car {
//  Propertiese in the car class    

    String model;
    String brand;
    int speed; //default speed

    //constructor to set dynamic values
    Car(String model, String brand) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    // method to drive car, here i create a function
    void drive(int increaseSpeed) {
        speed += increaseSpeed;
        System.out.println(model + " " + "is driving " + speed + " kmph.");
    }

    void brake(int decreaseSpeed) {
        speed -= decreaseSpeed;
        if (speed < 0) {
            speed = 0;
        }

        System.out.println(model + " is breaking down to " + speed + " kmph.");
    }

    /*public static void main(String[] args) {//create 3 objectes
     Car car1 = new Car();
     System.out.println(car1.brand);
        
     Car car2 = new Car();
     System.out.println(car2.model);
        
     Car car3 = new Car();
     System.out.println(car3.model);
        
     car3.drive(134);
     car1.drive(123);
     }*/
}
