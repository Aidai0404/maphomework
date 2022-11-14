import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car,InfoCar>cars=new HashMap<>();
        cars.put(new Car(1,"AA67OP9"),new InfoCar(2005,"BMW","Black",450000));
        cars.put(new Car(2,"DF675P5"),new InfoCar(2010,"Skoda","White",350000));
        cars.put(new Car(3,"LA654P9"),new InfoCar(2017,"Mersedez Benz","Deep blue",950000));
        cars.put(new Car(4,"OR27OP2"),new InfoCar(2005,"Toyota Camri","Black",4550000));

        for(Map.Entry carsMap:cars.entrySet()){
             Car car=(Car) carsMap.getKey();
             InfoCar information=(InfoCar) carsMap.getValue();

            System.out.println(car);
            System.out.println(information);
        }
    }
}