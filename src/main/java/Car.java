import java.awt.geom.Point2D;
import java.util.List;

public class Car implements Comparable<Car> {
    private final int yearOfManufacture;
    private final int engineCapacity;

    @Override
    public String toString() {
        return "Car {" +
                "year Of Manufacture = " + yearOfManufacture +
                ", engine Capacity = " + engineCapacity +
                '}';
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public Car(int yearOfManufacture, int engineCapacity) {
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public int compareTo(Car car2) {
        return this.yearOfManufacture-car2.yearOfManufacture;
//        if (this.engineCapacity == car2.getEngineCapacity()) {
//            return 0;
//        } else if ((this.engineCapacity < car2.getEngineCapacity())) {
//            return -1;
//        }
//        return 1;
    }
}

