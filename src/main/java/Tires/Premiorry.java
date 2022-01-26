package Tires;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Premiorry implements Tire {
    private String name;
    private String status;
    private int price;
    private String color;

    @Override
    public void printTire() {
        System.out.println("This is " + name);
    }
}
