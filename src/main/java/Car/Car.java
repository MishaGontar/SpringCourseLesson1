package Car;

import Engine.Engine;
import Tires.Tire;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car implements CarI {
    private Tire tire;
    private Engine engine;

    public Car(Tire tire, Engine engine) {
        this.tire = tire;
        this.engine = engine;
    }

    @Override
    public void move() {
        engine.run();
        tire.printTire();
        System.out.println("I move");
    }
}
