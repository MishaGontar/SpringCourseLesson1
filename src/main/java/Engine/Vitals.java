package Engine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Vitals implements Engine {
    private String name = "Vitals";
    private int power = 100;

    Vitals(String name) {
        this.name = name;
    }

    Vitals(int p) {
        this.power = p;
    }

    @Override
    public void run() {
        System.out.println("This is engine " + name + " with power: " + power);
    }
}
