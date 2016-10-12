package Builder;

/**
 * Created by Администратор on 12.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        director.setCarBuilder(getBuilder("s"));
        Car car  = director.buildCar();
        System.out.println(car);
    }
    static CarBuilder getBuilder(String nameCar){
        if (nameCar.equalsIgnoreCase("F"))
            return new Ford();
        else if (nameCar.equalsIgnoreCase("S"))
            return new Subaru();
        else throw new RuntimeException("No such car  " + nameCar);
    }
}

class Car{
    private String carName;
    private int price;
    private Colour colour;

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", price=" + price +
                ", colour=" + colour +
                '}';
    }
}
abstract class CarBuilder{
    Car car;

    void createCar(){
        car = new Car();
    }

    abstract void createCarName();
    abstract void createPrice();
    abstract void createColour();

    public Car getCar() {
        return car;
    }
}

class Ford extends CarBuilder{
    void createCarName() {
        car.setCarName("Ford");
    }

    void createPrice() {
        car.setPrice(5600);
    }

    void createColour() {
        car.setColour(Colour.BLUE);
    }
}
class Subaru extends CarBuilder{
    void createCarName() {
        car.setCarName("Subaru");
    }

    void createPrice() {
        car.setPrice(7800);
    }

    void createColour() {
        car.setColour(Colour.RED);
    }
}

class Director{
    CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    Car buildCar(){
        carBuilder.createCar();
        carBuilder.createCarName();
        carBuilder.createColour();
        carBuilder.createPrice();
        Car car = carBuilder.getCar();

        return car;
    }
}