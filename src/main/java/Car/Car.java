package Car;

import Engine.Engine;
import Tires.Tire;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Car implements CarI {
    private Tire tire;
    private Engine engine;

    @Override
    public void move() {
        engine.run();
        tire.printTire();
        System.out.println("I move");
    }
}
