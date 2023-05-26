package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    private static final List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("model1","color1",2001));
        carList.add(new Car("model2","color2",2002));
        carList.add(new Car("model3","color3",2003));
        carList.add(new Car("model4","color4",2004));
        carList.add(new Car("model5","color5",2005));
        carList.add(new Car("model6","color6",2006));
    }
    @Override
    public List<Car> getCars(int count) {
        if (count == 0){
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
