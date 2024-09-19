package Encapsulation;

public class Car {

    private String brand;
    private String model;
    private int speed;

    //      constructor
    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void drive(int increaseSpeed){
        speed += increaseSpeed;
        System.out.println(brand + " " + model + " is driveing at " + speed + " kmph");
    }
    
    public void brake(int decreaseSpeed){
        speed -= decreaseSpeed;
        if (speed < 0){
            speed = 0;
        }
        System.out.println(brand + " " + model + " is breaking down " +speed + " kmph");
    }
    
    
    
    
    
            

}
