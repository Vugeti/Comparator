import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import java.util.*;

public class CarTest {
    Car car3 = new Car(2017, 1600);
    Car car1 = new Car(2015, 2000);
    Car car2 = new Car(2019, 1400);

    @Test
    public void testListAndSort() {
        ArrayList<Car> sortCarList = new ArrayList<>();
        sortCarList.add(car3);
        sortCarList.add(car1);
        sortCarList.add(car2);
        Collections.sort(sortCarList);
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(car3);
        carList.add(car1);
        carList.add(car2);
        Assertions.assertNotEquals(sortCarList, carList);
    }

    @Test
    void testTreeSetAndSort() {

        TreeSet<Car> setSort = new TreeSet<>(Comparator.comparingInt(Car::getEngineCapacity));
        setSort.add(car3);
        setSort.add(car1);
        setSort.add(car2);
        TreeSet<Car> set2 = new TreeSet<>();
        set2.add(car3);
        set2.add(car1);
        set2.add(car2);
        Assertions.assertEquals(set2,setSort);
    }
}
