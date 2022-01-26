package Tires;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rosava implements Tire {
    private String name = "Rosava";
    private String status = "good";
    private int price = 100;

    @Override
    public void printTire() {
        System.out.println("This is " + name);
    }
}
