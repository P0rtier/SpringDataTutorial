package pl.uzi.springdataexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private CarRepo carRepo;

    @Autowired
    public Start(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runExample(){
        Car car1 = new Car("Honda","Jazz",Color.RED);
        carRepo.save(car1);
        Car car2 = new Car("Audi","A1",Color.GRAY);
        carRepo.save(car2);
        Car car3 = new Car("Nokia","WhyNot",Color.BLUE);
        carRepo.save(car3);
//        Iterable<Car> all = carRepo.findAll();
//        all.forEach(System.out::println);
    }
}
