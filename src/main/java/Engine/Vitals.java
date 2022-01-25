package Engine;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vitals implements Engine {
    private String name = "Vitals";
    private int power = 100 ;

    Vitals(){}
    Vitals (String name){
        this.name = name;
    }
    Vitals (int p){
        this.power = p;
    }

    public Vitals(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void run() {
        System.out.println("This is engine " + name + " with power: " + power);
    }
}
