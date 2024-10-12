
public class MainExercise {
    public static void main(String[] args) {
        System.out.println("Brand: " + Car.brand);

        
        Car car1 = new Car("Golf", 150);
        Car car2 = new Car("Tiguan", 200);
        Car car3 = new Car("Passat", 180);
        Car car4 = new Car("Polo", 120);
        Car car5 = new Car("T-Cross", 150);
        Car car6 = new Car("Arteon", 320);
        Car car7 = new Car("T-Roc", 300);
        Car car8 = new Car("Touareg", 462);
        Car car9 = new Car("ID.3", 204);
        Car car10 = new Car("ID.4", 204);

        
        System.out.println("Car 1 - Model: " + car1.model + ", Horsepower: " + car1.horsepower);
        System.out.println("Car 2 - Model: " + car2.model + ", Horsepower: " + car2.horsepower);
        System.out.println("Car 3 - Model: " + car3.model + ", Horsepower: " + car3.horsepower);
        System.out.println("Car 4 - Model: " + car4.model + ", Horsepower: " + car4.horsepower);
        System.out.println("Car 5 - Model: " + car5.model + ", Horsepower: " + car5.horsepower);
        System.out.println("Car 6 - Model: " + car6.model + ", Horsepower: " + car6.horsepower);
        System.out.println("Car 7 - Model: " + car7.model + ", Horsepower: " + car7.horsepower);
        System.out.println("Car 8 - Model: " + car8.model + ", Horsepower: " + car8.horsepower);
        System.out.println("Car 9 - Model: " + car9.model + ", Horsepower: " + car9.horsepower);
        System.out.println("Car 10 - Model: " + car10.model + ", Horsepower: " + car10.horsepower);

        
        Car.braking();

        
        car1.accelerate();
        car2.accelerate();
        car3.accelerate();
        car4.accelerate();
        car5.accelerate();
        car6.accelerate();
        car7.accelerate();
        car8.accelerate();
        car9.accelerate();
        car10.accelerate();
    }
}


